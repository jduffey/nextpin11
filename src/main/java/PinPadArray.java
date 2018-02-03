import java.util.ArrayList;

public class PinPadArray {

    private int numberOfElementsInThisArray = 0;
    private ArrayList theArrayItself = new ArrayList();

    public PinPadArray(int sizeOfArraySquare) {
        int numberOfElementsInThisArray = sizeOfArraySquare * sizeOfArraySquare;
        this.numberOfElementsInThisArray = numberOfElementsInThisArray;
        theArrayItself.add(1);
    }

    public int getNumberOfElementsInThisArray(){
        return 9;
    }


}
