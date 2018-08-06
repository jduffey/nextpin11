public class Customer {

    private int anchorNumber;
    private int directionNumber;
    private String name;
    private int preferredPinpadSize;

    public void setAnchorNumber(int anchorNumber) {
        this.anchorNumber = anchorNumber;
    }

    public int getAnchorNumber() {
        return anchorNumber;
    }

    public void setDirectionNumber(int directionNumber) {
        this.directionNumber = directionNumber;
    }

    public int getDirectionNumber() {
        return directionNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPreferredPinpadSize(int preferredPinpadSize) {
        this.preferredPinpadSize = preferredPinpadSize;
    }

    public int getPreferredPinpadSize(){
        return preferredPinpadSize;
    }
}
