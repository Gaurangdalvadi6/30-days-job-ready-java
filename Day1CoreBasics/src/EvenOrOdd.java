import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.print("Enter any number : ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String output = num % 2 == 0 ? "Even Number" : "Odd Number";
        System.out.println(output);
    }
}
