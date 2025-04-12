package com.gevernova.oops.bankingsystem;

// SavingsAccount class
class SavingsAccount extends BankAccount implements Lonable{
    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }
    @Override
    public double calcInterest(){
        return getBalance() * 0.04;
    }
    @Override
    public void applyForLoan(double amt){
        System.out.println("Savings Account Loan Applied: ₹" + amt);
    }
    @Override
    public boolean calculateLoanEligibility(){
        return getBalance() > 5000;
    }
}
