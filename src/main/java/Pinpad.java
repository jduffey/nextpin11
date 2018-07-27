import java.util.ArrayList;
import java.util.Collections;

public class Pinpad {

    private ArrayList theArrayItself = new ArrayList();
    private int sizeOfArraySquare;

    public Pinpad(int sizeOfArraySquare) {

        this.sizeOfArraySquare = sizeOfArraySquare;

        for (int counter = 0; counter < sizeOfArraySquare * sizeOfArraySquare; counter++) {
            theArrayItself.add(counter);
        }

        Collections.shuffle(theArrayItself);
    }

    private void fillIntArrayWithArrayListValues(int sizeOfArraySquare, ArrayList arrayList) {
        for (int counter = 0; counter < sizeOfArraySquare * sizeOfArraySquare; counter++) {
            theArrayItself.set(counter, arrayList.get(counter));
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

    public int getSquareSize() {
        return sizeOfArraySquare;
    }

    public void setCustomArray(int squareSizeOfArray, ArrayList customArray) {
        fillIntArrayWithArrayListValues(squareSizeOfArray, customArray);
    }

    public int getPosOfValue(int i) {
        return theArrayItself.indexOf((Integer) i);
    }
}

