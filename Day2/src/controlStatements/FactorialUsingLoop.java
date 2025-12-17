package controlStatements;

import java.util.Scanner;

public class FactorialUsingLoop {
    public static long factorial(int n){
        int num = 1;
        for (int i = 1; i <=n ; i++) {
            num = num*i;
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any which you want to find factorial : ");
        int num = scanner.nextInt();
        System.out.println(factorial(num));
    }
}
