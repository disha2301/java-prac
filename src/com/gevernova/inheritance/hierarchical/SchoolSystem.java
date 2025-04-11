package com.gevernova.inheritance.hierarchical;
// Superclass representing a person in the school
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display basic person info
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
// Subclass representing a Teacher
class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println("Role: Teacher");
        displayInfo();
        System.out.println("Subject: " + subject);
    }
}
// Subclass representing a Student
class Student extends Person {
    String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println("Role: Student");
        displayInfo();
        System.out.println("Grade: " + grade);
    }
}
// Subclass representing a Staff member
class Staff extends Person {
    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        System.out.println("Role: Staff");
        displayInfo();
        System.out.println("Department: " + department);
    }
}
// main class
public class SchoolSystem {
    public static void main(String[] args) {
        Teacher t = new Teacher("Mr. Sharma", 45, "Mathematics");
        Student s = new Student("Ananya", 16, "10th Grade");
        Staff st = new Staff("Ramesh", 35, "Administration");

        t.displayRole();
        System.out.println();

        s.displayRole();
        System.out.println();

        st.displayRole();
    }
}
