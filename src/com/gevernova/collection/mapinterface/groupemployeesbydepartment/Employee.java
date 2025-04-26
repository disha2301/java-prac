package com.gevernova.collection.mapinterface.groupemployeesbydepartment;

class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String toString() {
        return name;
    }
}