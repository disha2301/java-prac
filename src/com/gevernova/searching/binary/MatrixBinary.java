package com.gevernova.searching.binary;
import java.util.Scanner;

public class MatrixBinary {

    // binary search method for 2D matrix
    public static boolean searchMatrix(int[][] m, int target) {
        int rows = m.length;
        int cols = m[0].length;
        int left = 0;
        int right = rows * cols - 1;
        while (left <= right) {
            int mid = (left + right) / 2;

            // converting 1D mid index to 2D
            int row = mid / cols;
            int col = mid % cols;

            int midValue = m[row][col];

            if (midValue == target) {
                return true; // target is found
            } else if (target < midValue) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false; // in case target is not found
    }

    // main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns : ");
        int cols = scanner.nextInt();
        int[][] m = new int[rows][cols];

        // input matrix values
        System.out.println("Enter matrix elements in sorted row-wise order");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                m[i][j] = scanner.nextInt();
            }
        }
        // input target value
        System.out.print("Enter the value to search : ");
        int target = scanner.nextInt();

        // perform search
        boolean found = searchMatrix(m, target);
        System.out.println(found ? "Target found in matrix!" : "Target not found.");
    }
}
