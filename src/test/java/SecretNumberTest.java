import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class SecretNumberTest {

    @Test
    public void goRightOneMovementWithinArrayBounds() {
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
        Customer customer1 = new Customer();
        customer1.setAnchorNumber(0);
        customer1.setDirectionNumber(3);
        Pinpad pinpad1 = new Pinpad(3);
        ArrayList customArray1 = new ArrayList();
        for (int i = 0; i < pinpad1.getSquareSize() * pinpad1.getSquareSize(); i++) {
            customArray1.add(i);
        }
        pinpad1.setCustomArray(pinpad1.getSquareSize(), customArray1);
        Assert.assertEquals(7, SecretNumber.findSecretNumber(customer1, pinpad1));

        Customer customer2 = new Customer();
        customer2.setAnchorNumber(0);
        customer2.setDirectionNumber(5);
        Pinpad pinpad2 = new Pinpad(5);
        ArrayList customArray2 = new ArrayList();
        for (int i = 0; i < pinpad2.getSquareSize() * pinpad2.getSquareSize(); i++) {
            customArray2.add(i);
        }
        pinpad2.setCustomArray(pinpad2.getSquareSize(), customArray2);
        Assert.assertEquals(17, SecretNumber.findSecretNumber(customer2, pinpad2));
    }

    @Test
    public void goUpOneMovementWithinArrayBounds() {
        Customer customer1 = new Customer();
        customer1.setAnchorNumber(3);
        customer1.setDirectionNumber(0);
        Pinpad pinpad1 = new Pinpad(3);
        ArrayList customArray1 = new ArrayList();
        for (int i = 0; i < pinpad1.getSquareSize() * pinpad1.getSquareSize(); i++) {
            customArray1.add(i);
        }
        pinpad1.setCustomArray(pinpad1.getSquareSize(), customArray1);
        Assert.assertEquals(1, SecretNumber.findSecretNumber(customer1, pinpad1));

        Customer customer2 = new Customer();
        customer2.setAnchorNumber(5);
        customer2.setDirectionNumber(0);
        Pinpad pinpad2 = new Pinpad(5);
        ArrayList customArray2 = new ArrayList();
        for (int i = 0; i < pinpad2.getSquareSize() * pinpad2.getSquareSize(); i++) {
            customArray2.add(i);
        }
        pinpad2.setCustomArray(pinpad2.getSquareSize(), customArray2);
        Assert.assertEquals(7, SecretNumber.findSecretNumber(customer2, pinpad2));
    }

    @Test
    public void goOneRightToWrapAroundToBeginningOfThatRowOnSquareSize3() {
        Pinpad pinpad1 = new Pinpad(3);
        ArrayList customArray1 = new ArrayList();
        for (int i = 0; i < pinpad1.getSquareSize() * pinpad1.getSquareSize(); i++) {
            customArray1.add(i);
        }
        pinpad1.setCustomArray(pinpad1.getSquareSize(), customArray1);
        Customer customer1 = new Customer();
        customer1.setAnchorNumber(2);
        customer1.setDirectionNumber(0);
        Assert.assertEquals(5, SecretNumber.findSecretNumber(customer1, pinpad1));
        Customer customer2 = new Customer();
        customer2.setAnchorNumber(5);
        customer2.setDirectionNumber(3);
        Assert.assertEquals(5, SecretNumber.findSecretNumber(customer2, pinpad1));
        Customer customer3 = new Customer();
        customer3.setAnchorNumber(8);
        customer3.setDirectionNumber(6);
        Assert.assertEquals(5, SecretNumber.findSecretNumber(customer3, pinpad1));
    }

    @Test
    public void goOneRightToWrapAroundToBeginningOfThatRowOnSquareSize5(){
        Pinpad pinpad1 = new Pinpad(5);
        ArrayList customArray1 = new ArrayList();
        for (int i = 0; i < pinpad1.getSquareSize() * pinpad1.getSquareSize(); i++) {
            customArray1.add(i);
        }
        pinpad1.setCustomArray(pinpad1.getSquareSize(), customArray1);
        Customer customer4 = new Customer();
        customer4.setAnchorNumber(4);
        customer4.setDirectionNumber(0);
        Assert.assertEquals(13, SecretNumber.findSecretNumber(customer4, pinpad1));
        Customer customer5 = new Customer();
        customer5.setAnchorNumber(9);
        customer5.setDirectionNumber(5);
        Assert.assertEquals(13, SecretNumber.findSecretNumber(customer5, pinpad1));
        Customer customer6 = new Customer();
        customer6.setAnchorNumber(14);
        customer6.setDirectionNumber(10);
        Assert.assertEquals(13, SecretNumber.findSecretNumber(customer6, pinpad1));
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
