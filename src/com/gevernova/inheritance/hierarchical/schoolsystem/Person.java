package com.gevernova.inheritance.hierarchical.schoolsystem;

// Superclass representing a person in the school
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display basic person info
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

