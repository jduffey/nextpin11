import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {

    @Test
    public void shouldSetAndGetSecretNumber() {
        Customer customer = new Customer();
        customer.setAnchorNumber(0);
        Assert.assertEquals(0, customer.getAnchorNumber());
    }

    @Test
    public void shouldSetAndGetDirectionNumber() {
        Customer customer = new Customer();
        customer.setDirectionNumber(5);
        Assert.assertEquals(5, customer.getDirectionNumber());
    }

    @Test
    public void shouldSetAndGetPrefferedPinpadSize() {
        Customer customer = new Customer();
        customer.setPreferredPinpadSize(7);
        Assert.assertEquals(7, customer.getPreferredPinpadSize());
    }

}
