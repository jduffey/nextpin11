public class App {

    public static final int SIZE_OF_ARRAY_SQUARE = 5;

    public static void main(String[] args) {

        PinPadArray pinpad = new PinPadArray(SIZE_OF_ARRAY_SQUARE);

        displayIntroMessage();

        displayColumnHeaderUnderscores();

        displayPinpadSquare(pinpad);

    }

    private static void displayColumnHeaderUnderscores() {
        for (int i = 0; i < SIZE_OF_ARRAY_SQUARE; i++) {
            System.out.print("___ ");
        }
        System.out.println();
    }

    private static void displayPinpadSquare(PinPadArray pinpad) {
        for (int index = 0; index < pinpad.getArraySizeOfPinPad(); index++) {

            if (pinpad.get(index) < 10) {
                System.out.print("  ");
            } else if (pinpad.get(index) < 100) {
                System.out.print(" ");
            }

            System.out.print(pinpad.get(index) + " ");
            if ((index + 1) % SIZE_OF_ARRAY_SQUARE == 0) {
                System.out.println();
            }
        }
    }

    private static void displayIntroMessage() {
        System.out.println("*** Pinpad App ***");
        System.out.println("Square Size: " + SIZE_OF_ARRAY_SQUARE);
    }

}
