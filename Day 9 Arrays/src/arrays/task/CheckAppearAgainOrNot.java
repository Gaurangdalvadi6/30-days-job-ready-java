package arrays.task;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CheckAppearAgainOrNot {
    public static boolean appearOrNotUsingBruteForceApproach(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }



    public static boolean appearOrNotUsingHashSet(int[] arr){
        Set<Integer> seen = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (!seen.add(arr[i])){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4,5,1,2};
        boolean appearOrNot = appearOrNotUsingBruteForceApproach(nums);
        System.out.println(appearOrNot);
        System.out.println(appearOrNotUsingHashSet(nums));


    }
}
