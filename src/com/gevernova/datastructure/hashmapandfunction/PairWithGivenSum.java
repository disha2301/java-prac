package com.gevernova.datastructure.hashmapandfunction;
import java.util.HashSet;

public class PairWithGivenSum {
    // Function to check if a pair exists
    public static boolean hasPairWithSum(int[] arr, int target) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;
            if (seen.contains(complement)) {
                System.out.println("Pair found: (" + complement + ", " + num + ")");
                return true;
            }
            seen.add(num);
        }

        System.out.println("No such pair exists.");
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {8, 4, 1, 6};
        int target = 10;

        hasPairWithSum(arr, target);
    }
}
