public class App {

    public static void main(String[] args) {

        Customer customer = new Customer();

        customer.askCustomerForSettings();

        LoginSessionAttempt session = new LoginSessionAttempt(customer);

        session.initiateLoginAttempt();

        session.displayResults();
    }

}
