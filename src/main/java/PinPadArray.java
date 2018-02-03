import java.util.ArrayList;

public class PinPadArray {

    private ArrayList theArrayItself = new ArrayList();

    public PinPadArray(int sizeOfArraySquare) {
        for (int counter = 0; counter < sizeOfArraySquare * sizeOfArraySquare; counter++) {
            theArrayItself.add(1);
        }
    }

    public int getArraySizeOfPinPad() {
        return theArrayItself.size();
    }

}
