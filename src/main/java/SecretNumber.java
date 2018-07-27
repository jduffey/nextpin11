public class SecretNumber {

    public static int findSecretNumber(Customer customer, Pinpad pinpad) {

        int anc = customer.getAnchorNumber();
        int dir = customer.getDirectionNumber();

        int posAnc = pinpad.getPosOfValue(anc);
        int posDir = pinpad.getPosOfValue(dir);

        int movementNumber = posDir - posAnc;

        int secretNumber = pinpad.get(4 + movementNumber);

        return secretNumber;

    }
}
