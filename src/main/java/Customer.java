import java.util.Scanner;

public class Customer {

    private int anchorNumber;
    private int directionNumber;
    private String name;
    private int preferredPinpadSize;
    private SecretNumberDecisionCriteria preferredSecretNumberDecisionCriteria;

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

    public int getPreferredPinpadSize() {
        return preferredPinpadSize;
    }

    public void askCustomerForSettings() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("--ESTABLISH CUSTOMER ACCOUNT--");
        System.out.println("Please enter your name: ");
        setName(scanner.next());

        System.out.println("Pinpad size must be an odd number");
        System.out.println("between 3 and 31 (inclusive).");
        System.out.println("Enter preferred pinpad size: ");
        setPreferredPinpadSize(scanner.nextInt());

        System.out.println("Set anchor number: ");
        setAnchorNumber(scanner.nextInt());

        System.out.println("Set direction number: ");
        setDirectionNumber(scanner.nextInt());

        System.out.println("Thank you for following the instructions.");
    }

    public void setPreferredSecretNumberDecisionCriteria(SecretNumberDecisionCriteria preferredSecretNumberDecisionCriteria) {
    this.preferredSecretNumberDecisionCriteria = preferredSecretNumberDecisionCriteria;
    }

    public SecretNumberDecisionCriteria getPreferredSecretNumberDecisionCriteria() {
        return preferredSecretNumberDecisionCriteria;
    }
}
