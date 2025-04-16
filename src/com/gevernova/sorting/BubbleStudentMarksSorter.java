package com.gevernova.sorting;
import java.util.Scanner;

public class BubbleStudentMarksSorter {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // Input number of students
        System.out.println("Enter number of students");
        int n = sc.nextInt();

        int marks[] = new int[n];

        // Input marks
        System.out.println("Enter marks");
        for(int i=0;i<n;i++){
            marks[i] = sc.nextInt();
        }

        // Bubble sort implementation
        for(int i = 0;i<n-1;i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (marks[j] > marks[j + 1]) {
                    // swapping the marks
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                }
            }
        }
        // Displaying the sorted array of marks
        System.out.println("Sorted marks are as follows");
        for(int i = 0;i<n;i++){
            System.out.print(marks[i]+" ");
        }
    }
}
