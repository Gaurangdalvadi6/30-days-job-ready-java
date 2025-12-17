package controlStatements;

public class ReverseNumber {
    public static int reverse(int n){
        int reversed = 0;
        while (n != 0){
            int lastDigit = n%10;
            reversed = reversed*10+lastDigit;
            n= n/10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        int n = 256;
        System.out.println(reverse(n));
    }
}
