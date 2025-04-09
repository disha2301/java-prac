package com.gevernova.keywords;

// base class
class BankAccount {
    // static variable which is shared across all
    static String bankName = "Yes Bank";

    // static counter to keep track of total accounts
    static int totalAccounts = 0;

    // final variable to ensure account number can not be changed
    final int accountNumber;

    // instance variable for account holder
    String accountHolderName;

    // Constructor using this keyword
    BankAccount(String accountHolderName, int accountNumber){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    // static method to display total number of accounts
    static void getTotalAccounts(){
        System.out.println("Total accounts created "+totalAccounts);
    }

    // method to display account details
    void displayDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
    }
}
// Main class to test the BankAccount class
class BankSystem {
    public static void main(String[] args) {
        // Create account objects
        BankAccount obj1 = new BankAccount("Alice", 1001);
        BankAccount obj2 = new BankAccount("Bob", 1002);

        // Use instanceof before displaying details
        if (obj1 instanceof BankAccount) {
            obj1.displayDetails();
        }

        if (obj2 instanceof BankAccount) {
            obj2.displayDetails();
        }

        // Show total accounts
        BankAccount.getTotalAccounts();
    }
}
