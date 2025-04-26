package com.gevernova.searching.linear;
import java.util.Scanner;

public class FirstNegativeNumber {

    // method to perform linear search
    public static int linearSearch(int[] arr){
        for(int i = 0; i < arr.length; i++){
            // check if negative
            if(arr[i] < 0)
                return i;
            // returning the index of the first negative number
        }
        return -1; // no negative number found
    }
    // main method
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter values");
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }

        // call method to find the first negative number
        int result = linearSearch(arr);
        // display the output
        System.out.println(result != -1? "First negative found at index "+result:"No negative numbers found");
    }
}
