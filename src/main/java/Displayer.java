public class Displayer {

    public static void displayPinpadSquare(Pinpad pinpad) {

        for (int index = 0; index < pinpad.getArraySizeOfPinPad(); index++) {

            if (pinpad.get(index) < 10) {
                System.out.print("  ");
            } else if (pinpad.get(index) < 100) {
                System.out.print(" ");
            }

            System.out.print(pinpad.get(index) + " ");
            if ((index + 1) % pinpad.getSquareSize() == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void displayAnchorAndDirectionNumber(Customer customer) {
        System.out.println("Anchor: " + customer.getAnchorNumber());
        System.out.println("Direction: " + customer.getDirectionNumber());
    }

    public static void displayColumnHeaderUnderscores(Customer customer) {
        for (int i = 0; i < customer.getPreferredPinpadSize(); i++) {
            System.out.print("___ ");
        }
        System.out.println();
    }

    public static void displayIntroMessage(Customer customer) {
        System.out.println("*** Pinpad App ***");
        System.out.println("Welcome " + customer.getName());
        System.out.println("Square Size: " + customer.getPreferredPinpadSize());
        displayAnchorAndDirectionNumber(customer);
    }

    public static void displaySecretNumber(Customer customer, Pinpad pinpad) {

        System.out.println("Actual secret number: " + SecretNumber.getSecNum(customer, pinpad));
    }

    public static void displaySuccessOrFailMessage(Customer customer, Pinpad pinpad, int guessedSecretNumber) {

        String message = (guessedSecretNumber == SecretNumber.getSecNum(customer, pinpad)) ? "Success!" : "Utter failure.";
        System.out.println(message);
    }
}
