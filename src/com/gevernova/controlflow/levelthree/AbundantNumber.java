package com.gevernova.controlflow.levelthree;
import java.util.*;

class AbundantNumber {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int sum = 0; // Variable to store the sum of proper divisors

        // Loop through numbers from 1 to num - 1 to find divisors
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i; // Add divisor to the sum
            }
        }

        // Check if the sum of divisors is greater than the number
        if (sum > num) {
            System.out.println(num + " is an Abundant Number.");
        } else {
            System.out.println(num + " is NOT an Abundant Number.");
        }
    }
}
