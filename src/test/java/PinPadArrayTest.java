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
    public void pinArrayShouldAllowDifferentSquareSizeAsArgument() {
        PinPadArray pinPadArray1 = new PinPadArray(4);
        Assert.assertEquals(16, pinPadArray1.getArraySizeOfPinPad());
        PinPadArray pinPadArray2 = new PinPadArray(5);
        Assert.assertEquals(25, pinPadArray2.getArraySizeOfPinPad());
        PinPadArray pinPadArray3 = new PinPadArray(6);
        Assert.assertEquals(36, pinPadArray3.getArraySizeOfPinPad());
        PinPadArray pinPadArray4 = new PinPadArray(7);
        Assert.assertEquals(49, pinPadArray4.getArraySizeOfPinPad());
    }

    @Test
    public void pinArrayShouldContainEachNumberFromZeroToTheSizeOfTheArrayMinusOne() {
        PinPadArray pinPadArray1 = new PinPadArray(3);
        for (int counter = 0; counter < pinPadArray1.getArraySizeOfPinPad(); counter++) {
            Assert.assertEquals(true, pinPadArray1.containsThisNumber(counter));
        }
        PinPadArray pinPadArray2 = new PinPadArray(9);
        for (int counter = 0; counter < pinPadArray2.getArraySizeOfPinPad(); counter++) {
            Assert.assertEquals(true, pinPadArray2.containsThisNumber(counter));
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
        PinPadArray pinPadArray1 = new PinPadArray(3);
        for (int counter = 0; counter < pinPadArray1.getArraySizeOfPinPad(); counter++) {
            Assert.assertEquals((int) pinPadArray1.get(counter),
                    pinPadArray1.getFromIntArray((counter / pinPadArray1.getSquareSize()), (counter + pinPadArray1.getSquareSize()) % pinPadArray1.getSquareSize()));
        }
        PinPadArray pinPadArray2 = new PinPadArray(5);
        for (int counter = 0; counter < pinPadArray2.getArraySizeOfPinPad(); counter++) {
            Assert.assertEquals((int) pinPadArray2.get(counter),
                    pinPadArray2.getFromIntArray((counter / pinPadArray2.getSquareSize()), (counter + pinPadArray2.getSquareSize()) % pinPadArray2.getSquareSize()));
        }
        PinPadArray pinPadArray3 = new PinPadArray(6);
        for (int counter = 0; counter < pinPadArray3.getArraySizeOfPinPad(); counter++) {
            Assert.assertEquals((int) pinPadArray3.get(counter),
                    pinPadArray3.getFromIntArray((counter / pinPadArray3.getSquareSize()), (counter + pinPadArray3.getSquareSize()) % pinPadArray3.getSquareSize()));
        }
    }

    @Test
    public void shouldHaveMethodForConvertingToRowEquivalent() {
        PinPadArray pinPadArray1 = new PinPadArray(3);
        Assert.assertEquals(0, pinPadArray1.rowOf(0));
        Assert.assertEquals(0, pinPadArray1.rowOf(1));
        Assert.assertEquals(0, pinPadArray1.rowOf(2));
        Assert.assertEquals(1, pinPadArray1.rowOf(3));
        Assert.assertEquals(1, pinPadArray1.rowOf(4));
        Assert.assertEquals(1, pinPadArray1.rowOf(5));
        Assert.assertEquals(2, pinPadArray1.rowOf(6));
        Assert.assertEquals(2, pinPadArray1.rowOf(7));
        Assert.assertEquals(2, pinPadArray1.rowOf(8));
        PinPadArray pinPadArray2 = new PinPadArray(5);
        Assert.assertEquals(0, pinPadArray2.rowOf(0));
        Assert.assertEquals(0, pinPadArray2.rowOf(1));
        Assert.assertEquals(0, pinPadArray2.rowOf(2));
        Assert.assertEquals(0, pinPadArray2.rowOf(3));
        Assert.assertEquals(0, pinPadArray2.rowOf(4));
        Assert.assertEquals(1, pinPadArray2.rowOf(5));
        Assert.assertEquals(1, pinPadArray2.rowOf(6));
        Assert.assertEquals(1, pinPadArray2.rowOf(7));
        Assert.assertEquals(1, pinPadArray2.rowOf(8));
        Assert.assertEquals(1, pinPadArray2.rowOf(9));
        Assert.assertEquals(2, pinPadArray2.rowOf(10));
        Assert.assertEquals(2, pinPadArray2.rowOf(11));
        Assert.assertEquals(2, pinPadArray2.rowOf(12));
        Assert.assertEquals(2, pinPadArray2.rowOf(13));
        Assert.assertEquals(2, pinPadArray2.rowOf(14));
        Assert.assertEquals(3, pinPadArray2.rowOf(15));
        Assert.assertEquals(3, pinPadArray2.rowOf(16));
        Assert.assertEquals(3, pinPadArray2.rowOf(17));
        Assert.assertEquals(3, pinPadArray2.rowOf(18));
        Assert.assertEquals(3, pinPadArray2.rowOf(19));
        Assert.assertEquals(4, pinPadArray2.rowOf(20));
        Assert.assertEquals(4, pinPadArray2.rowOf(21));
        Assert.assertEquals(4, pinPadArray2.rowOf(22));
        Assert.assertEquals(4, pinPadArray2.rowOf(23));
        Assert.assertEquals(4, pinPadArray2.rowOf(24));
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

