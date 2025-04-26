package com.gevernova.searching.binary;
import java.util.Scanner;

public class FirstAndLastOccurence {

    // method to find the first occurence of a target
    public static int firstOccurence(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        int first = -1;
        while(left <= right){
            int mid = (left + right)/2;
            if(arr[mid] == target){
                first = mid;
                right = mid - 1; // continue searching on the right side
            }else if(arr[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return first;
    }

    // method to find last occurence of target
    public static int lastOccurence(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        int last = -1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(arr[mid] == target){
                last = mid;
                left = mid+1; // continue searching on the right side
            }else if(arr[mid] < target){
                left = mid + 1;
            } else{
                right = mid - 1;
            }
        }
        return last;
    }
    // main method
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter sorted elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter target to find: ");
        int target = scanner.nextInt();

        int first = firstOccurence(arr, target);
        int last = lastOccurence(arr, target);

        if (first == -1) {
            System.out.println("Target not found in array.");
        } else {
            System.out.println("First occurrence at index: " + first);
            System.out.println("Last occurrence at index: " + last);
        }
    }
}
