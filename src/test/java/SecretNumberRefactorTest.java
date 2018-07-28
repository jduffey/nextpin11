import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class SecretNumberRefactorTest {

    @Test
    public void oneSingleRowArrayShouldMoveAnyNumberToTheRight() {
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
        Assert.assertEquals(25, SecretNumberRefactor.findSecretNumber(customer, pinpad));

        customer.setAnchorNumber(0);
        customer.setDirectionNumber(2);
        Assert.assertEquals(26, SecretNumberRefactor.findSecretNumber(customer, pinpad));

        customer.setAnchorNumber(0);
        customer.setDirectionNumber(3);
        Assert.assertEquals(27, SecretNumberRefactor.findSecretNumber(customer, pinpad));

        customer.setAnchorNumber(0);
        customer.setDirectionNumber(4);
        Assert.assertEquals(21, SecretNumberRefactor.findSecretNumber(customer, pinpad));

        customer.setAnchorNumber(0);
        customer.setDirectionNumber(5);
        Assert.assertEquals(22, SecretNumberRefactor.findSecretNumber(customer, pinpad));

        customer.setAnchorNumber(0);
        customer.setDirectionNumber(6);
        Assert.assertEquals(23, SecretNumberRefactor.findSecretNumber(customer, pinpad));
    }

}
