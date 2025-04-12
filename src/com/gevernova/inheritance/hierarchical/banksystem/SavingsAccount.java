package com.gevernova.inheritance.hierarchical.banksystem;

// Subclass for Savings Account
class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        displayInfo();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
