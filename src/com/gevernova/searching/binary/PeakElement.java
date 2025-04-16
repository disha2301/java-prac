package com.gevernova.searching.binary;
import java.util.Scanner;

public class PeakElement {
    // method to return the index of the peak element using the bubble sort technique
    public static int bubblePeakElement(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            // directly finding the peak element which is greater than its neighbours
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return arr[mid];
            }
            // if mid is less that the left element then
            else if (arr[mid] < arr[mid - 1]) {
                right = mid - 1;
            }
            // if mid is less that the right element then
            else if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            }
            else{
                return arr[left];
            }
        }
        // in case of no peak element
        return -1;
    }
    // main method
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Start entering the input in the required fields : ");
        for(int i = 0; i < n; i++){
            System.out.print("At index "+i+": ");
            arr[i] = sc.nextInt();
        }
        // storing the peak element result derived from the function
        int result = bubblePeakElement(arr);
        System.out.println(result == -1?"No peak element found":"Peak element is "+result);
    }
}
