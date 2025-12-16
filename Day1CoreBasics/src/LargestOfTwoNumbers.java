import java.util.Scanner;

public class LargestOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = scanner.nextInt();
        System.out.println("Enter the second number : ");
        int b= scanner.nextInt();
        if (a>b){
            System.out.println("Largest number is = " + a);
        } else if (b>a) {
            System.out.println("Largest number is = " + b);
        }else {
            System.out.println("Both are same");
        }
    }
}
