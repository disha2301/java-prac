package com.gevernova.oops.bankingsystem;

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


