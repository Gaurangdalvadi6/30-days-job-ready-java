package controlStatements;

public class CheckPrimeNumber {
    public static boolean isPrime(int n){
        if (n<=1){
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n) ; i++) {
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 373;
        boolean result = isPrime(n);
        String string = result ? "Given number is Prime" : "Given number is Not Prime";
        System.out.println(string);
    }
}
