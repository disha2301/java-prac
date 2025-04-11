package com.gevernova.inheritance.generalquestions;

// Base class representing a generic employee
class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display basic employee details
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: ₹" + salary);
    }
}

// Manager class with additional attribute teamSize
class Manager extends Employee {
    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

// Developer class with an additional attribute programmingLanguage
class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}


// Intern class with additional attribute duration (in months)
class Intern extends Employee {
    int duration; // in months

    Intern(String name, int id, double salary, int duration) {
        super(name, id, salary);
        this.duration = duration;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + duration + " months");
    }
}
// main class to test the hierarchy
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Manager m1 = new Manager("Disha", 101, 90000, 5);
        Developer d1 = new Developer("Ravi", 102, 75000, "Java");
        Intern i1 = new Intern("Sneha", 103, 15000, 3);

        System.out.println("Manager Details:");
        m1.displayDetails();

        System.out.println("\nDeveloper Details:");
        d1.displayDetails();

        System.out.println("\nIntern Details:");
        i1.displayDetails();
    }
}
