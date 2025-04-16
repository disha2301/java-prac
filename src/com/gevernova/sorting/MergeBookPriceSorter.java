package com.gevernova.sorting;
import java.util.Scanner;

public class MergeBookPriceSorter {

    // recursive method to divide and sort
    public static void mergesort(int[] price, int left, int right){
        if(left < right){
            int mid = left + (right - left) / 2;

            // sort first and second halves
            mergesort(price, left, mid);
            mergesort(price, mid + 1, right);

            // merge the sorted halves
            merge(price, left, mid, right);
        }
    }
    // method to merge two sorted parts
    public static void merge(int[] price, int left, int mid, int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // creating temporary arrays
        int[] l = new int[n1];
        int[] r = new int[n2];

        //copy data to temp arrays
        for(int i = 0; i < n1; i++)
            l[i] = price[left + i];
        for(int j = 0; j < n2; j++)
            r[j] = price[mid + 1 + j];

        // merge the temp arrays back into price[]
        int i = 0, j = 0;
        int k = left;

        while(i < n1 && j < n2){
            if(l[i] <= r[j]){
                price[k] = l[i];
                i++;
            }
            else{
                price[k] = r[j];
                j++;
            }
            k++;
        }

        // copy remaining elements if any
        while( i < n1){
            price[k] = l[i];
            i++;
            k++;
        }
        while(j < n2){
            price[k] = r[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // take user input for number of book prices
        System.out.print("Enter number of books : ");
        int n = sc.nextInt();
        int[] price = new int[n];

        // input prices from user
        System.out.println("Enter the prices of the books : ");
        for(int i = 0;i < n;i++){
            price[i] = sc.nextInt();
        }

        // call mergesort function
        mergesort(price,0,n-1);

        // display sorted prices
        System.out.println("Sorted book prices");
        for(int i = 0; i < n; i++){
            System.out.print(price[i] + " ");
        }
    }

}
