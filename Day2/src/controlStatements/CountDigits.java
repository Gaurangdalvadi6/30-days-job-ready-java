package controlStatements;

import java.util.Scanner;

public class CountDigits {
    public static int countD(int n){
        int counter = 0;
        while (n!=0){
            counter++;
            n=n/10;
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = scanner.nextInt();
        System.out.println(countD(num));
    }
}
