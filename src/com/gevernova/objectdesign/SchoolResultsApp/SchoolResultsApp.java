package com.gevernova.objectdesign.SchoolResultsApp;

// Class to test the School Results Application
public class SchoolResultsApp {
    public static void main(String[] args) {
        // Creating a new student object
        Student s1 = new Student("Disha");

        // Adding subjects to the student's record
        s1.addSubject(new Subject("Math", 85));
        s1.addSubject(new Subject("Science", 92));
        s1.addSubject(new Subject("English", 78));

        // Calculating and displaying the student's results
        GradeCalculator.calculateGrades(s1);
    }
}