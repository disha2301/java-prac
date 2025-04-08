package com.gevernova.controlflow.levelthree;
import java.util.*;
class GradeCalculator {  
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Taking input marks for 3 subjects
        System.out.print("Enter marks for Physics: ");
        int m1 = sc.nextInt();
        System.out.print("Enter marks for Chemistry: ");
        int m2 = sc.nextInt();
        System.out.print("Enter marks for Maths: ");
        int m3 = sc.nextInt();

        // Validate marks (must be between 0 and 100)
        if (m1 < 0 || m1 > 100 || m2 < 0 || m2 > 100 || m3 < 0 || m3 > 100) {
            System.out.println("Invalid marks entered!");
        } else {
            // Calculate total and percentage
            int total = m1 + m2 + m3;
            double per = total / 3.0;

            String grade, remarks;

            // Assign grade and remarks based on percentage
            if (per >= 80) {
                grade = "A";
                remarks = "Level 4, above agency-normalized standards";
            } else if (per >= 70) {
                grade = "B";
                remarks = "Level 3, at agency-normalized standards";
            } else if (per >= 60) {
                grade = "C";
                remarks = "Level 2, but approaching agency-normalized standards";
            } else if (per >= 50) {
                grade = "D";
                remarks = "Level 1, well below agency-normalized standards";
            } else if (per >= 40) {
                grade = "E";
                remarks = "Level 1-, too below agency-normalized standards";
            } else {
                grade = "R";
                remarks = "Remedial standards";
            }

            // Display results
            System.out.println("\n--- Result Summary ---");
            System.out.println("Physics: " + m1);
            System.out.println("Chemistry: " + m2);
            System.out.println("Maths: " + m3);
            System.out.println("Total Marks: " + total + "/300");
            System.out.println("Percentage: " + String.format("%.2f", per) + "%");
            System.out.println("Grade: " + grade);
            System.out.println("Remarks: " + remarks);
        }
    }
}
