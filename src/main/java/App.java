public class App {

    public static final int SIZE_OF_ARRAY_SQUARE = 7;
    public static int indexOfZero = -999;

    public static void main(String[] args) {

        Pinpad pinpad = new Pinpad(SIZE_OF_ARRAY_SQUARE);

        displayIntroMessage();

        displayColumnHeaderUnderscores();

        displayPinpadSquare(pinpad);

        // See both outputs
//        for(int i = 0; i<pinpad.getArraySizeOfPinPad(); i++){
//            System.out.println(pinpad.get(i)+ " "+ pinpad.getFromIntArray(pinpad.rowOf(i),pinpad.colOf(i)));
//        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("What index is 0? ");
//
//        int inputGuess = scanner.nextInt();
//
//        for (int index = 0; index < pinpad.getArraySizeOfPinPad(); index++) {
//            if (pinpad.get(index) == 0) {
//                indexOfZero = index;
//                break;
//            }
//        }
//
//        System.out.println();
//        System.out.println("Index of 0 is: " + indexOfZero);
//        System.out.println("You guessed: " + inputGuess);

    }

    private static void displayColumnHeaderUnderscores() {
        for (int i = 0; i < SIZE_OF_ARRAY_SQUARE; i++) {
            System.out.print("___ ");
        }
        System.out.println();
    }

    private static void displayPinpadSquare(Pinpad pinpad) {
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
        System.out.println();
    }

    private static void displayIntroMessage() {
        System.out.println("*** Pinpad App ***");
        System.out.println("Square Size: " + SIZE_OF_ARRAY_SQUARE);
    }

}
