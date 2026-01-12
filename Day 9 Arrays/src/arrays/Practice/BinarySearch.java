package arrays.Practice;

public class BinarySearch {
    public static int binarySearch(int[] num,int key){

        int start = 0,end = num.length-1;
        while (start<=end){
            int mid = start+((end-start)/2);

            if (num[mid]==key){ // found
                return mid;
            }
            if (num[mid]<key) {  // right
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] num = {2,4,6,8,10,12,14};
        int key = 6;
        int index = binarySearch(num, key);
        if (index==-1){
            System.out.println("Not found");
        }else {
            System.out.println("Key found at index = " + index);
        }
    }
}
