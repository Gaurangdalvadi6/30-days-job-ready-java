package OOP.interfaceExample;

public class Main {
    public static void main(String[] args) {
        Payment p = new UPI();
        p.pay();
        p = new CreditCard();
        p.pay();
        p = new DebitCard();
        p.pay();
    }
}
