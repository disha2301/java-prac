package com.gevernova.array.leveltwo;
import java.util.*;
class GradeCalc {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int num = scanner.nextInt();

        int[][] marks = new int[num][3]; // [student][0:Physics, 1:Chemistry, 2:Maths]
        double[] per = new double[num];
        String[] grade = new String[num];
        String[] remarks = new String[num];

        for (int i = 0; i < num; i++) {
            System.out.println("Enter marks for Student " + (i + 1));

            System.out.print("Physics: ");
            marks[i][0] = scanner.nextInt();
            System.out.print("Chemistry: ");
            marks[i][1] = scanner.nextInt();
            System.out.print("Maths: ");
            marks[i][2] = scanner.nextInt();

            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                System.out.println("Invalid marks! Please enter non-negative values.");
                i--; // repeat for the same student
                continue;
            }

            per[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

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
            System.out.println("Student " + (i + 1) +
                " - Percentage: " + per[i] + "%, Grade: " + grade[i] +
                ", Remarks: " + remarks[i]);
        }
    }
}
