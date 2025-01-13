package data_structure_algorythm.sliding_window;

public class DynamicSlidingWindow {
    public static void main(String[] args) {
        // arr = [1, 29, 33, 24, 56, 45], k = 3 finding the maximum sum of a subarray f sze k
        int[] arr = {2, 1, 5, 1, 3, 10};
        int k = 3;
        
        int maxSum = findMaxSumSubarray(arr, k);
        System.out.println("Maximum sum of subarray of size " + k + " is: " + maxSum);
    }

    public static int findMaxSumSubarray(int[] arr, int k) {
        if (arr.length < k || k <= 0) return 0;
        int max = 0;
        for (int i = 0; i < k; i++) {
            max = max + arr[i];
        }
        int maxTemp = max;
        for (int i = k; i < arr.length; i++) {
            maxTemp = maxTemp + arr[i] - arr[i - k];
            if (maxTemp > max) max = maxTemp;
        }

        return max;
    }
}
