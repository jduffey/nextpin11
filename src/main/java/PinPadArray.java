import java.util.ArrayList;
import java.util.Collections;

public class PinPadArray {

    private ArrayList theArrayItself = new ArrayList();

    public PinPadArray(int sizeOfArraySquare) {
        for (int counter = 0; counter < sizeOfArraySquare * sizeOfArraySquare; counter++) {
            theArrayItself.add(counter);
        }
        Collections.shuffle(theArrayItself);
    }

    public int getArraySizeOfPinPad() {
        return theArrayItself.size();
    }

    public boolean containsThisNumber(int numberWeAreCheckingToSeeExistsInTheArray) {
        return theArrayItself.contains(numberWeAreCheckingToSeeExistsInTheArray);
    }

    public int get(int theElementToGet) {
        return (int)theArrayItself.get(theElementToGet);
    }

    /*
    Code for int[][]

    int[][] intArray = new int[SIZE_OF_ARRAY_SQUARE][SIZE_OF_ARRAY_SQUARE];

        for (int pinpadIndex = 0; pinpadIndex < SIZE_OF_ARRAY_SQUARE * SIZE_OF_ARRAY_SQUARE; pinpadIndex++) {
            for (int i = 1; i < SIZE_OF_ARRAY_SQUARE; i++) {
                for (int j = 1; j < SIZE_OF_ARRAY_SQUARE; j++) {
                    intArray[i][j] = pinpad.get(pinpadIndex);
                }
            }
        }

     */



}
