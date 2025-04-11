package com.gevernova.inheritance.generalquestions;

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
public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal dog = new Dog("Charley", 2);
        Animal cat = new Cat("Coco", 1);
        Animal bird = new Bird("Mitmit", 5);
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}
