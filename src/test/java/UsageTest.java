import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class UsageTest {

    @Test
    public void basicSquareSize3Example() {
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
        Assert.assertEquals(5, pinpad.getSecretNumber());
    }

}
