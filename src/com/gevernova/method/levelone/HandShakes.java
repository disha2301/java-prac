package com.gevernova.method.levelone;
import java.util.Scanner;

class HandShakes {
    public static void main(String args[]) {
        // Creating Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Asking user to input the number of students
        System.out.println("Enter number of students");
        int n = sc.nextInt();  // Storing the user input in variable 'n'

        // Calling the method to calculate maximum handshakes
        int maxHand = handshakeCalc(n);

        // Displaying the result
        System.out.println("The maximum number of handshakes among " + n + 
                           " students is: " + maxHand);
    }

    // Method to calculate the maximum number of handshakes
    // using the combination formula: (n * (n - 1)) / 2
    public static int handshakeCalc(int n) {
        return (n * (n - 1)) / 2;
    }
}