package exceptionHandling;

public class Main {
    static void checkAge(int age){
        if (age < 18){
            throw new InvalidAgeException("Not eligible");
        }
        System.out.println("Eligible");
    }

    public static void main(String[] args) {
        checkAge(18);
    }
}
