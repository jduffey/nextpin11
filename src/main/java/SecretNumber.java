public class SecretNumber {

    public static int getHorMove(Customer customer, Pinpad pinpad) {

        return pinpad.getPosOfValue(customer.getDirectionNumber()) % pinpad.getSquareSize() - pinpad.getPosOfValue(customer.getAnchorNumber()) % pinpad.getSquareSize();
    }

    public static int getVerMove(Customer customer, Pinpad pinpad) {
        return pinpad.getPosOfValue(customer.getDirectionNumber()) / pinpad.getSquareSize() - pinpad.getPosOfValue(customer.getAnchorNumber()) / pinpad.getSquareSize();
    }

    public static int getSecNum(Customer customer, Pinpad pinpad) {

        return identicalNavigationMethodFromMiddleNumberGivenAnchorAndDirectionNumbers(customer, pinpad);
    }

    private static int identicalNavigationMethodFromMiddleNumberGivenAnchorAndDirectionNumbers(Customer customer, Pinpad pinpad) {

        int interRowMov = getVerMove(customer, pinpad);
        int interColMov = getHorMove(customer, pinpad);

        int rowOfMiddleNumber = pinpad.getSquareSize() / 2;
        int colOfMiddleNumber = pinpad.getSquareSize() / 2;

        int rowOfDepartureNumber = rowOfMiddleNumber;
        int colOfDepartureNumber = colOfMiddleNumber;

        int rowOfSecretNumber = (pinpad.getSquareSize() + rowOfDepartureNumber + interRowMov) % pinpad.getSquareSize();
        int colOfSecretNumber = (pinpad.getSquareSize() + colOfDepartureNumber + interColMov) % pinpad.getSquareSize();

        return pinpad.get(rowOfSecretNumber * pinpad.getSquareSize() + colOfSecretNumber);
    }
}
