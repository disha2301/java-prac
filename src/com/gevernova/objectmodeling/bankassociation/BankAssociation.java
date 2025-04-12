package com.gevernova.objectmodeling.bankassociation;

public class BankAssociation {
    public static void main(String[] args){
        Bank bank = new Bank("HDFC");
        Customer customer = new Customer("Disha", 50000);
        bank.openAcc(customer); // association : bank interacts with customer
        customer.displayBalance(); // customer method called independently
    }
}