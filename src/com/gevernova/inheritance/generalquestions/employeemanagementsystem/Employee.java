package com.gevernova.inheritance.generalquestions.employeemanagementsystem;

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