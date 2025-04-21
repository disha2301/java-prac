package com.gevernova.datastructure.hashmapandfunction;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZeroSumSubarrays {

    // Function to find all zero-sum subarrays
    public static List<int[]> findZeroSumSubarrays(int[] arr) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<int[]> result = new ArrayList<>();
        int sum = 0;

        // Initialize map with sum 0 at index -1
        List<Integer> initialList = new ArrayList<>();
        initialList.add(-1);
        map.put(0, initialList);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // If this sum has been seen before, zero-sum subarrays exist
            if (map.containsKey(sum)) {
                for (int start : map.get(sum)) {
                    result.add(new int[]{start + 1, i});
                }
            }

            // Add current index to the list of the current sum
            if (!map.containsKey(sum)) {
                map.put(sum, new ArrayList<>());
            }
            map.get(sum).add(i);
        }

        return result;
    }

    // Function to print the subarrays
    public static void printSubarrays(int[] arr, List<int[]> subarrays) {
        System.out.println("Zero Sum Subarrays:");
        for (int[] pair : subarrays) {
            System.out.print("Subarray from " + pair[0] + " to " + pair[1] + ": ");
            for (int i = pair[0]; i <= pair[1]; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 1, 3, -4, -2, -2};
        List<int[]> zeroSumSubarrays = findZeroSumSubarrays(arr);
        printSubarrays(arr, zeroSumSubarrays);
    }
}