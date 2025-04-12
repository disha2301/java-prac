package com.gevernova.oops.bankingsystem;

// Class CurrentAccount
class CurrentAccount extends BankAccount{
    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }
    @Override
    public double calcInterest(){
        return getBalance() * 0.02;
    }
}
