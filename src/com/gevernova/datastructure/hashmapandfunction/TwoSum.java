package com.gevernova.datastructure.hashmapandfunction;
import java.util.HashMap;

public class TwoSum {
    // Function to find indices of two numbers that add up to the target
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // If the complement exists in the map, return the indices
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Otherwise, add the current element to the map with its index
            map.put(nums[i], i);
        }

        // If no such pair exists, return an empty array (can be customized)
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        if (result.length == 0) {
            System.out.println("No solution found.");
        } else {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        }
    }
}