package controlStatements;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = scanner.nextInt();

        if (num%2==0){
            System.out.println("Even number");
        }else {
            System.out.println("Odd Number");
        }
    }
}
