package recursion;

import java.math.BigInteger;

public class FibonacciNumber {

    public static int fibonacciNumber(int n){
        if (n==0 || n==1){
            return n;
        }

        return fibonacciNumber(n-1)+fibonacciNumber(n-2);
    }
    public static long fibonacciNumberUsingIterative(int n){
        if (n==0 || n==1){
            return n;
        }

        long a = 0,b=1;
        for (int i = 2; i <= n; i++) {
            long temp = a+b;
            a=b;
            b=temp;
        }
        return b;
    }

    public static BigInteger fibonacciNumberUsingIterativeAndBigInteger(int n){
        if (n==0 || n==1){
            return BigInteger.valueOf(n);
        }

        BigInteger a = BigInteger.ZERO,b=BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            BigInteger temp = a.add(b);
            a=b;
            b=temp;
        }
        return b;
    }

    public static void main(String[] args) {
        int n=25;
//        int number = fibonacciNumber(n);
//        System.out.println(number);

        System.out.println(fibonacciNumberUsingIterative(n));
//        System.out.println(fibonacciNumberUsingIterativeAndBigInteger(100));
    }
}

//0 1 1 2 3 5 8 13 21
//0 1 2 3 4 5 6  7  8