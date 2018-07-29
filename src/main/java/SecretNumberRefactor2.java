public class SecretNumberRefactor2 {


    public static int getHorMove(Customer customer, Pinpad pinpad) {

        return customer.getDirectionNumber() - customer.getAnchorNumber();
    }
}
