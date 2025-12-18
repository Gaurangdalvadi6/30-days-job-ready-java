package OOP.interfaceExample;

public class UPI implements Payment{
    @Override
    public void pay() {
        System.out.println("pay using upi");
    }
}
