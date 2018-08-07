import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Customer customer = new Customer();
        setCustomerSettings(customer);

        Displayer.displayIntroMessage(customer);

        for (int i = 0; i < 4; i++) {
            Displayer.displayColumnHeaderUnderscores(customer);
            runAGuessingSession(customer);
        }

    }

    private static void runAGuessingSession(Customer customer) {

        Pinpad pinpad = new Pinpad(customer.getPreferredPinpadSize());

        Displayer.displayPinpadSquare(pinpad);

        int guessedSecretNumber = askToGuessSecretNumber();

        Displayer.displaySecretNumber(customer, pinpad);

        Displayer.displaySuccessOrFailMessage(customer, pinpad, guessedSecretNumber);

        System.out.println();
    }

    private static void setCustomerSettings(Customer customer) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("--ESTABLISH CUSTOMER ACCOUNT--");
        System.out.println("Please enter your name: ");
        customer.setName(scanner.next());

        System.out.println("Pinpad size must be an odd number");
        System.out.println("between 3 and 31 (inclusive).");
        System.out.println("Enter preferred pinpad size: ");
        customer.setPreferredPinpadSize(scanner.nextInt());

        System.out.println("Set anchor number: ");
        customer.setAnchorNumber(scanner.nextInt());

        System.out.println("Set direction number: ");
        customer.setDirectionNumber(scanner.nextInt());

        System.out.println("Thank you for following the instructions.");
    }

    private static int askToGuessSecretNumber() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess secret number: ");

        return scanner.nextInt();
    }
}
