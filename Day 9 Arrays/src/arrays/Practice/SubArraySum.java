package arrays.Practice;

public class SubArraySum {
    public static void subArraySumUsingBruteForceApproach(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int currSum = 0;
                for (int k = i; k <=j ; k++) {
                    currSum= currSum+arr[k];
                    if (currSum>maxSum){
                        maxSum=currSum;
                    }
                    if (currSum<minSum){
                        minSum = currSum;
                    }
                }
            }
        }
        System.out.println("MinSum = "+ minSum);
        System.out.println("MaxSum = "+ maxSum);
    }

    public static void subArraySumUsingPrefix(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                int currSum = start==0 ? prefix[end] : prefix[end]-prefix[start-1];

                if (currSum>maxSum){
                    maxSum=currSum;
                }
                if (currSum<minSum){
                    minSum=currSum;
                }
            }
        }
        System.out.println("minSum = "+ minSum);
        System.out.println("maxSum = "+ maxSum);
    }

    public static void subArraySumUsingKadaneAlgorithm(int[] arr){
        int maxSum = arr[0];
        int currMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currMax = Math.max(arr[i], currMax + arr[i]);
            maxSum = Math.max(maxSum, currMax);
        }

        int minSum = arr[0];
        int currMin = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currMin = Math.min(arr[i], currMin + arr[i]);
            minSum = Math.min(minSum, currMin);
        }

        System.out.println("minSum = " + minSum);
        System.out.println("maxSum = " + maxSum);
    }
    public static void main(String[] args) {
        int[] arr = {1,-2,6,-1,3};
//        subArraySumUsingBruteForceApproach(arr);
//        subArraySumUsingPrefix(arr);
        int[] arr2 = {-2,-3,4,-1,-2,1,5,-3};
//        subArraySumUsingKadaneAlgorithm(arr2);
        int[] arr3 = {-2,-3,-1,-4};
//        subArraySumUsingPrefix(arr3);
        subArraySumUsingKadaneAlgorithm(arr3);
    }
}
