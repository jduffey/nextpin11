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

//    @Test
//    public void pinArrayShouldMatchSequentialValuesOf2DIntArray() {
//        Pinpad pinPadArray1 = new Pinpad(3);
//        for (int counter = 0; counter < pinPadArray1.getArraySizeOfPinPad(); counter++) {
//            Assert.assertEquals((int) pinPadArray1.get(counter),
//                    pinPadArray1.getFromIntArray((counter / pinPadArray1.getSquareSize()), (counter + pinPadArray1.getSquareSize()) % pinPadArray1.getSquareSize()));
//        }
//        Pinpad pinPadArray2 = new Pinpad(5);
//        for (int counter = 0; counter < pinPadArray2.getArraySizeOfPinPad(); counter++) {
//            Assert.assertEquals((int) pinPadArray2.get(counter),
//                    pinPadArray2.getFromIntArray((counter / pinPadArray2.getSquareSize()), (counter + pinPadArray2.getSquareSize()) % pinPadArray2.getSquareSize()));
//        }
//        Pinpad pinPadArray3 = new Pinpad(6);
//        for (int counter = 0; counter < pinPadArray3.getArraySizeOfPinPad(); counter++) {
//            Assert.assertEquals((int) pinPadArray3.get(counter),
//                    pinPadArray3.getFromIntArray((counter / pinPadArray3.getSquareSize()), (counter + pinPadArray3.getSquareSize()) % pinPadArray3.getSquareSize()));
//        }
//    }

//    @Test
//    public void shouldHaveMethodForConvertingToRowEquivalent() {
//        Pinpad pinpad1 = new Pinpad(3);
//        for (int i = 0; i < pinpad1.getSquareSize() * pinpad1.getSquareSize(); i++) {
//            Assert.assertEquals(i / pinpad1.getSquareSize(), pinpad1.rowOf(i));
//        }
//
//        Pinpad pinpad2 = new Pinpad(5);
//        for (int i = 0; i < pinpad2.getSquareSize() * pinpad2.getSquareSize(); i++) {
//            Assert.assertEquals(i / pinpad2.getSquareSize(), pinpad2.rowOf(i));
//        }
//    }

//    @Test
//    public void shouldHaveMethodForConvertingToColumnEquivalent() {
//        Pinpad pinpad1 = new Pinpad(3);
//        for (int i = 0; i < pinpad1.getSquareSize() * pinpad1.getSquareSize(); i++) {
//            Assert.assertEquals((i + pinpad1.getSquareSize()) % pinpad1.getSquareSize(), pinpad1.colOf(i));
//        }
//
//        Pinpad pinpad2 = new Pinpad(5);
//        for (int i = 0; i < pinpad2.getSquareSize() * pinpad2.getSquareSize(); i++) {
//            Assert.assertEquals((i + pinpad2.getSquareSize()) % pinpad2.getSquareSize(), pinpad2.colOf(i));
//        }
//    }

//    @Test
//    public void canSetCustomPinpads() {
//        int squareSize = 3;
//        Pinpad pinpad1 = new Pinpad(squareSize);
//        ArrayList customArray1 = new ArrayList();
//        for (int i = 0; i < pinpad1.getSquareSize() * pinpad1.getSquareSize(); i++) {
//            customArray1.add(i);
//        }
//        pinpad1.setCustomArray(squareSize, customArray1);
//        for (int i = 0; i < pinpad1.getSquareSize() * pinpad1.getSquareSize(); i++) {
//            Assert.assertEquals(i, pinpad1.getFromIntArray(i / pinpad1.getSquareSize(), (i + pinpad1.getSquareSize()) % pinpad1.getSquareSize()));
//        }
//
//        squareSize = 5;
//        Pinpad pinpad2 = new Pinpad(squareSize);
//        ArrayList customArray2 = new ArrayList();
//        for (int i = 0; i < pinpad2.getSquareSize() * pinpad2.getSquareSize(); i++) {
//            customArray2.add(i);
//        }
//        pinpad2.setCustomArray(squareSize, customArray2);
//        for (int i = 0; i < pinpad2.getSquareSize() * pinpad2.getSquareSize(); i++) {
//            Assert.assertEquals(i, pinpad2.getFromIntArray(i / pinpad2.getSquareSize(), (i + pinpad2.getSquareSize()) % pinpad2.getSquareSize()));
//        }
//    }

}

