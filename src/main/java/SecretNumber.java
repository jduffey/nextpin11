public class SecretNumber {

    public static int getHorMove(Customer customer, Pinpad pinpad) {

        return pinpad.getPosOfValue(customer.getDirectionNumber()) % pinpad.getSquareSize() - pinpad.getPosOfValue(customer.getAnchorNumber()) % pinpad.getSquareSize();
    }

    public static int getVerMove(Customer customer, Pinpad pinpad) {
        return pinpad.getPosOfValue(customer.getDirectionNumber()) / pinpad.getSquareSize() - pinpad.getPosOfValue(customer.getAnchorNumber()) / pinpad.getSquareSize();
    }

    public static int getSecNum(Customer customer, Pinpad pinpad) {

        return identicalNavigationMethod(customer, pinpad);
    }

    private static int identicalNavigationMethod(Customer customer, Pinpad pinpad) {

        int interRowMov = getVerMove(customer, pinpad);
        int interColMov = getHorMove(customer, pinpad);

        int rowOfMiddleNumber = pinpad.getSquareSize() / 2;
        int colOfMiddleNumber = pinpad.getSquareSize() / 2;

        int rowOfSecretNumber = (pinpad.getSquareSize() + rowOfMiddleNumber + interRowMov) % pinpad.getSquareSize();
        int colOfSecretNumber = (pinpad.getSquareSize() + colOfMiddleNumber + interColMov) % pinpad.getSquareSize();

        return pinpad.get(rowOfSecretNumber * pinpad.getSquareSize() + colOfSecretNumber);
    }
}
