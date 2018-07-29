public class SecretNumberRefactor {

    public static int findSecretNumber(Customer customer, Pinpad pinpad) {

        int sqrSiz = pinpad.getSquareSize();

        int posAnc = pinpad.getPosOfValue(customer.getAnchorNumber());
        int posDir = pinpad.getPosOfValue(customer.getDirectionNumber());

        getRow(sqrSiz, posAnc);
        getCol(sqrSiz, posAnc);
        getRow(sqrSiz, posDir);
        getCol(sqrSiz, posDir);


        int elementOfTheColumnAdjustmentFromTheMiddleNumber = applyHorizontalMovement(customer, pinpad);
        int elementOfTheRowAdjustmentFromTheMiddleNumber = applyVerticalMovement(customer, pinpad);

        int rowSec = elementOfTheRowAdjustmentFromTheMiddleNumber / pinpad.getSquareSize();
        int colSec = elementOfTheColumnAdjustmentFromTheMiddleNumber % pinpad.getSquareSize();

        int posSec = rowSec * pinpad.getSquareSize() + colSec;
        // = ((posMid / sqrSiz) * sqrSiz + (posMid + (posDir - posAnc)) % sqrSiz) % pinpad.getArraySizeOfPinPad()

        return pinpad.get(posSec);
    }

    private static int getCol(int sqrSiz, int posNumber) {
        return posNumber % sqrSiz;
    }

    private static int getRow(int sqrSiz, int posNumber) {
        return posNumber / sqrSiz;
    }

    public static int applyVerticalMovement(Customer customer, Pinpad pinpad) {

        int sqrSiz = pinpad.getSquareSize();
        int posAnc = pinpad.getPosOfValue(customer.getAnchorNumber());
        int posDir = pinpad.getPosOfValue(customer.getDirectionNumber());
        int posMid = pinpad.getArraySizeOfPinPad() / 2;

        return ((pinpad.getArraySizeOfPinPad() + (posMid + ((posDir - posAnc) / sqrSiz * sqrSiz)))) % pinpad.getArraySizeOfPinPad();
    }

    public static int applyHorizontalMovement(Customer customer, Pinpad pinpad) {

        int sqrSiz = pinpad.getSquareSize();
        int posAnc = pinpad.getPosOfValue(customer.getAnchorNumber());
        int posDir = pinpad.getPosOfValue(customer.getDirectionNumber());
        int posMid = pinpad.getArraySizeOfPinPad() / 2;

        return ((posMid / sqrSiz) * sqrSiz + (posMid + (posDir - posAnc)) % sqrSiz) % pinpad.getArraySizeOfPinPad();
    }
}
