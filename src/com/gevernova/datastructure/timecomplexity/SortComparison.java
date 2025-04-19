package com.gevernova.datastructure.timecomplexity;
import java.util.*;

public class SortComparison {

    // Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    // Merge Sort
    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    private static void merge(int[] arr, int l, int m, int r) {
        int[] left = Arrays.copyOfRange(arr, l, m + 1);
        int[] right = Arrays.copyOfRange(arr, m + 1, r + 1);
        int i = 0, j = 0, k = l;
        while (i < left.length && j < right.length)
            arr[k++] = (left[i] <= right[j]) ? left[i++] : right[j++];
        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];
    }

    // Quick Sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high], i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // swap pivot
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int[] sizes = {1000, 10000}; // Avoid 1 million for Bubble Sort

        for (int size : sizes) {
            int[] original = new Random().ints(size, 0, size * 10).toArray();

            // Bubble Sort (Skip large datasets)
            if (size <= 10000) {
                int[] arrBubble = original.clone();
                long startBubble = System.nanoTime();
                bubbleSort(arrBubble);
                long endBubble = System.nanoTime();
                System.out.println("Bubble Sort (" + size + "): " + (endBubble - startBubble) / 1_000_000.0 + " ms");
            } else {
                System.out.println("Bubble Sort (" + size + "): Skipped (too slow)");
            }

            // Merge Sort
            int[] arrMerge = original.clone();
            long startMerge = System.nanoTime();
            mergeSort(arrMerge, 0, arrMerge.length - 1);
            long endMerge = System.nanoTime();
            System.out.println("Merge Sort (" + size + "): " + (endMerge - startMerge) / 1_000_000.0 + " ms");

            // Quick Sort
            int[] arrQuick = original.clone();
            long startQuick = System.nanoTime();
            quickSort(arrQuick, 0, arrQuick.length - 1);
            long endQuick = System.nanoTime();
            System.out.println("Quick Sort (" + size + "): " + (endQuick - startQuick) / 1_000_000.0 + " ms");

            System.out.println("------------------------------");
        }
    }
}