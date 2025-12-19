package exceptionHandling;

public class ArithmaticExceptionProgram {
    public static void main(String[] args) {
        try {
            int a = 10/0;
        }catch (ArithmeticException e){
            System.out.println("Cannot divided by zero");
        }
    }
}
