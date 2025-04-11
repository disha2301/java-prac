package com.gevernova.oops;
// abstract class
abstract class BankAccount{
    private String accNo;
    private String holderName;
    private double balance;

    //constructor
    public BankAccount(String accNo, String holderName, double balance){
        this.accNo = accNo;
        this. holderName = holderName;
        this.balance = balance;
    }

    // getter method
    public String getAccNo(){
        return  accNo;
    }
    public String getHolderName(){
        return holderName;
    }
    public double getBalance(){
        return balance;
    }

    //deposit method
    public void deposite(double amt){
        if(amt > 0){
            balance += amt;
            System.out.println("Deposited "+amt+" into "+ accNo);
        }
    }

    // withdraw method
    public void withdraw(double amt){
        if(amt <= balance){
            balance -= amt;
            System.out.println("Withdraw "+amt+" from "+accNo);
        }else{
            System.out.println("Insufficient balance in "+accNo );
        }
    }

    // abstract method declaration
    public abstract double calcInterest();

    public void displayDetails(){
        System.out.println("Account : "+accNo+"\nHolder : "+holderName+"\nBalance : "+balance);
    }
}

// interface for loan-related methods
interface Lonable{
    void applyForLoan(double amt);
    boolean calculateLoanEligibility();
}

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

// main class
public class BankingSystem{
    public static void main(String args[]){
        BankAccount[] accounts = {
                new SavingsAccount("SB1001", "Disha", 1000),
                new CurrentAccount("AX6767","Ahad", 78000)
        };
        for(BankAccount account : accounts){
            account.displayDetails();
            System.out.println("Interest Earned: ₹" + account.calcInterest());
            if (account instanceof Lonable) {
                Lonable loanAccount = (Lonable) account;
                loanAccount.applyForLoan(20000);
                System.out.println("Loan Eligible: " + loanAccount.calculateLoanEligibility());
            }
        }
    }
}