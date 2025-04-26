package com.gevernova.practicequestions.levelone;

import java.util.Scanner;

class HandshakeCalc {
    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get the number of students from the user
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        // Calculate the maximum number of handshakes using the formula
        int h = (n * (n - 1)) / 2;

        // Display the result: maximum number of handshakes
        System.out.println("The maximum number of handshakes among " + n + " students is " + h);
    }
}
