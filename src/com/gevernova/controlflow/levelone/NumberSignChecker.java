package com.gevernova.controlflow.levelone;
import java.util.Scanner;

class NumberSignChecker {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter any number: ");
        int number = scanner.nextInt();

        // Check if number is positive, negative, or zero
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}
