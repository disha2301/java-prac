package com.gevernova.objectmodeling.bankassociation;

// bank class
class Bank{
    String bankName;
    // constructor
    Bank(String bankName){
        this.bankName = bankName;
    }
    // method to open a bank account
    void openAcc(Customer customer){
        System.out.println("Account opened for "+ customer.name +" in "+bankName);
    }
}

