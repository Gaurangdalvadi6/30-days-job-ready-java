package OOP.polymorphism.overloading;

public class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int add = calculator.add(2, 5);
        System.out.println("int add = " + add);
        double add1 = calculator.add(2.5, 5.2);
        System.out.println("double add = " + add1);
    }
}
