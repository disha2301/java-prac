package com.gevernova.sorting;
import java.util.Scanner;

public class SelectionSortExamScores {

    // method to perform selection sort
    public static void selectionSort(int[] score) {
        int num = score.length;

        // loop through the array
        for (int i = 0; i < num - 1; i++) {
            // assume the current index has the minimum value
            int minIndex = i;
            for (int j = i; j < num - 1; j++) {
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
        Scanner scanner = new Scanner(System.in);
        // take the user input
        System.out.print("Enter number of students : ");
        int num = scanner.nextInt();
        int[] score = new int[num];

        // Input exam score
        System.out.println("Enter exam scores");
        for(int i = 0; i < num; i++){
            score[i] = scanner.nextInt();
        }
        // sort the scores using selection sort
        selectionSort(score);

        // Display sorted scores
        System.out.println("Sorted exam scores :");
        for(int i = 0; i < num; i++){
            System.out.print(score[i]+ " ");
        }
    }
}




