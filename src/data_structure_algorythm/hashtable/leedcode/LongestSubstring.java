package data_structure_algorythm.hashtable.leedcode;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public static void main(String[] args) {
        // String s = "abcabcbb";
        String s = "pwwkew";
        System.out.println("Length of the longest substring without repeating characters: " + lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;
        for(int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);

            // check if c in the windown -> move left to the next character
            if (map.containsKey(current) && map.get(current) >= left) {
                left = map.get(current) + 1;
            }

            map.put(current, right);

            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}
