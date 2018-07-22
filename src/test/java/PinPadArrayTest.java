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
    public void pinArrayShouldMatchSequentialValuesOf2DIntArray(){
        PinPadArray pinPadArray = new PinPadArray(3);
        Assert.assertEquals(pinPadArray.get(0),pinPadArray.getFromIntArray(0,0));
        Assert.assertEquals(pinPadArray.get(1),pinPadArray.getFromIntArray(0,1));
        Assert.assertEquals(pinPadArray.get(2),pinPadArray.getFromIntArray(0,2));
        Assert.assertEquals(pinPadArray.get(3),pinPadArray.getFromIntArray(1,0));
        Assert.assertEquals(pinPadArray.get(4),pinPadArray.getFromIntArray(1,1));
        Assert.assertEquals(pinPadArray.get(5),pinPadArray.getFromIntArray(1,2));
        Assert.assertEquals(pinPadArray.get(6),pinPadArray.getFromIntArray(2,0));
        Assert.assertEquals(pinPadArray.get(7),pinPadArray.getFromIntArray(2,1));
        Assert.assertEquals(pinPadArray.get(8),pinPadArray.getFromIntArray(2,2));

    }
}

