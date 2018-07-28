public class SecretNumberRefactor {

    public static int findSecretNumber(Customer customer, Pinpad pinpad) {

        int sqrSiz = pinpad.getSquareSize();
        int posAnc = pinpad.getPosOfValue(customer.getAnchorNumber());
        int posDir = pinpad.getPosOfValue(customer.getDirectionNumber());
        int posMid = pinpad.getArraySizeOfPinPad() / 2;

        return (posMid / sqrSiz) * sqrSiz + (posMid + (posDir - posAnc)) % sqrSiz;

    }
}
