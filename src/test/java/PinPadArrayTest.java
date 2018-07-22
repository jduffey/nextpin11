import org.junit.Assert;
import org.junit.Test;

public class PinPadArrayTest {

    @Test
    public void shouldTakeArgumentForSizeOfThePinPad() {
        PinPadArray pinPadArray = new PinPadArray(3);
        Assert.assertNotNull(pinPadArray);
    }

    @Test
    public void pinArrayShouldHaveNumberOfElementsEqualToTheSquareOfTheSize() {
        PinPadArray pinPadArray = new PinPadArray(3);
        Assert.assertEquals(9, pinPadArray.getArraySizeOfPinPad());
    }

    @Test
    public void pinArrayShouldTakeDifferentSquareSizeAsArgument() {
        PinPadArray pinPadArray = new PinPadArray(5);
        Assert.assertEquals(25, pinPadArray.getArraySizeOfPinPad());
    }

    @Test
    public void pinArrayShouldContainEachNumberFromZeroToTheSizeOfTheArrayMinusOne() {
        PinPadArray pinPadArray = new PinPadArray(3);
        for (int counter = 0; counter < pinPadArray.getArraySizeOfPinPad(); counter++) {
            Assert.assertEquals(true, pinPadArray.containsThisNumber(counter));
        }
    }

    @Test
    public void pinArrayShouldShuffleSuchThatTwoArraysOfSameSizeDoNotHaveTheSameArrangement() {
        PinPadArray pinPadArrayFirst = new PinPadArray(3);
        PinPadArray pinPadArraySecond = new PinPadArray(3);
        Assert.assertTrue(pinPadArrayFirst.getArraySizeOfPinPad() == pinPadArraySecond.getArraySizeOfPinPad());
        boolean atLeastOneElementIsNotTheSame = false;
        for (int counter = 0; counter < pinPadArrayFirst.getArraySizeOfPinPad(); counter++) {
            if (pinPadArrayFirst.get(counter) != pinPadArraySecond.get(counter)) {
                atLeastOneElementIsNotTheSame = true;
                break;
            }
        }
        Assert.assertTrue(atLeastOneElementIsNotTheSame);
    }

    @Test
    public void pinpadHasMethodToReturnSquareSize() {
        PinPadArray pinPadArray = new PinPadArray(3);
        Assert.assertEquals(3, pinPadArray.getSquareSize());
    }

    @Test
    public void pinArrayShouldMatchSequentialValuesOf2DIntArray() {
        PinPadArray pinPadArray = new PinPadArray(3);
        for (int counter = 0; counter < pinPadArray.getArraySizeOfPinPad(); counter++) {
            Assert.assertEquals((int) pinPadArray.get(counter),
                    pinPadArray.getFromIntArray((counter / pinPadArray.getSquareSize()), (counter + 3) % pinPadArray.getSquareSize()));
        }
    }

    @Test
    public void shouldHaveMethodForConvertingToRowEquivalent() {
        PinPadArray pinPadArray = new PinPadArray(3);
        Assert.assertEquals(0, pinPadArray.rowOf(0));
        Assert.assertEquals(0, pinPadArray.rowOf(1));
        Assert.assertEquals(0, pinPadArray.rowOf(2));
        Assert.assertEquals(1, pinPadArray.rowOf(3));
        Assert.assertEquals(1, pinPadArray.rowOf(4));
        Assert.assertEquals(1, pinPadArray.rowOf(5));
        Assert.assertEquals(2, pinPadArray.rowOf(6));
        Assert.assertEquals(2, pinPadArray.rowOf(7));
        Assert.assertEquals(2, pinPadArray.rowOf(8));
    }

    @Test
    public void shouldHaveMethodForConvertingToColumnEquivalent() {
        PinPadArray pinPadArray = new PinPadArray(3);
        Assert.assertEquals(0, pinPadArray.colOf(0));
        Assert.assertEquals(1, pinPadArray.colOf(1));
        Assert.assertEquals(2, pinPadArray.colOf(2));
        Assert.assertEquals(0, pinPadArray.colOf(3));
        Assert.assertEquals(1, pinPadArray.colOf(4));
        Assert.assertEquals(2, pinPadArray.colOf(5));
        Assert.assertEquals(0, pinPadArray.colOf(6));
        Assert.assertEquals(1, pinPadArray.colOf(7));
        Assert.assertEquals(2, pinPadArray.colOf(8));
    }
}

