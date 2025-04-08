package com.gevernova.controlflow.levelthree;

import java.util.*;

class HarshadNumber { 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();  // Input number from user

        int temp = num;          // Store original number for final check
        int sum = 0;             // Sum of digits

        // Loop to calculate the sum of digits
        while (num > 0) {
            sum += num % 10;     // Add last digit
            num /= 10;           // Remove last digit
        }

        // Check if original number is divisible by sum of its digits
        if (temp % sum == 0) {
            System.out.println(temp + " is a Harshad Number.");
        } else {
            System.out.println(temp + " is NOT a Harshad Number.");
        }
    }
}
