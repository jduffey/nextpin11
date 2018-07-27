public class SecretNumber {

    public static int findSecretNumber(Customer customer, Pinpad pinpad) {

        int posAnc = pinpad.getPosOfValue(customer.getAnchorNumber());
        int posDir = pinpad.getPosOfValue(customer.getDirectionNumber());

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
