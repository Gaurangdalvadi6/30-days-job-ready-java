package controlStatements;

import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number : ");
        long n = scanner.nextLong();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
