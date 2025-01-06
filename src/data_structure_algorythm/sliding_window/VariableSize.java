package data_structure_algorythm.sliding_window;

public class VariableSize {

    public static int maxSum(int[] arr, int n, int k) {
        int max = 0;
        for (int i = 0; i < k; i++) {
            max = max + arr[i];
        }

        int curr = max;
        for (int i = k; i < n; i++) {
            curr = curr - arr[i-k] + arr[i];
            if (curr > max) {
                max = curr;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 2, 10, 2, 3, 1, 0, 20};
        int k = 4;
        int n = arr.length;
        System.out.println(maxSum(arr, n, k));
    }

}
 