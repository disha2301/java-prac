package com.gevernova.inheritance.hybrid;
// interface defining common worker behavior
interface Worker{
    void performDuties();
}
// Superclass for common person attributes
class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}
// Chef class extends Person and implements Worker interface
class Chef extends Person implements Worker {
    String specialty;

    Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " (Chef) is cooking " + specialty + ".");
    }
}
// Waiter class extends Person and implements Worker interface
class Waiter extends Person implements Worker {
    int tablesAssigned;

    Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " (Waiter) is serving " + tablesAssigned + " tables.");
    }
}
// main class
public class RestaurantSystem {
    public static void main(String[] args) {
        // Create a Chef and a Waiter
        Chef chef = new Chef("Arjun", 101, "Italian Dishes");
        Waiter waiter = new Waiter("Kiran", 102, 5);

        // Display their details and duties
        chef.displayInfo();
        chef.performDuties();

        waiter.displayInfo();
        waiter.performDuties();
    }
}
