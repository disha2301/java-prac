package com.gevernova.inheritance.generalquestions.employeemanagementsystem;

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
