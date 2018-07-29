public class SecretNumberRefactor {

    public static int findSecretNumber(Customer customer, Pinpad pinpad) {

        int elementOfTheColumnAdjustmentFromTheMiddleNumber = applyHorizontalMovement(customer, pinpad) % pinpad.getArraySizeOfPinPad();
        int elementOfTheRowAdjustmentFromTheMiddleNumber = applyVerticalMovement(customer, pinpad) % pinpad.getArraySizeOfPinPad();

        int rowSec = elementOfTheRowAdjustmentFromTheMiddleNumber / pinpad.getSquareSize();
        int colSec = elementOfTheColumnAdjustmentFromTheMiddleNumber % pinpad.getSquareSize();

        int posSec = rowSec * pinpad.getSquareSize() + colSec;

        return pinpad.get(posSec);
    }

    private static int applyVerticalMovement(Customer customer, Pinpad pinpad) {

        int sqrSiz = pinpad.getSquareSize();
        int posAnc = pinpad.getPosOfValue(customer.getAnchorNumber());
        int posDir = pinpad.getPosOfValue(customer.getDirectionNumber());
        int posMid = pinpad.getArraySizeOfPinPad() / 2;

        return (pinpad.getArraySizeOfPinPad() + (posMid + ((posDir - posAnc) / sqrSiz * sqrSiz)));
    }

    private static int applyHorizontalMovement(Customer customer, Pinpad pinpad) {

        int sqrSiz = pinpad.getSquareSize();
        int posAnc = pinpad.getPosOfValue(customer.getAnchorNumber());
        int posDir = pinpad.getPosOfValue(customer.getDirectionNumber());
        int posMid = pinpad.getArraySizeOfPinPad() / 2;

        return (posMid / sqrSiz) * sqrSiz + (posMid + (posDir - posAnc)) % sqrSiz;
    }
}
