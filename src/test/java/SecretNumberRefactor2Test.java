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
        Displayer.displayPinpadSquare(pinpad);

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
        Displayer.displayPinpadSquare(pinpad);

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

}
