package com.gevernova.constructorsandvariables.modifiers;

class Student {
    public int rollNumber;          // Public - accessible anywhere
    protected String name;          // Protected - accessible in subclass
    private double CGPA;            // Private - accessible only inside this class

    // Constructor to initialize the object
    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to get CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to set CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    // Display student details
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// Subclass to demonstrate use of protected member
class PostgraduateStudent extends Student {
    PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    // Accessing protected member 'name'
    public void showName() {
        System.out.println("Postgraduate Student Name: " + name);
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create Student object
        Student obj = new Student(80, "Disha", 9.7);
        obj.displayDetails();

        // Update CGPA using setter
        obj.setCGPA(9.8);
        System.out.println("Updated CGPA: " + obj.getCGPA());

        System.out.println();

        // Create PostgraduateStudent object
        PostgraduateStudent pgStudent = new PostgraduateStudent(94, "Ahad", 9.9);
        pgStudent.displayDetails();
        pgStudent.showName(); // Accessing protected name
    }
}
