import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class SecretNumberTest {

    // Does not yet work for shuffled pinpads, only straight ones

    @Test
    public void horizontalMovementOnSameRowShouldCalculateProperly() {
        Pinpad pinpad = new Pinpad(7);
        Customer customer = new Customer();
        ArrayList customArray = new ArrayList();

        for (int i = 0; i < pinpad.getSquareSize() * pinpad.getSquareSize(); i++) {
            customArray.add(i);
        }
        pinpad.setCustomArray(pinpad.getSquareSize(), customArray);

        customer.setAnchorNumber(0);
        customer.setDirectionNumber(1);
        Assert.assertEquals(1, SecretNumber.getHorMove(customer, pinpad));

        customer.setAnchorNumber(0);
        customer.setDirectionNumber(2);
        Assert.assertEquals(2, SecretNumber.getHorMove(customer, pinpad));

        customer.setAnchorNumber(6);
        customer.setDirectionNumber(0);
        Assert.assertEquals(-6, SecretNumber.getHorMove(customer, pinpad));
    }

    @Test
    public void horizontalMovementOnWithDirNumberOnDifferentRowShouldCalculateProperly() {
        Pinpad pinpad = new Pinpad(7);
        Customer customer = new Customer();
        ArrayList customArray = new ArrayList();

        for (int i = 0; i < pinpad.getSquareSize() * pinpad.getSquareSize(); i++) {
            customArray.add(i);
        }
        pinpad.setCustomArray(pinpad.getSquareSize(), customArray);

        customer.setAnchorNumber(0);
        customer.setDirectionNumber(8);
        Assert.assertEquals(1, SecretNumber.getHorMove(customer, pinpad));

        customer.setAnchorNumber(0);
        customer.setDirectionNumber(9);
        Assert.assertEquals(2, SecretNumber.getHorMove(customer, pinpad));

        customer.setAnchorNumber(48);
        customer.setDirectionNumber(17);
        Assert.assertEquals(-3, SecretNumber.getHorMove(customer, pinpad));
    }

    @Test
    public void verticalMovementOnSameColumnShouldCalculateProperly() {
        Pinpad pinpad = new Pinpad(7);
        Customer customer = new Customer();
        ArrayList customArray = new ArrayList();

        for (int i = 0; i < pinpad.getSquareSize() * pinpad.getSquareSize(); i++) {
            customArray.add(i);
        }
        pinpad.setCustomArray(pinpad.getSquareSize(), customArray);

        customer.setAnchorNumber(0);
        customer.setDirectionNumber(7);
        Assert.assertEquals(1, SecretNumber.getVerMove(customer, pinpad));

        customer.setAnchorNumber(0);
        customer.setDirectionNumber(14);
        Assert.assertEquals(2, SecretNumber.getVerMove(customer, pinpad));

        customer.setAnchorNumber(42);
        customer.setDirectionNumber(0);
        Assert.assertEquals(-6, SecretNumber.getVerMove(customer, pinpad));
    }

    @Test
    public void verticalMovementWithDirNumberOnDifferentColumnShouldCalculateProperly() {
        Pinpad pinpad = new Pinpad(7);
        Customer customer = new Customer();
        ArrayList customArray = new ArrayList();

        for (int i = 0; i < pinpad.getSquareSize() * pinpad.getSquareSize(); i++) {
            customArray.add(i);
        }
        pinpad.setCustomArray(pinpad.getSquareSize(), customArray);

        customer.setAnchorNumber(0);
        customer.setDirectionNumber(8);
        Assert.assertEquals(1, SecretNumber.getVerMove(customer, pinpad));

        customer.setAnchorNumber(0);
        customer.setDirectionNumber(16);
        Assert.assertEquals(2, SecretNumber.getVerMove(customer, pinpad));

        customer.setAnchorNumber(48);
        customer.setDirectionNumber(17);
        Assert.assertEquals(-4, SecretNumber.getVerMove(customer, pinpad));
    }

    @Test
    public void secretNumberCanBeFoundGivenOnlyHorizontalMovement() {
        Pinpad pinpad = new Pinpad(7);
        Customer customer = new Customer();
        ArrayList customArray = new ArrayList();

        for (int i = 0; i < pinpad.getSquareSize() * pinpad.getSquareSize(); i++) {
            customArray.add(i);
        }
        pinpad.setCustomArray(pinpad.getSquareSize(), customArray);
        Displayer.displayPinpadSquare(pinpad);

        customer.setAnchorNumber(0);
        customer.setDirectionNumber(1);
        Assert.assertEquals(25, SecretNumber.getSecNum(customer, pinpad));

        customer.setAnchorNumber(0);
        customer.setDirectionNumber(2);
        Assert.assertEquals(26, SecretNumber.getSecNum(customer, pinpad));

        customer.setAnchorNumber(0);
        customer.setDirectionNumber(4);
        Assert.assertEquals(21, SecretNumber.getSecNum(customer, pinpad));

        customer.setAnchorNumber(6);
        customer.setDirectionNumber(2);
        Assert.assertEquals(27, SecretNumber.getSecNum(customer, pinpad));

        customer.setAnchorNumber(27);
        customer.setDirectionNumber(21);
        Assert.assertEquals(25, SecretNumber.getSecNum(customer, pinpad));

        customer.setAnchorNumber(43);
        customer.setDirectionNumber(47);
        Assert.assertEquals(21, SecretNumber.getSecNum(customer, pinpad));
    }

    @Test
    public void secretNumberCanBeFoundGivenOnlyVerticalMovement() {
        Pinpad pinpad = new Pinpad(7);
        Customer customer = new Customer();
        ArrayList customArray = new ArrayList();

        for (int i = 0; i < pinpad.getSquareSize() * pinpad.getSquareSize(); i++) {
            customArray.add(i);
        }
        pinpad.setCustomArray(pinpad.getSquareSize(), customArray);
        Displayer.displayPinpadSquare(pinpad);

        customer.setAnchorNumber(0);
        customer.setDirectionNumber(7);
        Assert.assertEquals(31, SecretNumber.getSecNum(customer, pinpad));

        customer.setAnchorNumber(0);
        customer.setDirectionNumber(14);
        Assert.assertEquals(38, SecretNumber.getSecNum(customer, pinpad));

        customer.setAnchorNumber(0);
        customer.setDirectionNumber(28);
        Assert.assertEquals(3, SecretNumber.getSecNum(customer, pinpad));

        customer.setAnchorNumber(48);
        customer.setDirectionNumber(6);
        Assert.assertEquals(31, SecretNumber.getSecNum(customer, pinpad));

        customer.setAnchorNumber(39);
        customer.setDirectionNumber(11);
        Assert.assertEquals(45, SecretNumber.getSecNum(customer, pinpad));
    }

    @Test
    public void secretNumberCanBeFoundWithVerticalAndHorizontalMovement() {
        Pinpad pinpad = new Pinpad(7);
        Customer customer = new Customer();
        ArrayList customArray = new ArrayList();

        for (int i = 0; i < pinpad.getSquareSize() * pinpad.getSquareSize(); i++) {
            customArray.add(i);
        }
        pinpad.setCustomArray(pinpad.getSquareSize(), customArray);
        Displayer.displayPinpadSquare(pinpad);

        customer.setAnchorNumber(0);
        customer.setDirectionNumber(8);
        Assert.assertEquals(32, SecretNumber.getSecNum(customer, pinpad));

        customer.setAnchorNumber(0);
        customer.setDirectionNumber(48);
        Assert.assertEquals(16, SecretNumber.getSecNum(customer, pinpad));

        customer.setAnchorNumber(40);
        customer.setDirectionNumber(6);
        Assert.assertEquals(39, SecretNumber.getSecNum(customer, pinpad));

        customer.setAnchorNumber(36);
        customer.setDirectionNumber(12);
        Assert.assertEquals(42, SecretNumber.getSecNum(customer, pinpad));

        customer.setAnchorNumber(29);
        customer.setDirectionNumber(13);
        Assert.assertEquals(1, SecretNumber.getSecNum(customer, pinpad));

        customer.setAnchorNumber(0);
        customer.setDirectionNumber(1);
        Assert.assertEquals(25, SecretNumber.getSecNum(customer, pinpad));
    }

    @Test
    public void secretNumberCanBeFoundOnShuffledPinpads() {
        Pinpad pinpad = new Pinpad(7);
        Customer customer = new Customer();

        int[] customIntArray = new int[]{25, 43, 11, 35, 38, 34, 30, 23, 44, 3, 4, 14, 32, 9, 22, 40, 45, 29, 26, 21, 36, 15, 8, 7, 16, 47, 42, 2, 39, 13, 6, 10, 24, 1, 37, 17, 48, 20, 31, 19, 41, 33, 5, 12, 18, 0, 27, 28, 46};
        ArrayList customArray = new ArrayList();

        for (int i = 0; i < pinpad.getSquareSize() * pinpad.getSquareSize(); i++) {
            customArray.add(customIntArray[i]);
        }
        pinpad.setCustomArray(pinpad.getSquareSize(), customArray);
        Displayer.displayPinpadSquare(pinpad);

        customer.setAnchorNumber(0);
        customer.setDirectionNumber(1);
        Assert.assertEquals(32, SecretNumber.getSecNum(customer,pinpad));
    }

    @Test
    public void secretNumberCanBeFoundOnShuffledPinpadsMoreTests01() {
        Pinpad pinpad = new Pinpad(7);
        Customer customer = new Customer();

        int[] customIntArray = new int[]{28,40,11,30,3,17,37,21,15,7,20,8,16,45,12,19,14,42,31,5,26,35,34,29,10,9,18,23,4,2,46,1,24,0,25,33,48,38,36,39,6,22,44,13,27,43,32,47,41};
        ArrayList customArray = new ArrayList();

        for (int i = 0; i < pinpad.getSquareSize() * pinpad.getSquareSize(); i++) {
            customArray.add(customIntArray[i]);
        }
        pinpad.setCustomArray(pinpad.getSquareSize(), customArray);
        Displayer.displayPinpadSquare(pinpad);

        customer.setAnchorNumber(0);
        customer.setDirectionNumber(1);
        Assert.assertEquals(34, SecretNumber.getSecNum(customer,pinpad));
    }

    @Test
    public void secretNumberCanBeFoundOnShuffledPinpadsMoreTests02() {
        Pinpad pinpad = new Pinpad(7);
        Customer customer = new Customer();

        int[] customIntArray = new int[]{13,16,0,39,21,9,36,47,3,7,32,15,5,42,28,19,38,26,43,18,31,23,35,27,25,8,44,30,45,17,11,48,41,14,20,1,4,2,10,6,40,22,34,33,46,37,12,29,24};
        ArrayList customArray = new ArrayList();

        for (int i = 0; i < pinpad.getSquareSize() * pinpad.getSquareSize(); i++) {
            customArray.add(customIntArray[i]);
        }
        pinpad.setCustomArray(pinpad.getSquareSize(), customArray);
        Displayer.displayPinpadSquare(pinpad);

        customer.setAnchorNumber(0);
        customer.setDirectionNumber(1);
        Assert.assertEquals(3, SecretNumber.getSecNum(customer,pinpad));
    }

    @Test
    public void secretNumberCanBeFoundOnShuffledPinpadsMoreTests03() {
        Pinpad pinpad = new Pinpad(7);
        Customer customer = new Customer();

        int[] customIntArray = new int[]{11,10,21,39,14,4,27,36,38,45,5,20,22,24,31,6,18,1,23,0,35,42,41,34,15,2,48,28,30,33,7,32,37,29,43,13,26,16,8,3,19,46,17,44,12,47,40,25,9};
        ArrayList customArray = new ArrayList();

        for (int i = 0; i < pinpad.getSquareSize() * pinpad.getSquareSize(); i++) {
            customArray.add(customIntArray[i]);
        }
        pinpad.setCustomArray(pinpad.getSquareSize(), customArray);
        Displayer.displayPinpadSquare(pinpad);

        customer.setAnchorNumber(0);
        customer.setDirectionNumber(1);
        Assert.assertEquals(41, SecretNumber.getSecNum(customer,pinpad));
    }

}
