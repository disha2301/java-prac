package com.gevernova.classandobject.levelone;

public class EmployeeDetails {

    //Attributes
    String name;
    int id;
    double salary;

    //Constructor to initialize Employee onject
    public EmployeeDetails(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    //Method to display employee details
    public void printDetails(){
        System.out.print("Employee name is "+name+"\nEmployee ID is "+id+"\nSalary is "+salary);
    }

    //main method to test the Employee class
    public static void main(String[] args){
        //creating employee object
        EmployeeDetails emp = new EmployeeDetails("Disha Yadav", 3213,75000);
        emp.printDetails();
    }
}
