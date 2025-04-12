package com.gevernova.inheritance.generalquestions.animalhierarchy;


// subclass Cat
class Cat extends Animal{
    // constructor
    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " (Cat): Meow");
    }
}