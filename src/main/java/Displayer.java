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

    public static void displayColumnHeaderUnderscores(Pinpad pinpad) {
        for (int i = 0; i < pinpad.getSquareSize(); i++) {
            System.out.print("___ ");
        }
        System.out.println();
    }

    public static void displayIntroMessage(Pinpad pinpad) {
        System.out.println("*** Pinpad App ***");
        System.out.println("Square Size: " + pinpad.getSquareSize());
    }
}
