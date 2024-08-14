package data_structure_algorythm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindPairs {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8, 10};
        int target = 7;

        List<int[]> pairs = findPairs(arr1, arr2, target);
        for (int[] pair : pairs) {
            System.out.println(Arrays.toString(pair));
        }

        /*
            EXPECTED OUTPUT:
            ----------------
            [5, 2]
            [3, 4]
            [1, 6]
            
        */
    }

    public static List<int[]> findPairs(int[] arr1, int[] arr2, int target) {
        Set<int[]> result = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] + arr2[j] == target) result.add(new int[]{arr1[i], arr2[j]});
            }
        }

        return new ArrayList<>(result);
    }

    // solution 2
    /*
    public static List<int[]> findPairs(int[] arr1, int[] arr2, int target) {
        Set<Integer> mySet = new HashSet<>();
        List<int[]> pairs = new ArrayList<>();
 
        for (int num : arr1) {
            mySet.add(num);
        }
 
        for (int num : arr2) {
            int complement = target - num;
            if (mySet.contains(complement)) {
                pairs.add(new int[]{complement, num});
            }
        }
 
        return pairs;
    }
     */

}
