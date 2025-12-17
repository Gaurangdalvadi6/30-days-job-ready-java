package controlStatements;

import java.util.Scanner;

public class PalindromeNumber {
    public static boolean palindrome(int n){
        int temp = n;
        int rev = 0;

        while (n != 0){
            rev = rev*10 + n%10;
            n = n/10;
        }
        return temp == rev;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num = scanner.nextInt();
        String output = palindrome(num) ? "Palindrome" : "Not Palindrome";
        System.out.println(output);
    }
}
