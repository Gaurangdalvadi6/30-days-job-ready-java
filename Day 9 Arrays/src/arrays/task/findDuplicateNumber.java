package arrays.task;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class findDuplicateNumber {
    public static List<Integer> duplicateNumberUsingBruteForceApproach(int[] arr){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    list.add(arr[i]);
                }
            }
        }
        return list;
    }

    public static List<Integer> duplicateNumberUsingHashSet(int[] arr){
        Set<Integer> seen = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!seen.add(arr[i])){
                duplicates.add(arr[i]);
            }
        }
        return duplicates;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4,5,1,2};
        List<Integer> integerList = duplicateNumberUsingBruteForceApproach(nums);
        System.out.println(integerList);
        List<Integer> integerList1 = duplicateNumberUsingHashSet(nums);
        System.out.println(integerList1);
    }
}
