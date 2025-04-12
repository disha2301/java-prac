package com.gevernova.oops.bankingsystem;

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
