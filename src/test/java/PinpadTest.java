import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class PinpadTest {

    @Test
    public void shouldTakeArgumentForSizeOfThePinPad() {
        Pinpad pinPadArray = new Pinpad(3);
        Assert.assertNotNull(pinPadArray);
    }

    @Test
    public void pinArrayShouldHaveNumberOfElementsEqualToTheSquareOfTheSize() {
        Pinpad pinPadArray = new Pinpad(3);
        Assert.assertEquals(9, pinPadArray.getArraySizeOfPinPad());
    }

    @Test
    public void pinArrayShouldAllowDifferentSquareSizeAsArgument() {
        Pinpad pinPadArray1 = new Pinpad(4);
        Assert.assertEquals(16, pinPadArray1.getArraySizeOfPinPad());
        Pinpad pinPadArray2 = new Pinpad(5);
        Assert.assertEquals(25, pinPadArray2.getArraySizeOfPinPad());
        Pinpad pinPadArray3 = new Pinpad(6);
        Assert.assertEquals(36, pinPadArray3.getArraySizeOfPinPad());
        Pinpad pinPadArray4 = new Pinpad(7);
        Assert.assertEquals(49, pinPadArray4.getArraySizeOfPinPad());
    }

    @Test
    public void pinArrayShouldContainEachNumberFromZeroToTheSizeOfTheArrayMinusOne() {
        Pinpad pinPadArray1 = new Pinpad(3);
        for (int counter = 0; counter < pinPadArray1.getArraySizeOfPinPad(); counter++) {
            Assert.assertEquals(true, pinPadArray1.containsThisNumber(counter));
        }
        Pinpad pinPadArray2 = new Pinpad(9);
        for (int counter = 0; counter < pinPadArray2.getArraySizeOfPinPad(); counter++) {
            Assert.assertEquals(true, pinPadArray2.containsThisNumber(counter));
        }
    }

    @Test
    public void pinArrayShouldShuffleSuchThatTwoArraysOfSameSizeDoNotHaveTheSameArrangement() {
        int sizeOfSquare = 3;
        Pinpad pinPadArrayFirst = new Pinpad(sizeOfSquare);
        Pinpad pinPadArraySecond = new Pinpad(sizeOfSquare);
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
        Pinpad pinPadArray = new Pinpad(3);
        Assert.assertEquals(3, pinPadArray.getSquareSize());
    }

    @Test
    public void pinpadHasMethodToReturnArrayPositionOfGivenValue(){
        Pinpad pinpad = new Pinpad(3);
        ArrayList customArray1 = new ArrayList();
        for (int i = 0; i < pinpad.getSquareSize() * pinpad.getSquareSize(); i++) {
            customArray1.add(i);
        }
        pinpad.setCustomArray(pinpad.getSquareSize(), customArray1);
        System.out.println(customArray1);
        Assert.assertEquals(0,pinpad.getPosOfValue(0));
    }

    @Test
    public void canSetCustomPinpads() {
        int squareSize = 3;
        Pinpad pinpad1 = new Pinpad(squareSize);

        ArrayList customArray1 = new ArrayList();
        for (int i = 0; i < pinpad1.getSquareSize() * pinpad1.getSquareSize(); i++) {
            customArray1.add(i);
        }

        pinpad1.setCustomArray(squareSize, customArray1);
        for (int i = 0; i < pinpad1.getArraySizeOfPinPad(); i++) {
            Assert.assertEquals(i, pinpad1.getPosOfValue(i));
        }

        squareSize = 5;
        Pinpad pinpad2 = new Pinpad(squareSize);
        ArrayList customArray2 = new ArrayList();
        for (int i = 0; i < pinpad2.getSquareSize() * pinpad2.getSquareSize(); i++) {
            customArray2.add(i);
        }
        pinpad2.setCustomArray(squareSize, customArray2);
        for (int i = 0; i < pinpad1.getArraySizeOfPinPad(); i++) {
            Assert.assertEquals(i, pinpad1.getPosOfValue(i));
        }
    }

}

