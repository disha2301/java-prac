package com.gevernova.constructorsandvariables.modifiers;
class BankSystem{
    public static void main(String[] args){
        BankAccount obj = new BankAccount("1234567890", "Anjali", 5000.00);
        obj.displayDetails();

        // Modify balance using public methods
        obj.deposit(1500.00);
        obj.withdraw(1000.00);
        System.out.println("Updated Balance: ₹" + obj.getBalance());

        System.out.println();

        // Creating a SavingsAccount object
        SavingsAccount savings = new SavingsAccount("9876543210", "Ravi", 8000.00);
        savings.showAccountInfo();
    }
}

// Base class
public class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    // constructor
    BankAccount(String accNo, String holder, double initialBalance) {
        accountNumber = accNo;
        accountHolder = holder;
        balance = initialBalance;
    }

    // public getter method for private balance
    public double getBalance(){
        return balance;
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        }
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Display account details
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: ₹" + balance);
    }
}

// subclass demonstrating access to public and protected members

class SavingsAccount extends BankAccount{

    //constructor
    SavingsAccount(String accNo, String holder, double initialBalance) {
        super(accNo, holder, initialBalance);
    }

    // Accessing public and protected members
    public void showAccountInfo() {
        System.out.println("Savings Account Info:");
        System.out.println("Account Number: " + accountNumber);       // public
        System.out.println("Account Holder: " + accountHolder);       // protected
        // balance is private and cannot be accessed directly
    }
}


