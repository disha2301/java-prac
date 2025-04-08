package com.gevernova.array.leveltwo;
import java.util.*;
class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] a = new int[n]; // Physics
        int[] b = new int[n]; // Chemistry
        int[] m = new int[n]; // Maths
        double[] per = new double[n];
        String[] grade = new String[n];
        String[] remarks = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for Student " + (i + 1));

            System.out.print("Physics: ");
            a[i] = sc.nextInt();
            System.out.print("Chemistry: ");
            b[i] = sc.nextInt();
            System.out.print("Maths: ");
            m[i] = sc.nextInt();

            if (a[i] < 0 || b[i] < 0 || m[i] < 0) {
                System.out.println("Invalid marks entered! Marks cannot be negative. Please re-enter.");
                i--; // Repeat for the same student
                continue;
            }

            per[i] = (a[i] + b[i] + m[i]) / 3.0;

            if (per[i] >= 80) {
                grade[i] = "A";
                remarks[i] = "Level 4, above agency-normalized standards";
            } else if (per[i] >= 70) {
                grade[i] = "B";
                remarks[i] = "Level 3, at agency-normalized standards";
            } else if (per[i] >= 60) {
                grade[i] = "C";
                remarks[i] = "Level 2, but approaching agency-normalized standards";
            } else if (per[i] >= 50) {
                grade[i] = "D";
                remarks[i] = "Level 1, well below agency-normalized standards";
            } else if (per[i] >= 40) {
                grade[i] = "E";
                remarks[i] = "Level 1-, too below agency-normalized standards";
            } else {
                grade[i] = "R";
                remarks[i] = "Remedial standards";
            }
        }

        System.out.println("\n--- Results ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + " - Percentage: " + per[i] + "%, Grade: " + grade[i] + ", Remarks: " + remarks[i]);
        }
    }
}
