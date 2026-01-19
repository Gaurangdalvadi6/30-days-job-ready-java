package recursion;

public class FirstOccurrence {

    public static int firstOccurrence(int[]arr, int i,int key){
        if (i== arr.length){
            return -1;
        }

        if (arr[i]==key){
            return i;
        }

        return firstOccurrence(arr,i+1,key);
    }

    public static void main(String[] args) {
        int[] arr = {8,3,6,9,5,10,2,5,3};
        int key = 5;
        System.out.println(firstOccurrence(arr,0,key));
    }

}
