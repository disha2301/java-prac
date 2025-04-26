package com.gevernova.controlflow.levelthree;
import java.util.*;

class DigitCounter {  
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        // Take user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int count = 0;
        int temp = Math.abs(number);  // Convert to positive if negative
        
        // Special case: if number is 0, it has 1 digit
        if (temp == 0) {
            count = 1;
        } else {
            // Loop until number becomes 0
            while (temp != 0) {
                temp /= 10;  // Remove the last digit
                count++;     // Increment digit count
            }
        }

        // Display the result
        System.out.println("Number of digits: " + count);
        
    }
}
