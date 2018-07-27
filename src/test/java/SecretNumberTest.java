import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class SecretNumberTest {

    @Test
    public void goRightOneMovementWithinArrayBounds() {
        // Test case for square size 3
        Customer customer1 = new Customer();
        customer1.setAnchorNumber(0);
        customer1.setDirectionNumber(1);
        Pinpad pinpad1 = new Pinpad(3);
        ArrayList customArray1 = new ArrayList();
        for (int i = 0; i < pinpad1.getSquareSize() * pinpad1.getSquareSize(); i++) {
            customArray1.add(i);
        }
        pinpad1.setCustomArray(pinpad1.getSquareSize(), customArray1);
        Assert.assertEquals(5, SecretNumber.findSecretNumber(customer1, pinpad1));

        // Test case for square size 5
        Customer customer2 = new Customer();
        customer2.setAnchorNumber(0);
        customer2.setDirectionNumber(1);
        Pinpad pinpad2 = new Pinpad(5);
        ArrayList customArray2 = new ArrayList();
        for (int i = 0; i < pinpad2.getSquareSize() * pinpad2.getSquareSize(); i++) {
            customArray2.add(i);
        }
        pinpad2.setCustomArray(pinpad2.getSquareSize(), customArray2);
        Assert.assertEquals(13, SecretNumber.findSecretNumber(customer2, pinpad2));
    }

    @Test
    public void goLeftOneMovementWithinArrayBounds() {
        Customer customer1 = new Customer();
        customer1.setAnchorNumber(1);
        customer1.setDirectionNumber(0);
        Pinpad pinpad1 = new Pinpad(3);
        ArrayList customArray1 = new ArrayList();
        for (int i = 0; i < pinpad1.getSquareSize() * pinpad1.getSquareSize(); i++) {
            customArray1.add(i);
        }
        pinpad1.setCustomArray(pinpad1.getSquareSize(), customArray1);
        App.displayPinpadSquare(pinpad1);
        Assert.assertEquals(3, SecretNumber.findSecretNumber(customer1, pinpad1));

        Customer customer2 = new Customer();
        customer2.setAnchorNumber(1);
        customer2.setDirectionNumber(0);
        Pinpad pinpad2 = new Pinpad(5);
        ArrayList customArray2 = new ArrayList();
        for (int i = 0; i < pinpad2.getSquareSize() * pinpad2.getSquareSize(); i++) {
            customArray2.add(i);
        }
        pinpad2.setCustomArray(pinpad2.getSquareSize(), customArray2);
        Assert.assertEquals(11, SecretNumber.findSecretNumber(customer2, pinpad2));
    }

    @Test
    public void goDownOneMovementWithinArrayBounds() {
        Customer customer = new Customer();
        customer.setAnchorNumber(0);
        customer.setDirectionNumber(1);

        // Want to produce:
        // 4 0 2
        // 3 1 5
        // 6 7 8
        Pinpad pinpad = new Pinpad(3);
        ArrayList customArray1 = new ArrayList();
        customArray1.add(4);
        customArray1.add(0);
        customArray1.add(2);
        customArray1.add(3);
        customArray1.add(1);
        customArray1.add(5);
        customArray1.add(6);
        customArray1.add(7);
        customArray1.add(8);

        pinpad.setCustomArray(pinpad.getSquareSize(), customArray1);

        // From 0 to 1 is "one down"
        // so from the center (1) we move one down
        // therefore secret number is 7
        Assert.assertEquals(7, SecretNumber.findSecretNumber(customer, pinpad));
    }

    @Test
    public void goUpOneMovementWithinArrayBounds() {
        Customer customer = new Customer();
        customer.setAnchorNumber(0);
        customer.setDirectionNumber(1);

        // Want to produce:
        // 4 2 1
        // 3 5 0
        // 6 7 8
        Pinpad pinpad = new Pinpad(3);
        ArrayList customArray1 = new ArrayList();
        customArray1.add(4);
        customArray1.add(2);
        customArray1.add(1);
        customArray1.add(3);
        customArray1.add(5);
        customArray1.add(0);
        customArray1.add(6);
        customArray1.add(7);
        customArray1.add(8);

        pinpad.setCustomArray(pinpad.getSquareSize(), customArray1);

        // From 0 to 1 is "one up"
        // so from the center (5) we move one up
        // therefore secret number is 2
        Assert.assertEquals(2, SecretNumber.findSecretNumber(customer, pinpad));
    }

    @Test
    public void goOneRightToWrapAroundToBeginningOfThatRow() {
        Pinpad pinpad = new Pinpad(3);
        ArrayList customArray1 = new ArrayList();
        customArray1.add(1);
        customArray1.add(6);
        customArray1.add(0);
        customArray1.add(3);
        customArray1.add(5);
        customArray1.add(8);
        customArray1.add(2);
        customArray1.add(7);
        customArray1.add(4);
        pinpad.setCustomArray(pinpad.getSquareSize(), customArray1);
        App.displayPinpadSquare(pinpad);

        Customer customer1 = new Customer();
        customer1.setAnchorNumber(0);
        customer1.setDirectionNumber(1);
        Assert.assertEquals(8, SecretNumber.findSecretNumber(customer1, pinpad));

        Customer customer2 = new Customer();
        customer2.setAnchorNumber(8);
        customer2.setDirectionNumber(3);
        Assert.assertEquals(8, SecretNumber.findSecretNumber(customer2, pinpad));

        Customer customer3 = new Customer();
        customer3.setAnchorNumber(4);
        customer3.setDirectionNumber(2);
        Assert.assertEquals(8, SecretNumber.findSecretNumber(customer3, pinpad));
    }

    @Test
    public void goOneLeftToWrapAroundToEndOfThatRow() {
        Pinpad pinpad = new Pinpad(3);
        ArrayList customArray1 = new ArrayList();
        customArray1.add(0);
        customArray1.add(6);
        customArray1.add(1);
        customArray1.add(3);
        customArray1.add(5);
        customArray1.add(8);
        customArray1.add(2);
        customArray1.add(7);
        customArray1.add(4);
        pinpad.setCustomArray(pinpad.getSquareSize(), customArray1);
        App.displayPinpadSquare(pinpad);

        Customer customer1 = new Customer();
        customer1.setAnchorNumber(0);
        customer1.setDirectionNumber(1);
        Assert.assertEquals(3, SecretNumber.findSecretNumber(customer1, pinpad));

        Customer customer2 = new Customer();
        customer2.setAnchorNumber(3);
        customer2.setDirectionNumber(8);
        Assert.assertEquals(3, SecretNumber.findSecretNumber(customer2, pinpad));

        Customer customer3 = new Customer();
        customer3.setAnchorNumber(2);
        customer3.setDirectionNumber(4);
        Assert.assertEquals(3, SecretNumber.findSecretNumber(customer3, pinpad));
    }

}
