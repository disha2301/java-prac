package com.gevernova.oops.employeemanagementsystem;

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
