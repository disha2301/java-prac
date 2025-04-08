package com.gevernova.method.levelone;
import java.util.Scanner; // Import Scanner class for user input

public class HandShakesSimple {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt(); // Read the input as an integer

        // Calculate the maximum number of handshakes using the formula: (n * (n - 1)) / 2
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Display the result
        System.out.println("Maximum number of handshakes possible: " + handshakes);
    }
}

