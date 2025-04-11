package com.gevernova.inheritance.hierarchical;
// Base class for all account types
class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Display basic account info
    void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}
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
// Subclass for Checking Account
class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        displayInfo();
        System.out.println("Withdrawal Limit: ₹" + withdrawalLimit);
    }
}
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
public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA123", 15000, 4.5);
        CheckingAccount ca = new CheckingAccount("CA456", 10000, 2000);
        FixedDepositAccount fda = new FixedDepositAccount("FD789", 50000, 12);

        sa.displayAccountType();
        System.out.println();

        ca.displayAccountType();
        System.out.println();

        fda.displayAccountType();
    }
}
