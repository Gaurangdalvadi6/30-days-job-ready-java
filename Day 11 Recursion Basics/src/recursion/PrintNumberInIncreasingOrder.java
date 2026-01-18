package recursion;

public class PrintNumberInIncreasingOrder {

    public static void printNumberInIncreasingOrder(int n){
        if (n==0 || n==1){
            System.out.print(n+" ");
            return;
        }

        printNumberInIncreasingOrder(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n = 10;
        printNumberInIncreasingOrder(n);
    }
}
