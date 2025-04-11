package com.gevernova.objectmodeling;

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
// bank class
class Bank{
    String bankName;
    // constructor
    Bank(String bankName){
        this.bankName = bankName;
    }
    // method to open a bank account
    void openAcc(Customer customer){
        System.out.println("Account opened for "+ customer.name +" in "+bankName);
    }
}
public class BankAssociation {
    public static void main(String[] args){
        Bank bank = new Bank("HDFC");
        Customer customer = new Customer("Disha", 50000);
        bank.openAcc(customer); // association : bank interacts with customer
        customer.displayBalance(); // customer method called independently
    }
}
