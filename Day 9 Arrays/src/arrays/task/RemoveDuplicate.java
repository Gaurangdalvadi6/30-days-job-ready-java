package arrays.task;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,1,2,3};

        // 1.
        Set<Integer> integers = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            integers.add(arr[i]);
        }
        System.out.println(integers);

        // 2.
        Set<Integer> integerSet = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toSet());
        System.out.println(integerSet);
    }
}
