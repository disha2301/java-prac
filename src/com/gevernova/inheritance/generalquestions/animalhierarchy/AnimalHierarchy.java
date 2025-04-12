package com.gevernova.inheritance.generalquestions.animalhierarchy;
// main class
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
