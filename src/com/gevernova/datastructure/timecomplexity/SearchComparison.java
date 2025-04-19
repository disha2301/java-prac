package com.gevernova.datastructure.timecomplexity;
import java.util.*;

public class SearchComparison {

    // Linear Search
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    // Binary Search
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] sizes = {1_000, 10_000, 1_000_000};

        for (int size : sizes) {
            int[] data = new int[size];
            Random rand = new Random();

            // Fill array with random integers
            for (int i = 0; i < size; i++) {
                data[i] = rand.nextInt(size * 10);
            }

            // Choose a random target from the array
            int target = data[rand.nextInt(size)];

            // ---- Linear Search ----
            long startLinear = System.nanoTime();
            int indexLinear = linearSearch(data, target);
            long endLinear = System.nanoTime();
            long timeLinear = endLinear - startLinear;

            // ---- Binary Search ----
            Arrays.sort(data);  // Required for binary search
            long startBinary = System.nanoTime();
            int indexBinary = binarySearch(data, target);
            long endBinary = System.nanoTime();
            long timeBinary = endBinary - startBinary;

            // ---- Output ----
            System.out.println("Dataset Size: " + size);
            System.out.println("Linear Search: " + timeLinear / 1_000_000.0 + " ms");
            System.out.println("Binary Search: " + timeBinary / 1_000_000.0 + " ms");
            System.out.println("---------------------------");
        }
    }
}