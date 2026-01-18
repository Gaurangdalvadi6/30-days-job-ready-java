package recursion;

public class PrintNumberInDecreasingOrder {

    public static void printNumberInDecreasingOrder(int n){
        if (n==0 || n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printNumberInDecreasingOrder(n-1);
    }


    public static void main(String[] args) {
        int n = 10;
        printNumberInDecreasingOrder(n);
    }
}
