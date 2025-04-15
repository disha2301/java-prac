package com.gevernova.objectdesign.SchoolResultsApp;
import java.util.*;

// Class to calculate and display the student's total marks, average, and grade
class GradeCalculator {
    // Method to calculate the grades of a student based on their subjects
    public static void calculateGrades(Student student) {
        List<Subject> subjects = student.getSubjects();
        int total = 0;

        // Summing up marks of all subjects
        for (Subject s : subjects) {
            total += s.getMarks();
        }

        // Calculating average
        double average = (double) total / subjects.size();
        String grade;

        // Determining grade based on the average
        if (average >= 90) grade = "A";
        else if (average >= 75) grade = "B";
        else if (average >= 60) grade = "C";
        else if (average >= 40) grade = "D";
        else grade = "F";

        // Displaying the result
        System.out.println("Student: " + student.getName());
        System.out.println("Total Marks: " + total);
        System.out.printf("Average: %.2f\n", average);
        System.out.println("Grade: " + grade);
    }
}
