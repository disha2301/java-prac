package com.gevernova.keywords;

class Student {
    // Static variable shared by all students
    static String universityName = "Gevernova University";
    static int totalStudents = 0;

    // Final variable to ensure rollNumber cannot be modified
    final int rollNumber;

    // Instance variables
    String name;
    char grade;

    // Constructor using 'this' to resolve ambiguity
    Student(int rollNumber, String name, char grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++; // Increment student count
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("University: " + universityName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }

    // Method to update grade
    void updateGrade(char newGrade) {
        this.grade = newGrade;
        System.out.println("Grade updated to: " + grade);
    }

    // Static method to display total number of students
    static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }
}

// Main class to demonstrate the features
class UniversityStudentManagement {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Aanya", 'A');
        Student s2 = new Student(102, "Rohan", 'B');

        // Check if object is an instance before performing operations
        if (s1 instanceof Student) {
            s1.displayDetails();
            s1.updateGrade('A');
        }

        System.out.println();

        if (s2 instanceof Student) {
            s2.displayDetails();
        }

        System.out.println();

        // Display total number of students
        Student.displayTotalStudents();
    }
}