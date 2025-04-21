package com.gevernova.datastructure.hashmapandfunction;
import java.util.HashSet;

public class LongestConsecutiveSequence {
    // Function to return the length of the longest consecutive sequence
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int maxLength = 0;

        // Add all elements to the set
        for (int num : nums) {
            set.add(num);
        }

        for (int num : set) {
            // Only start counting if 'num' is the start of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int count = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                maxLength = Math.max(maxLength, count);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        int result = longestConsecutive(arr);
        System.out.println("Longest consecutive sequence length: " + result);
    }
}
