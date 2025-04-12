package com.gevernova.objectmodeling.companycomposition;
import java.util.*;
// department class that belongs to company
class Department{
    String deptName;
    List<Employee> employees = new ArrayList<>();
    // constructor
    Department(String deptName){
        this.deptName = deptName;
    }
    // method to add employees in the department
    void addEmp(String name){
        employees.add(new Employee(name));
    }
    // method to display the department and its employees
    void displayDept(){
        System.out.println("Department: "+deptName);
        for(Employee emp : employees){
            emp.displayEmpName();
        }
    }
}
