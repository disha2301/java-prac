package com.gevernova.sorting;

import java.util.Scanner;

public class MergeBookPriceSorter {

    // Recursive method to divide and sort
    public static void mergeSort(int[] prices, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            int middleIndex = leftIndex + (rightIndex - leftIndex) / 2;

            // Sort first and second halves
            mergeSort(prices, leftIndex, middleIndex);
            mergeSort(prices, middleIndex + 1, rightIndex);

            // Merge the sorted halves
            merge(prices, leftIndex, middleIndex, rightIndex);
        }
    }

    // Method to merge two sorted parts
    public static void merge(int[] prices, int leftIndex, int middleIndex, int rightIndex) {
        int sizeLeft = middleIndex - leftIndex + 1;
        int sizeRight = rightIndex - middleIndex;

        // Create temporary arrays
        int[] leftArray = new int[sizeLeft];
        int[] rightArray = new int[sizeRight];

        // Copy data to temp arrays
        for (int i = 0; i < sizeLeft; i++)
            leftArray[i] = prices[leftIndex + i];
        for (int j = 0; j < sizeRight; j++)
            rightArray[j] = prices[middleIndex + 1 + j];

        // Merge the temp arrays back into prices[]
        int i = 0, j = 0;
        int k = leftIndex;

        while (i < sizeLeft && j < sizeRight) {
            if (leftArray[i] <= rightArray[j]) {
                prices[k] = leftArray[i];
                i++;
            } else {
                prices[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray if any
        while (i < sizeLeft) {
            prices[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray if any
        while (j < sizeRight) {
            prices[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for number of book prices
        System.out.print("Enter number of books: ");
        int numberOfBooks = scanner.nextInt();
        int[] bookPrices = new int[numberOfBooks];

        // Input prices from user
        System.out.println("Enter the prices of the books:");
        for (int i = 0; i < numberOfBooks; i++) {
            bookPrices[i] = scanner.nextInt();
        }

        // Call mergeSort function
        mergeSort(bookPrices, 0, numberOfBooks - 1);

        // Display sorted prices
        System.out.println("Sorted book prices:");
        for (int price : bookPrices) {
            System.out.print(price + " ");
        }
    }
}
