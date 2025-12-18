package OOP.polymorphism.overriding;

public class Main {
    public static void main(String[] args) {
        Parent p = new Child(); // child object is assign to parent reference possible
        p.show();

        Child c =(Child) new Parent(); // show ClassCastException // parent object is assign to child reference not possible give exception
        c.show();
    }
}
