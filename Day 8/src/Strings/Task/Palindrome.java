package Strings.Task;

import java.util.Arrays;

public class Palindrome {
    public static boolean isPalindrome(String str){
        String string = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(string);
    }
    public static void main(String[] args) {
        String name = "raceCar";
        boolean palindrome = isPalindrome(name);
        if (palindrome){
            System.out.println("This is palindrome");
        }else {
            System.out.println("This is not palindrome");
        }
    }
}
