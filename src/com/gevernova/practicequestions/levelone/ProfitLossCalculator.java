package com.gevernova.practicequestions.levelone;

import java.io.*;

class ProfitLossCalculator {
    public static void main(String[] args) {
        // Cost price of the product
        double cp = 129;

        // Selling price of the product
        double sp = 191;

        // Calculate profit
        double p = sp - cp;

        // Calculate profit percentage
        double pPercentage = (p / sp) * 100;

        // Display the result
        System.out.println("The Cost Price is INR " + cp + " and Selling Price is INR " + sp);
        System.out.println("The Profit is INR " + p + " and the Profit Percentage is " + pPercentage + "%");
    }
}
