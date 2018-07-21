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
}
