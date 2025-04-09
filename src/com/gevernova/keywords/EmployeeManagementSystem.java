package com.gevernova.keywords;

class Employee {
    // Static variable shared among all employees
    static String companyName = "TechNova Solutions";

    // Static variable to count total employees
    static int totalEmployees = 0;

    // Final variable for employee ID
    final int id;

    // Instance variables
    String name;
    String designation;

    // Constructor using 'this' to resolve ambiguity
    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++; // Increment count each time an employee is created
    }

    // Static method to display total number of employees
    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
    }
}

// Main class to test the program
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Aarav", 101, "Software Developer");
        Employee emp2 = new Employee("Nisha", 102, "HR Manager");

        // Check if objects are instances of Employee before displaying details
        if (emp1 instanceof Employee) {
            emp1.displayDetails();
        }

        System.out.println();

        if (emp2 instanceof Employee) {
            emp2.displayDetails();
        }

        System.out.println();

        // Display total employees using static method
        Employee.displayTotalEmployees();
    }
}