package com.gevernova.inheritance.generalquestions.animalhierarchy;

// subclass Dog
class Dog extends Animal{
    // constructor
    Dog(String name, int age){
        super(name, age);
    }
    @Override
    void makeSound(){
        System.out.println(name + " (Dog): Barks");
    }
}