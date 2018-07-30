public class SecretNumberRefactor2 {


    public static int getVerMove(Customer customer, Pinpad pinpad) {

        return customer.getDirectionNumber() % pinpad.getSquareSize() - customer.getAnchorNumber() % pinpad.getSquareSize();
    }

    public static int getHorMove(Customer customer, Pinpad pinpad) {
        return customer.getDirectionNumber() / pinpad.getSquareSize() - customer.getAnchorNumber() / pinpad.getSquareSize();
    }

    public static int getRowSec(Customer customer, Pinpad pinpad) {
        return 999;
    }

    public static int getSecNum(Customer customer, Pinpad pinpad) {

        //int midNum = pinpad.getArraySizeOfPinPad() / 2;
        int rowMov = getHorMove(customer, pinpad);
        int colMov = getVerMove(customer, pinpad);

        int rowMid = pinpad.getSquareSize() / 2;
        int colMid = pinpad.getSquareSize() / 2;

        int rowSec = (rowMid + rowMov) % pinpad.getSquareSize();
        int colSec = (pinpad.getSquareSize()+colMid + colMov) % pinpad.getSquareSize();

        int secNum = pinpad.get(rowSec*pinpad.getSquareSize()+colSec);

        return secNum;

    }
}
