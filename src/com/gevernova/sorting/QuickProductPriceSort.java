package com.gevernova.sorting;
import java.util.Scanner;

public class QuickProductPriceSort {

    // method to perform quick sort
    public static void quicksort(int[] price, int low, int high){
        if(low < high){
            int pivot = partition(price, low, high);

            // sort elements before and after partition
            quicksort(price, low, pivot - 1);
            quicksort(price, pivot+1, high);
        }
    }
    // method to implement partition functionality
    public static int partition(int[] price, int low, int high){
        int pivot = price[high]; // choosing the last element as pivot
        int i = low - 1; // index of smaller element

        for(int j = low; j< high; j++){
            if(price[j] < pivot){
                i++;

                // swap
                int temp = price[i];
                price[i] = price[j];
                price[j] = temp;
            }
        }

        // swapping price[i + 1] and pivot

        int temp = price[i+1];
        price[i+1] = price[high];
        price[high] = temp;
        return i + 1;
    }

    // main method to test the sorting
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of products : ");
        int num = scanner.nextInt();
        int[] price = new int[num];

        System.out.println("Enter the prices : ");
        for(int i = 0; i < num; i++){
            price[i] = scanner.nextInt();
        }

        // calling quick sort method
        quicksort(price,0,num-1);
        System.out.println("Sorted product prices : ");
        for(int i = 0; i < num; i++){
            System.out.print(price[i]+" ");
        }
    }
}
