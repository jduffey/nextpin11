import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {

    @Test
    public void shouldSetAndGetSecretNumber(){
        Customer customer = new Customer();
        customer.setSecretNumber(0);
        Assert.assertEquals(0,customer.getSecretNumber());
    }

    @Test
    public void shouldSetAndGetDirectionNumber(){
        Customer customer = new Customer();
        customer.setDirectionNumber(5);
        Assert.assertEquals(5,customer.getDirectionNumber());
    }

    @Test
    public void shouldSetAndGetSquareSize(){
        Customer customer = new Customer();
        customer.setSquareSize(3);
        Assert.assertEquals(3,customer.getSquareSize());
    }

}
