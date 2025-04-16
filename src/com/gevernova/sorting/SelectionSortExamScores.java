package com.gevernova.sorting;
import java.util.Scanner;

public class SelectionSortExamScores {

    // method to perform selection sort
    public static void selectionSort(int[] score) {
        int n = score.length;

        // loop through the array
        for (int i = 0; i < n - 1; i++) {
            // assume the current index has the minimum value
            int minIndex = i;
            for (int j = i; j < n - 1; j++) {
                if (score[j] < score[minIndex]) {
                    minIndex = j;
                }
                int temp = score[minIndex];
                score[minIndex] = score[i];
                score[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take the user input
        System.out.print("Enter number of students : ");
        int n = sc.nextInt();
        int[] score = new int[n];

        // Input exam score
        System.out.println("Enter exam scores");
        for(int i = 0; i < n; i++){
            score[i] = sc.nextInt();
        }
        // sort the scores using selection sort
        selectionSort(score);

        // Display sorted scores
        System.out.println("Sorted exam scores :");
        for(int i = 0; i < n; i++){
            System.out.print(score[i]+ " ");
        }
    }
}




