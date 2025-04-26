package com.gevernova.method.levelone;
import java.util.Scanner; // Import Scanner class to take user input

class SimpleInterest {

    // Method to calculate Simple Interest
    // Formula: (Principal * Rate * Time) / 100
    public static double interestCalc(double p, double r, double t) {
        return (p * r * t) / 100;
    }

    public static void main(String args[]) {
        // Create a Scanner object for reading user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter Principal amount
        System.out.print("Enter Principal: ");
        double principal = scanner.nextDouble(); // Store input in 'principal'

        // Prompt user to enter Rate of Interest
        System.out.print("Enter Rate of Interest: ");
        double rate = scanner.nextDouble(); // Store input in 'rate'

        // Prompt user to enter Time in years
        System.out.print("Enter Time (in years): ");
        double time = scanner.nextDouble(); // Store input in 'time'

        // Call the interestCalc method and store the result
        double interest = interestCalc(principal, rate, time);

        // Display the final Simple Interest along with input values
        System.out.println("The Simple Interest is " + interest + " for Principal " + principal + 
                           ", Rate of Interest " + rate + " and Time " + time + " years.");
    }
}
