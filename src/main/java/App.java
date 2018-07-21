public class App {

    public static void main(String[] args) {

        System.out.println("*** Pinpad App ***");

        PinPadArray pinpad = new PinPadArray(3);

        System.out.println("Size of array: " + pinpad.getArraySizeOfPinPad());

        for (int index = 0; index < pinpad.getArraySizeOfPinPad(); index++) {
            System.out.println("Index " + index + ": " + pinpad.getValueOfElement(index));
        }
    }

}
