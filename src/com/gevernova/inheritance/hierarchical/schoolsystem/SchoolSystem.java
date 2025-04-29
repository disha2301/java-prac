package com.gevernova.inheritance.hierarchical.schoolsystem;

// Main class to demonstrate the hierarchical inheritance
public class SchoolSystem {
    public static void main(String[] args) {
        Teacher mathTeacher = new Teacher("Mr. Sharma", 45, "Mathematics");
        Student highSchoolStudent = new Student("Ananya", 16, "10th Grade");
        Staff adminStaff = new Staff("Ramesh", 35, "Administration");

        mathTeacher.displayRole();
        System.out.println();

        highSchoolStudent.displayRole();
        System.out.println();

        adminStaff.displayRole();
    }
}
