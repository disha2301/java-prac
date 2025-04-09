package com.gevernova.classandobject.leveltwo;

public class BankAccDetails {

    // Attributes
    String accountHolder;
    String accountNumber;
    double balance;

    // Constructor to initialize bank account
    public BankAccDetails(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Deposit amount must be greater than 0.");
        }
    }

    // Method to withdraw money if sufficient balance exists
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than 0.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Transaction declined.");
        } else {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        }
    }


    // Method to display current balance
    public void displayBalance() {
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Current Balance: ₹" + balance);
    }


    // Main method to test the BankAccount class
    public static void main(String[] args) {
        // Creating a bank account
        BankAccDetails obj = new BankAccDetails("Disha Yadav", "SB1234", 5000.00);
        // Display initial details
        obj.displayBalance();

        // Deposit and withdraw money
        obj.deposit(2000);
        obj.withdraw(1500);
        obj.withdraw(7000); // should fail due to insufficient balance

        // Display final balance
        obj.displayBalance();
    }
}
