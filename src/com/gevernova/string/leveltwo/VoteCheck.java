package com.gevernova.string.leveltwo;
import java.util.Scanner;
public class VoteCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[10];

        System.out.println("Enter age for 10 students:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }

        System.out.println("\nResult:");
        for (int i = 0; i < 10; i++) {
            if (ages[i] >= 18) {
                System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + "): Can Vote");
            } else {
                System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + "): Cannot Vote");
            }
        }
    }
}
