package arrays.Practice;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {
    public static void reverse(int[] arr){
        int left = 0,right = arr.length-1;

        while (left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

//        Collections.reverse(Arrays.asList(arr));
//        System.out.println(Arrays.toString(arr));
    }
}
