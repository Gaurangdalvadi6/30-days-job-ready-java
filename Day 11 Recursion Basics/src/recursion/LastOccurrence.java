package recursion;

public class LastOccurrence {

    public static int lastOccurrence(int[]arr, int i,int key){
        if (i == arr.length){
            return -1;
        }

        int isFound = lastOccurrence(arr, i + 1, key);
        if (isFound!=-1){
            return isFound;
        }

        if (arr[i]==key){
            return i;
        }

        return isFound;
    }

    public static void main(String[] args) {
        int[] arr = {8,3,6,9,5,10,2,5,3};
        int key = 5;
        System.out.println(lastOccurrence(arr,0,key));
    }
}
