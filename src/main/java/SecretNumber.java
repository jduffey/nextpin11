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

        if ((0 == (posAnc + 1) % pinpad.getSquareSize() && posDir == posAnc - (pinpad.getSquareSize() - 1))) {
            movementNumber = 1;
        } else if ((posAnc % pinpad.getSquareSize() == 0 && posDir == posAnc + (pinpad.getSquareSize() - 1))) {
            movementNumber = -1;
        } else
            movementNumber = posDir - posAnc;

        int positionOfMiddleOfPinpadSquare = pinpad.getArraySizeOfPinPad() / 2;

        return pinpad.get(positionOfMiddleOfPinpadSquare + movementNumber);
    }
}
