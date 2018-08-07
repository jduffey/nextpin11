import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoginSessionAttempt {

    Customer customer;
    private List<Integer> guessedNumbers = new ArrayList<>();
    private List<Integer> actualSecretNumbers = new ArrayList<>();

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

    private void runAGuessingSessionOnAnIndividualPinpad(Customer customer) {

        Pinpad pinpad = new Pinpad(customer.getPreferredPinpadSize());
        actualSecretNumbers.add(SecretNumber.getSecNum(customer, pinpad));

        Displayer.displayPinpadSquare(pinpad);

        int guessedSecretNumber = askToGuessSecretNumber();
        guessedNumbers.add(guessedSecretNumber);

        Displayer.displaySecretNumber(customer, pinpad);

        Displayer.displaySuccessOrFailMessage(customer, pinpad, guessedSecretNumber);

        System.out.println();
    }

    private static int askToGuessSecretNumber() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess secret number: ");

        return scanner.nextInt();
    }

    public void displayResults() {

        System.out.println(guessedNumbers + " <- Guessed");
        System.out.println(actualSecretNumbers + " <- Actual");
        String resultMessage = "";

        for (int i = 0; i < guessedNumbers.size(); i++) {
            if (guessedNumbers.get(i).intValue() != actualSecretNumbers.get(i).intValue()) {
                resultMessage = "FAILED ATTEMPT.";
                break;
            } else resultMessage = "Successful login.";
        }

        System.out.println();
        System.out.println(resultMessage);
    }
}
