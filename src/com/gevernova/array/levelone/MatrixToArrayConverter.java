package com.gevernova.array.levelone;

import java.util.*;

public class MatrixToArrayConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows and columns from user
        System.out.print("Enter rows: ");
        int row = scanner.nextInt();
        System.out.print("Enter columns: ");
        int column = scanner.nextInt();

        // Declare a 2D array (matrix) and a 1D array to store converted values
        int matrix[][] = new int[row][column];
        int array[] = new int[row * column]; // Total elements = rows * columns
        int index = 0; // Index for 1D array

        System.out.println("Enter matrix values:");

        // Input values into the matrix and simultaneously store them in the 1D array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = scanner.nextInt();       // Input for 2D array
                array[index] = matrix[i][j];       // Store same value in 1D array
                index++;
            }
        }

        // Print the 1D array
        System.out.println("1D Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
