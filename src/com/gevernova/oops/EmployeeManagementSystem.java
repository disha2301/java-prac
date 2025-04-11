package com.gevernova.oops;

// Abstract class for employee
abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Encapsulation via getters and setters
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // Abstract method
    public abstract double calculateSalary();

    // Concrete method
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Final Salary: " + calculateSalary());
    }
}

// Interface for department
interface Department {
    void assignDepartment(String deptName);
    String getDeptDetails();
}

// Full-time employee subclass
class FullTimeEmp extends Employee implements Department {
    private String dept;
    private double bonus;

    public FullTimeEmp(int employeeId, String name, double baseSalary, double bonus) {
        super(employeeId, name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }

    @Override
    public void assignDepartment(String deptName) {
        this.dept = deptName;
    }

    @Override
    public String getDeptDetails() {
        return "Full-time Department: " + dept;
    }
}

// Part-time employee subclass
class PartTimeEmp extends Employee implements Department {
    private String department;
    private int hoursWorked;
    private double hrsRate;

    public PartTimeEmp(int employeeId, String name, double hrsRate, int hoursWorked) {
        super(employeeId, name, hrsRate);
        this.hrsRate = hrsRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hrsRate * hoursWorked;
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public String getDeptDetails() {
        return "Part-time Department: " + department;
    }
}

// Driver class
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Polymorphic employee references
        Employee emp1 = new FullTimeEmp(80, "Disha", 1200, 200);
        Employee emp2 = new PartTimeEmp(94, "Ahad", 120, 45);

        // Assign departments
        ((Department) emp1).assignDepartment("HR");
        ((Department) emp2).assignDepartment("IT");

        // Display info using polymorphism
        Employee[] employees = {emp1, emp2};
        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println(((Department) emp).getDeptDetails());
            System.out.println("--------------------------------");
        }
    }
}
