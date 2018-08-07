public class App {

    public static void main(String[] args) {

        Customer customer = new Customer();

        customer.askCustomerForSettings();

        LoginAttemptSession session = new LoginAttemptSession(customer);

        session.initiateLoginAttempt();

        session.displayResults();
    }

}
