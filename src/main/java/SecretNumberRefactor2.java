public class SecretNumberRefactor2 {

    public static int getHorMove(Customer customer, Pinpad pinpad) {

        return customer.getDirectionNumber() % pinpad.getSquareSize() - customer.getAnchorNumber() % pinpad.getSquareSize();
    }

    public static int getVerMove(Customer customer, Pinpad pinpad) {
        return customer.getDirectionNumber() / pinpad.getSquareSize() - customer.getAnchorNumber() / pinpad.getSquareSize();
    }

    public static int getSecNum(Customer customer, Pinpad pinpad) {

        int rowMov = getVerMove(customer, pinpad);
        int colMov = getHorMove(customer, pinpad);

        int rowMid = pinpad.getSquareSize() / 2;
        int colMid = pinpad.getSquareSize() / 2;

        int rowSec = (pinpad.getSquareSize() + rowMid + rowMov) % pinpad.getSquareSize();
        int colSec = (pinpad.getSquareSize() + colMid + colMov) % pinpad.getSquareSize();

        int secNumPos = pinpad.get(rowSec * pinpad.getSquareSize() + colSec);

        return pinpad.get(secNumPos);
    }
}
