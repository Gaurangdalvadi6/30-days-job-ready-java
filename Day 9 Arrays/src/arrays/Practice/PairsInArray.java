package arrays.Practice;

public class PairsInArray {
    public static void printPairs(int[] numbers){
        int totalPair = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                System.out.print("("+numbers[i]+","+numbers[j]+") ");
                totalPair++;
            }
            System.out.println();
        }
        System.out.println("TotalPair = " + totalPair);
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        printPairs(arr);
    }
}
