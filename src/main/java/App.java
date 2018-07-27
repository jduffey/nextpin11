public class App {

    public static void main(String[] args) {

        Pinpad pinpad = new Pinpad(3);
        Customer customer = new Customer();
        customer.setAnchorNumber(0);
        customer.setDirectionNumber(1);

        Displayer.displayIntroMessage(pinpad);

        Displayer.displayAnchorAndDirectionNumber(customer);

        Displayer.displayColumnHeaderUnderscores(pinpad);

        Displayer.displayPinpadSquare(pinpad);
    }
}
