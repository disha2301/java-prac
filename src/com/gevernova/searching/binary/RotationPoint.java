package com.gevernova.searching.binary;
import java.util.Scanner;

public class RotationPoint {

    // method to find the index of the smallest element (point of rotation)
    public static int bubbleRotationFind(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            int mid = (left + right) / 2;

            // if the mid element ig greater than right, the smallest is in right half
            if(arr[mid] > arr[right]){
                left = mid+1;
            }
            // if mid element is less than or equal to right, the smallest is in left half
            else{
                right = mid;
            }
        }
        // when left == right, we've found the smallest element
        return left;
    }
    // main method
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the rotated sorted array");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        // find the rotation point
        int index = bubbleRotationFind(arr);

        // output the index and value
        System.out.println("Rotation point index : "+index);
        System.out.println("Smallest Element is : "+arr[index]);
    }
}
