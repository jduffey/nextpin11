import java.util.ArrayList;
import java.util.Collections;

public class PinPadArray {

    private ArrayList theArrayItself = new ArrayList();
    private int[][] intArray;
    private int sizeOfArraySquare;

    public PinPadArray(int sizeOfArraySquare) {

        this.sizeOfArraySquare = sizeOfArraySquare;
        intArray = new int[sizeOfArraySquare][sizeOfArraySquare];

        for (int counter = 0; counter < sizeOfArraySquare * sizeOfArraySquare; counter++) {
            theArrayItself.add(counter);
        }

        Collections.shuffle(theArrayItself);

        for (int counter = 0; counter < sizeOfArraySquare * sizeOfArraySquare; counter++) {
            intArray[counter / sizeOfArraySquare][(counter + sizeOfArraySquare) % sizeOfArraySquare] = (int) theArrayItself.get(counter);
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

    public int getSquareSize() {
        return sizeOfArraySquare;
    }

    public int rowOf(int i) {
        return i / sizeOfArraySquare;
    }

    public int colOf(int i) {
        return (i + 3) % sizeOfArraySquare;
    }
}
