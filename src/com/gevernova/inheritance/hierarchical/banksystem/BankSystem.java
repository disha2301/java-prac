package com.gevernova.inheritance.hierarchical.banksystem;

public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("SA123", 15000, 4.5);
        CheckingAccount checkingAccount = new CheckingAccount("CA456", 10000, 2000);
        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount("FD789", 50000, 12);

        savingsAccount.displayAccountType();
        System.out.println();

        checkingAccount.displayAccountType();
        System.out.println();

        fixedDepositAccount.displayAccountType();
    }
}
