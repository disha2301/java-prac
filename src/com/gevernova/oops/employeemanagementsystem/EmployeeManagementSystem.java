package com.gevernova.oops.employeemanagementsystem;

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