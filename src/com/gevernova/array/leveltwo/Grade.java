package com.gevernova.array.leveltwo;
import java.util.*;
class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int num = scanner.nextInt();

        int[] physics = new int[num]; // Physics
        int[] chemistry = new int[num]; // Chemistry
        int[] maths = new int[num]; // Maths
        double[] per = new double[num];
        String[] grade = new String[num];
        String[] remarks = new String[num];

        for (int i = 0; i < num; i++) {
            System.out.println("Enter marks for Student " + (i + 1));

            System.out.print("Physics: ");
            physics[i] = scanner.nextInt();
            System.out.print("Chemistry: ");
            chemistry[i] = scanner.nextInt();
            System.out.print("Maths: ");
            maths[i] = scanner.nextInt();

            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                System.out.println("Invalid marks entered! Marks cannot be negative. Please re-enter.");
                i--; // Repeat for the same student
                continue;
            }

            per[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;

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
        for (int i = 0; i < num; i++) {
            System.out.println("Student " + (i + 1) + " - Percentage: " + per[i] + "%, Grade: " + grade[i] + ", Remarks: " + remarks[i]);
        }
    }
}
