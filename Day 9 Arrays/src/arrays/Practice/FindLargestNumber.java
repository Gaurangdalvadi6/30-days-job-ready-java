package arrays.Practice;

public class FindLargestNumber {
    public static int largestNumber(int[] num){
        int largest = num[0];
        int smallest = num[0];
        for (int i = 0; i < num.length; i++) {
            if (largest<num[i]){
                largest=num[i];
            }
            if (smallest>num[i]){
                smallest=num[i];
            }
        }
        System.out.println("smallest value is : " +smallest);
        return largest;
    }
    public static void main(String[] args) {
        int[] num = {10,20,5,99,85,999};
        int largestNumber = largestNumber(num);
        System.out.println("largest value is "+largestNumber);
    }
}
