package com.gevernova.objectmodeling;
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

public class CompanyComposition {
    public static void main(String[] args){
        Company company = new Company("JPMC");
        Department finDept = new Department("Finance");
        finDept.addEmp("Disha");
        finDept.addEmp("Ahad");

        Department techDept = new Department("Tech");
        techDept.addEmp("Sakshi");

        company.addDept(finDept);
        company.addDept(techDept);

        company.showCompanyStructure();

        company.deleteCompany();
    }
}
