package com.gevernova.string.leveltwo;
import java.util.Scanner;

public class SimpleReportCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Physics marks: ");
        int physics = scanner.nextInt();

        System.out.print("Enter Chemistry marks: ");
        int chemistry = scanner.nextInt();

        System.out.print("Enter Math marks: ");
        int math = scanner.nextInt();

        int total = physics + chemistry + math;
        double percentage = total / 3.0;

        String grade;
        if (percentage >= 90) grade = "A+";
        else if (percentage >= 80) grade = "A";
        else if (percentage >= 70) grade = "B";
        else if (percentage >= 60) grade = "C";
        else if (percentage >= 50) grade = "D";
        else grade = "F";

        System.out.println("\n--- Report Card ---");
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);
    }
}
