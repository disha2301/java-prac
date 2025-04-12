package com.gevernova.oops.employeemanagementsystem;

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