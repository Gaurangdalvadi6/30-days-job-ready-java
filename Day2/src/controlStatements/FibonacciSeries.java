package controlStatements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FibonacciSeries {
    public static int getFibonnaci(int n){
        if (n==0 || n==1){
            return n;
        }
        int[] fib = new int[n+1];
        fib[1] = 1;
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i-1]+fib[i-2];
        }
        return fib[n];
    }

    public static int[] fibonacci(int n){
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            int Fibonacci = getFibonnaci(i);
            arr.add(Fibonacci);
        }
        return arr.stream().mapToInt(s->s).toArray();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = scanner.nextInt();
        System.out.println(Arrays.toString(fibonacci(num)));
    }
}
