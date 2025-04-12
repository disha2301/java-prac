package com.gevernova.objectmodeling.companycomposition;
import java.util.ArrayList;
import java.util.List;
// Employee class that belong to department
class Employee{
    String name;

    // constructor method
    Employee(String name){
        this.name = name;
    }

    // method to show the employee names
    void displayEmpName(){
        System.out.println("Employee : "+name);
    }
}
