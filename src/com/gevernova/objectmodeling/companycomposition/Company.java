package com.gevernova.objectmodeling.companycomposition;
import java.util.*;
// company class (has department and employees composition)
class Company{
    String name;
    List<Department> departments = new ArrayList<>();
    // constructor
    Company(String name) {
        // resembles company name
        this.name = name;
    }
    // method to add departments to the company
    void addDept(Department dept) {
        departments.add(dept);
    }

    // method to display the company structure
    void showCompanyStructure(){
        System.out.println("Company : "+name);
        for(Department dept : departments){
            dept.displayDept();
        }
    }

    // method to delete the department and hence the employees
    void deleteCompany(){
        departments.clear();
        System.out.println("Company '" + name + "' and all departments/employees have been deleted.");
    }
}
