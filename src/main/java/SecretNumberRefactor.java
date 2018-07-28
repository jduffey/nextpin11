public class SecretNumberRefactor {

    public static int findSecretNumber(Customer customer, Pinpad pinpad) {

        int posAnc = pinpad.getPosOfValue(customer.getAnchorNumber());
        int posDir = pinpad.getPosOfValue(customer.getDirectionNumber());
        int positionOfMiddleOfPinpadSquare = pinpad.getArraySizeOfPinPad() / 2;

        return positionOfMiddleOfPinpadSquare + (posDir - posAnc);

    }
}
