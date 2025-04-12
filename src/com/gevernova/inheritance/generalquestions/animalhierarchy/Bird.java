package com.gevernova.inheritance.generalquestions.animalhierarchy;

// Subclass Bird
class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " (Bird): Tweet tweet!");
    }
}