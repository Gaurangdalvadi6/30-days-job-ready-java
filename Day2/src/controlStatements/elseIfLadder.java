package controlStatements;

import java.util.Scanner;

public class elseIfLadder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int first = scanner.nextInt();
        System.out.println("Enter second number : ");
        int second = scanner.nextInt();

        if (first> second){
            System.out.println("largest is = " + first);
        } else if (second>first) {
            System.out.println("largest is = " + second);
        }else {
            System.out.println("both are same.");
        }
    }
}
