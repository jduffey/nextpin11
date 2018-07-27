import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class SecretNumberTest {

    @Test
    public void goRightOneMovementWithinArrayBounds() {
        Customer customer = new Customer();
        customer.setAnchorNumber(0);
        customer.setDirectionNumber(1);

        // Want to produce:
        // 0 1 2
        // 3 4 5
        // 6 7 8
        Pinpad pinpad = new Pinpad(3);
        ArrayList customArray1 = new ArrayList();
        for (int i = 0; i < pinpad.getSquareSize() * pinpad.getSquareSize(); i++) {
            customArray1.add(i);
        }
        pinpad.setCustomArray(pinpad.getSquareSize(), customArray1);

        // From 0 to 1 is "one right"
        // so from the center (4) we move one right
        // therefore secret number is 5
        App.displayPinpadSquare(pinpad);
        Assert.assertEquals(5, SecretNumber.findSecretNumber(customer, pinpad));
    }

    @Test
    public void goLeftOneMovementWithinArrayBounds() {
        Customer customer = new Customer();
        customer.setAnchorNumber(0);
        customer.setDirectionNumber(1);

        // Want to produce:
        // 1 0 2
        // 3 4 5
        // 6 7 8
        Pinpad pinpad = new Pinpad(3);
        ArrayList customArray1 = new ArrayList();
        customArray1.add(1);
        customArray1.add(0);
        customArray1.add(2);
        customArray1.add(3);
        customArray1.add(4);
        customArray1.add(5);
        customArray1.add(6);
        customArray1.add(7);
        customArray1.add(8);

        pinpad.setCustomArray(pinpad.getSquareSize(), customArray1);

        // From 0 to 1 is "one left"
        // so from the center (4) we move one left
        // therefore secret number is 3
        Assert.assertEquals(3, SecretNumber.findSecretNumber(customer, pinpad));
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
        App.displayPinpadSquare(pinpad);
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
        App.displayPinpadSquare(pinpad);
        Assert.assertEquals(2, SecretNumber.findSecretNumber(customer, pinpad));
    }

}
