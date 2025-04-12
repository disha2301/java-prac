package com.gevernova.inheritance.hierarchical.banksystem;

// Subclass for Fixed Deposit Account
class FixedDepositAccount extends BankAccount {
    int depositDuration; // in months

    FixedDepositAccount(String accountNumber, double balance, int depositDuration) {
        super(accountNumber, balance);
        this.depositDuration = depositDuration;
    }

    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        displayInfo();
        System.out.println("Deposit Duration: " + depositDuration + " months");
    }
}