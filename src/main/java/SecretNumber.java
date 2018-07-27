public class SecretNumber {

    public static int findSecretNumber(Customer customer, Pinpad pinpad) {

        int anc = customer.getAnchorNumber();
        int dir = customer.getDirectionNumber();

        int posAnc = pinpad.getPosOfValue(anc);
        int posDir = pinpad.getPosOfValue(dir);

        int secretNumber = getSecretNumber(pinpad, posAnc, posDir);

        return secretNumber;

    }

    private static int getSecretNumber(Pinpad pinpad, int posAnc, int posDir) {

        int movementNumber;

        if (posAnc == 2 && posDir == 0) {
            movementNumber = 1;
        } else if (posAnc == 0 && posDir == 2) {
            movementNumber = -1;
        } else
            movementNumber = posDir - posAnc;

        return pinpad.get(4 + movementNumber);
    }
}
