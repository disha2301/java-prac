package com.gevernova.constructorsandvariables.modifiers;

// main class
class EmployeeRecord{
    public static void main(String[] args){
        // object creation
        Employee obj1 = new Employee(80,"CSE",50000);
        obj1.setSalary(75000);
        System.out.println("Updated salary is "+obj1.getSalary());

        Manager obj2 = new Manager(94, "Finance", 52000);
                obj2.showManagerInfo();
    }
}
// base class
class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    // constructor to initialize employee object
    Employee(int employeeID, String department,double salary){
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // public method to get salary
    public double getSalary(){
        return salary;
    }

    // public method to set salary
    public void setSalary(double salary){
        if(salary > 0) {
            this.salary = salary;
        }
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: ₹" + salary);
    }
}
// subclass demonstrating access to public and protected members
class Manager extends Employee{

    // constructor
    Manager(int id, String dept, double salary){
        super(id, dept, salary);
    }

    // Method to show manager-specific info
    public void showManagerInfo() {
        System.out.println("Manager Details:");
        System.out.println("Employee ID: " + employeeID);     // public
        System.out.println("Department: " + department);      // protected
        // salary is private and cannot be accessed directly here
    }
}
