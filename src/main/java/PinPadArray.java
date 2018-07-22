import java.util.ArrayList;
import java.util.Collections;

public class PinPadArray {

    private ArrayList theArrayItself = new ArrayList();
    private int[][] intArray;

    public PinPadArray(int sizeOfArraySquare) {

        intArray = new int[sizeOfArraySquare][sizeOfArraySquare];

        for (int counter = 0; counter < sizeOfArraySquare * sizeOfArraySquare; counter++) {
            theArrayItself.add(counter);
        }

        Collections.shuffle(theArrayItself);

        for (int counter = 0; counter < sizeOfArraySquare * sizeOfArraySquare; counter++) {
            intArray[counter/sizeOfArraySquare][(counter+3) % sizeOfArraySquare] = (int) theArrayItself.get(counter);
        }

    }

    public int getArraySizeOfPinPad() {
        return theArrayItself.size();
    }

    public boolean containsThisNumber(int numberWeAreCheckingToSeeExistsInTheArray) {
        return theArrayItself.contains(numberWeAreCheckingToSeeExistsInTheArray);
    }

    public int get(int theElementToGet) {
        return (int) theArrayItself.get(theElementToGet);
    }

    public int getFromIntArray(int i, int j) {
        return intArray[i][j];
    }

}
