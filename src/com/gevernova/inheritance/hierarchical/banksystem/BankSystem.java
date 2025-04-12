package com.gevernova.inheritance.hierarchical.banksystem;

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