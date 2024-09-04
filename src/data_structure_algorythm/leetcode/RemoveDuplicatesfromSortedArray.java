package data_structure_algorythm.leetcode;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int[] nums = new int[] {1, 1, 2};
        int[] expectednNums = new int[] {1, 2};
        int k = removeDuplicates(nums);
        System.out.println("k: " + k);
        for (int i = 0; i < k; i++) {
            System.out.println(nums[i]);
            System.out.println(expectednNums[i]);
            System.out.println(nums[i] == expectednNums[i]);
        }
    }

    public static int removeDuplicates(int[] nums) {
        // Length of the updated array
        int count = 0;
        // Loop for all the elements in the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is equal to the next element, we skip
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            }
            // We will update the array in place
            nums[count] = nums[i];
            count++;
        }
        System.out.println(java.util.Arrays.toString(nums));
        return count;
    }

}
