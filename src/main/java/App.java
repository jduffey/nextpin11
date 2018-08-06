import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Pinpad pinpad = new Pinpad(7);
        Customer customer = new Customer();

        Displayer.displayIntroMessage(pinpad);

        askForAndSetPrivateNumbers(customer);

        Displayer.displayAnchorAndDirectionNumber(customer);

        Displayer.displayColumnHeaderUnderscores(pinpad);

        Displayer.displayPinpadSquare(pinpad);

        int guessedSecretNumber = askToGuessSecretNumber();

        Displayer.displaySecretNumber(customer, pinpad);

        Displayer.displaySuccessOrFailMessage(customer, pinpad, guessedSecretNumber);

    }

    private static int askToGuessSecretNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess secret number: ");
        int secNum = scanner.nextInt();

        return secNum;
    }

    private static void askForAndSetPrivateNumbers(Customer customer) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Set anchor number: ");
        int ancNum = scanner.nextInt();
        customer.setAnchorNumber(ancNum);

        System.out.println("Set direction number: ");
        int dirNum = scanner.nextInt();
        customer.setDirectionNumber(dirNum);

        System.out.println("Thank you for following the instructions.");
    }
}
