package recursion;

public class PrintSumOfFirstNNumber {

    public static int printSumOfFirstNNumber(int n){
        if (n==0){
            return 0;
        }

        return n+printSumOfFirstNNumber(n-1);
    }

    public static void main(String[] args) {
        int n = 10;
        int sumOfFirstNNumber = printSumOfFirstNNumber(n);
        System.out.println(sumOfFirstNNumber);
    }
}
