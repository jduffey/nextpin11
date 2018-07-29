public class SecretNumberRefactor2 {


    public static int getHorMove(Customer customer, Pinpad pinpad) {

        return (customer.getDirectionNumber() % pinpad.getSquareSize()) - (customer.getAnchorNumber() % pinpad.getSquareSize());
    }

}
