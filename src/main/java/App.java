public class App {

    public static void main(String[] args) {

        Customer customer = new Customer();

        customer.askCustomerForSettings();

        loginAttemptSession session = new loginAttemptSession(customer);

        session.initiateLoginAttempt();

        session.displayResults();
    }

}
