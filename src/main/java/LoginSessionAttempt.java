import java.util.Scanner;

public class LoginSessionAttempt {

    Customer customer;

    public LoginSessionAttempt(Customer customer) {

        this.customer = customer;

    }

    public void initiateLoginAttempt() {

        Displayer.displayIntroMessage(customer);

        for (int i = 0; i < 4; i++) {
            Displayer.displayColumnHeaderUnderscores(customer);
            runAGuessingSessionOnAnIndividualPinpad(customer);
        }
    }

    private static void runAGuessingSessionOnAnIndividualPinpad(Customer customer) {

        Pinpad pinpad = new Pinpad(customer.getPreferredPinpadSize());

        Displayer.displayPinpadSquare(pinpad);

        int guessedSecretNumber = askToGuessSecretNumber();

        Displayer.displaySecretNumber(customer, pinpad);

        Displayer.displaySuccessOrFailMessage(customer, pinpad, guessedSecretNumber);

        System.out.println();
    }

    private static int askToGuessSecretNumber() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess secret number: ");

        return scanner.nextInt();
    }
}
