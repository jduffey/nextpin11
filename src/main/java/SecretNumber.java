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

        if (((pinpad.getSquareSize() - 1) == 2 && posDir == posAnc - 2) || (2 * (pinpad.getSquareSize()) - 1 == 5 && posDir == posAnc - 2) || (3 * (pinpad.getSquareSize()) - 1 == 8 && posDir == posAnc - 2)) {
            movementNumber = 1;
        } else if ((posAnc == 0 * pinpad.getSquareSize() && posDir == posAnc + 2) || (posAnc == 1 * pinpad.getSquareSize() && posDir == posAnc + 2) || (posAnc == 2 * pinpad.getSquareSize() && posDir == posAnc + 2)) {
            movementNumber = -1;
        } else
            movementNumber = posDir - posAnc;

        int positionOfMiddleOfPinpadSquare = pinpad.getArraySizeOfPinPad() / 2;

        return pinpad.get(positionOfMiddleOfPinpadSquare + movementNumber);
    }
}
