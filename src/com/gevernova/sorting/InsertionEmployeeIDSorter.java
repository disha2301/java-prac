package com.gevernova.sorting;
import java.util.Scanner;

public class InsertionEmployeeIDSorter {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        // Taking user input for the number of employees
        System.out.print("Enter number of employees : ");
        int n = scanner.nextInt();

        int id[] = new int[n];

        // Taking user input for the employee IDs
        System.out.print("Enter employee IDs");
        for(int i = 0; i<n; i++){
            id[i] = scanner.nextInt();
        }

        // Insertion sort implementation
        for(int i = 1; i < n; i++){
            int key = id[i]; // current number to be placed correctly
            int j = i - 1;

            // Move larger numbers one position ahead
            while(j>=0 && id[j]>key){
                id[j+1] = id[j];
                j--;
            }

            // Placed key at its correct position
            id[ j + 1 ] = key;
        }

        // Output of the insertion sort
        System.out.println("Sorted Employee IDs : ");
        for(int i = 0; i < n; i++){
            System.out.print(id[i]+" ");
        }
    }
}
