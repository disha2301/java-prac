package com.gevernova.objectmodeling.bankassociation;

// customer class
class Customer{
    String name;
    double balance;
    // constructor
    Customer(String name, double balance){
        this.name = name;
        this.balance = balance;
    }
    // method to view the balance
    void displayBalance(){
        System.out.println(name +"has "+balance+" balance");
    }
}