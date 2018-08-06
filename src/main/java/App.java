import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Customer customer = new Customer();
        setCustomerSettings(customer);

        do {
            runAGuessingSession(customer);
        } while (true);

    }

    private static void runAGuessingSession(Customer customer) {

        Pinpad pinpad = new Pinpad(customer.getPreferredPinpadSize());

        Displayer.displayIntroMessage(pinpad, customer);

        Displayer.displayAnchorAndDirectionNumber(customer);

        Displayer.displayColumnHeaderUnderscores(pinpad);

        Displayer.displayPinpadSquare(pinpad);

        int guessedSecretNumber = askToGuessSecretNumber();

        Displayer.displaySecretNumber(customer, pinpad);

        Displayer.displaySuccessOrFailMessage(customer, pinpad, guessedSecretNumber);
    }

    private static void setCustomerSettings(Customer customer) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        customer.setName(scanner.next());

        System.out.println("Enter preferred pinpad size: ");
        customer.setPreferredPinpadSize(scanner.nextInt());

        System.out.println("Set anchor number: ");
        int ancNum = scanner.nextInt();
        customer.setAnchorNumber(ancNum);

        System.out.println("Set direction number: ");
        int dirNum = scanner.nextInt();
        customer.setDirectionNumber(dirNum);

        System.out.println("Thank you for following the instructions.");
    }

    private static int askToGuessSecretNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess secret number: ");
        int secNum = scanner.nextInt();

        return secNum;
    }
}
