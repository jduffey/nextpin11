//package discarded;
//
//import org.junit.Assert;
//import org.junit.Test;
//
//import java.util.ArrayList;
//
//public class SecretNumberRefactorTest {
//
//    @Test
//    public void horizontalMovementOnlyShouldWorkProperly() {
//        Pinpad pinpad = new Pinpad(7);
//        Customer customer = new Customer();
//        ArrayList customArray = new ArrayList();
//
//        for (int i = 0; i < pinpad.getSquareSize() * pinpad.getSquareSize(); i++) {
//            customArray.add(i);
//        }
//        pinpad.setCustomArray(pinpad.getSquareSize(), customArray);
//        Displayer.displayPinpadSquare(pinpad);
//
//        customer.setAnchorNumber(0);
//        customer.setDirectionNumber(1);
//        Assert.assertEquals(25, SecretNumberRefactor.findSecretNumber(customer, pinpad));
//
//        customer.setAnchorNumber(0);
//        customer.setDirectionNumber(2);
//        Assert.assertEquals(26, SecretNumberRefactor.findSecretNumber(customer, pinpad));
//
//        customer.setAnchorNumber(0);
//        customer.setDirectionNumber(3);
//        Assert.assertEquals(27, SecretNumberRefactor.findSecretNumber(customer, pinpad));
//
//        customer.setAnchorNumber(0);
//        customer.setDirectionNumber(4);
//        Assert.assertEquals(21, SecretNumberRefactor.findSecretNumber(customer, pinpad));
//
//        customer.setAnchorNumber(0);
//        customer.setDirectionNumber(5);
//        Assert.assertEquals(22, SecretNumberRefactor.findSecretNumber(customer, pinpad));
//
//        customer.setAnchorNumber(0);
//        customer.setDirectionNumber(6);
//        Assert.assertEquals(23, SecretNumberRefactor.findSecretNumber(customer, pinpad));
//
//        customer.setAnchorNumber(48);
//        customer.setDirectionNumber(42);
//        Assert.assertEquals(25, SecretNumberRefactor.findSecretNumber(customer, pinpad));
//
//        customer.setAnchorNumber(48);
//        customer.setDirectionNumber(43);
//        Assert.assertEquals(26, SecretNumberRefactor.findSecretNumber(customer, pinpad));
//
//        customer.setAnchorNumber(48);
//        customer.setDirectionNumber(44);
//        Assert.assertEquals(27, SecretNumberRefactor.findSecretNumber(customer, pinpad));
//
//        customer.setAnchorNumber(48);
//        customer.setDirectionNumber(45);
//        Assert.assertEquals(21, SecretNumberRefactor.findSecretNumber(customer, pinpad));
//
//        customer.setAnchorNumber(48);
//        customer.setDirectionNumber(46);
//        Assert.assertEquals(22, SecretNumberRefactor.findSecretNumber(customer, pinpad));
//
//        customer.setAnchorNumber(48);
//        customer.setDirectionNumber(47);
//        Assert.assertEquals(23, SecretNumberRefactor.findSecretNumber(customer, pinpad));
//    }
//
//    @Test
//    public void verticalMovementOnlyShouldWorkProperly() {
//        Pinpad pinpad = new Pinpad(7);
//        Customer customer = new Customer();
//        ArrayList customArray = new ArrayList();
//
//        for (int i = 0; i < pinpad.getSquareSize() * pinpad.getSquareSize(); i++) {
//            customArray.add(i);
//        }
//        pinpad.setCustomArray(pinpad.getSquareSize(), customArray);
//        Displayer.displayPinpadSquare(pinpad);
//
//        customer.setAnchorNumber(0);
//        customer.setDirectionNumber(7);
//        Assert.assertEquals(31, SecretNumberRefactor.findSecretNumber(customer, pinpad));
//
//        customer.setAnchorNumber(0);
//        customer.setDirectionNumber(14);
//        Assert.assertEquals(38, SecretNumberRefactor.findSecretNumber(customer, pinpad));
//
//        customer.setAnchorNumber(0);
//        customer.setDirectionNumber(21);
//        Assert.assertEquals(45, SecretNumberRefactor.findSecretNumber(customer, pinpad));
//
//        customer.setAnchorNumber(0);
//        customer.setDirectionNumber(28);
//        Assert.assertEquals(3, SecretNumberRefactor.findSecretNumber(customer, pinpad));
//
//        customer.setAnchorNumber(0);
//        customer.setDirectionNumber(35);
//        Assert.assertEquals(10, SecretNumberRefactor.findSecretNumber(customer, pinpad));
//
//        customer.setAnchorNumber(0);
//        customer.setDirectionNumber(42);
//        Assert.assertEquals(17, SecretNumberRefactor.findSecretNumber(customer, pinpad));
//
//        customer.setAnchorNumber(48);
//        customer.setDirectionNumber(41);
//        Assert.assertEquals(17, SecretNumberRefactor.findSecretNumber(customer, pinpad));
//
//        customer.setAnchorNumber(48);
//        customer.setDirectionNumber(34);
//        Assert.assertEquals(10, SecretNumberRefactor.findSecretNumber(customer, pinpad));
//
//        customer.setAnchorNumber(48);
//        customer.setDirectionNumber(27);
//        Assert.assertEquals(3, SecretNumberRefactor.findSecretNumber(customer, pinpad));
//
//        customer.setAnchorNumber(48);
//        customer.setDirectionNumber(20);
//        Assert.assertEquals(45, SecretNumberRefactor.findSecretNumber(customer, pinpad));
//
//        customer.setAnchorNumber(48);
//        customer.setDirectionNumber(13);
//        Assert.assertEquals(38, SecretNumberRefactor.findSecretNumber(customer, pinpad));
//
//        customer.setAnchorNumber(48);
//        customer.setDirectionNumber(6);
//        Assert.assertEquals(31, SecretNumberRefactor.findSecretNumber(customer, pinpad));
//    }
//
//    @Test
//    public void horizontalAndVerticalCombinedMovementWorksProperly() {
//        Pinpad pinpad = new Pinpad(7);
//        Customer customer = new Customer();
//        ArrayList customArray = new ArrayList();
//
//        for (int i = 0; i < pinpad.getSquareSize() * pinpad.getSquareSize(); i++) {
//            customArray.add(i);
//        }
//        pinpad.setCustomArray(pinpad.getSquareSize(), customArray);
//        Displayer.displayPinpadSquare(pinpad);
//
//        customer.setAnchorNumber(0);
//        customer.setDirectionNumber(8);
//        Assert.assertEquals(32, SecretNumberRefactor.findSecretNumber(customer, pinpad));
//
//        customer.setAnchorNumber(0);
//        customer.setDirectionNumber(16);
//        Assert.assertEquals(40, SecretNumberRefactor.findSecretNumber(customer, pinpad));
//
//        customer.setAnchorNumber(0);
//        customer.setDirectionNumber(24);
//        Assert.assertEquals(48, SecretNumberRefactor.findSecretNumber(customer, pinpad));
//
//        customer.setAnchorNumber(0);
//        customer.setDirectionNumber(32);
//        Assert.assertEquals(0, SecretNumberRefactor.findSecretNumber(customer, pinpad));
//
//        customer.setAnchorNumber(0);
//        customer.setDirectionNumber(40);
//        Assert.assertEquals(8, SecretNumberRefactor.findSecretNumber(customer, pinpad));
//
//        customer.setAnchorNumber(0);
//        customer.setDirectionNumber(48);
//        Assert.assertEquals(16, SecretNumberRefactor.findSecretNumber(customer, pinpad));
//
//        customer.setAnchorNumber(48);
//        customer.setDirectionNumber(33);
//        Assert.assertEquals(9, SecretNumberRefactor.findSecretNumber(customer, pinpad));
//
//        customer.setAnchorNumber(48);
//        customer.setDirectionNumber(18);
//        Assert.assertEquals(43, SecretNumberRefactor.findSecretNumber(customer, pinpad));
//
////        customer.setAnchorNumber(42);
////        customer.setDirectionNumber(4);
////        Assert.assertEquals(28, discarded.SecretNumberRefactor.findSecretNumber(customer, pinpad));
//
//        customer.setAnchorNumber(42);
//        customer.setDirectionNumber(0);
//        Assert.assertEquals(31, SecretNumberRefactor.findSecretNumber(customer, pinpad));
//    }
//
//}
