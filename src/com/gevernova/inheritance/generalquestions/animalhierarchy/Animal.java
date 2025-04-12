package com.gevernova.inheritance.generalquestions.animalhierarchy;

// superclass Animal with common attributes
class Animal{
    String name;
    int age;

    // constructor
    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    // method to be used by base classes
    void makeSound(){
        System.out.println("Animal makes a sound");
    }
}