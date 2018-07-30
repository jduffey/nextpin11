import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class SecretNumberRefactor2Test {

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
        Assert.assertEquals(1, SecretNumberRefactor2.getHorMove(customer, pinpad));

        customer.setAnchorNumber(0);
        customer.setDirectionNumber(2);
        Assert.assertEquals(2, SecretNumberRefactor2.getHorMove(customer, pinpad));

        customer.setAnchorNumber(6);
        customer.setDirectionNumber(0);
        Assert.assertEquals(-6, SecretNumberRefactor2.getHorMove(customer, pinpad));
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
        Assert.assertEquals(1, SecretNumberRefactor2.getHorMove(customer, pinpad));

        customer.setAnchorNumber(0);
        customer.setDirectionNumber(9);
        Assert.assertEquals(2, SecretNumberRefactor2.getHorMove(customer, pinpad));

        customer.setAnchorNumber(48);
        customer.setDirectionNumber(17);
        Assert.assertEquals(-3, SecretNumberRefactor2.getHorMove(customer, pinpad));
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
        Assert.assertEquals(1, SecretNumberRefactor2.getVerMove(customer, pinpad));

        customer.setAnchorNumber(0);
        customer.setDirectionNumber(14);
        Assert.assertEquals(2, SecretNumberRefactor2.getVerMove(customer, pinpad));

        customer.setAnchorNumber(42);
        customer.setDirectionNumber(0);
        Assert.assertEquals(-6, SecretNumberRefactor2.getVerMove(customer, pinpad));
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
        Assert.assertEquals(1, SecretNumberRefactor2.getVerMove(customer, pinpad));

        customer.setAnchorNumber(0);
        customer.setDirectionNumber(16);
        Assert.assertEquals(2, SecretNumberRefactor2.getVerMove(customer, pinpad));

        customer.setAnchorNumber(48);
        customer.setDirectionNumber(17);
        Assert.assertEquals(-4, SecretNumberRefactor2.getVerMove(customer, pinpad));
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
        Assert.assertEquals(25, SecretNumberRefactor2.getSecNum(customer, pinpad));

        customer.setAnchorNumber(0);
        customer.setDirectionNumber(2);
        Assert.assertEquals(26, SecretNumberRefactor2.getSecNum(customer, pinpad));

        customer.setAnchorNumber(0);
        customer.setDirectionNumber(4);
        Assert.assertEquals(21, SecretNumberRefactor2.getSecNum(customer, pinpad));

        customer.setAnchorNumber(6);
        customer.setDirectionNumber(2);
        Assert.assertEquals(27, SecretNumberRefactor2.getSecNum(customer, pinpad));

        customer.setAnchorNumber(27);
        customer.setDirectionNumber(21);
        Assert.assertEquals(25, SecretNumberRefactor2.getSecNum(customer, pinpad));

        customer.setAnchorNumber(43);
        customer.setDirectionNumber(47);
        Assert.assertEquals(21, SecretNumberRefactor2.getSecNum(customer, pinpad));
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
        Assert.assertEquals(31, SecretNumberRefactor2.getSecNum(customer, pinpad));

        customer.setAnchorNumber(0);
        customer.setDirectionNumber(14);
        Assert.assertEquals(38, SecretNumberRefactor2.getSecNum(customer, pinpad));

        customer.setAnchorNumber(0);
        customer.setDirectionNumber(28);
        Assert.assertEquals(3, SecretNumberRefactor2.getSecNum(customer, pinpad));

        customer.setAnchorNumber(48);
        customer.setDirectionNumber(6);
        Assert.assertEquals(31, SecretNumberRefactor2.getSecNum(customer, pinpad));

        customer.setAnchorNumber(39);
        customer.setDirectionNumber(11);
        Assert.assertEquals(45, SecretNumberRefactor2.getSecNum(customer, pinpad));
    }

}
