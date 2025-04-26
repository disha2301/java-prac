package com.gevernova.array.levelone;

import java.util.*;

class FizzBuzzPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Validate if the input is positive
        if (num <= 0) {
            System.out.println("Enter a positive number!");
            return;
        }

        // Create a string array to store results
        String res[] = new String[num];

        // Loop from 1 to the entered number
        for (int i = 1; i <= num; i++) {
            String value = "";

            // Check for multiples of 3 and 5
            if (i % 3 == 0) value += "Fizz";
            if (i % 5 == 0) value += "Buzz";

            // If not a multiple of 3 or 5, store the number itself
            if (value.equals("")) value = String.valueOf(i);

            // Store result in the array (adjusting index by -1)
            res[i - 1] = value;
        }

        // Print the result with index positions
        for (int i = 0; i < num; i++) {
            System.out.println("Position " + (i + 1) + " = " + res[i]);
        }
    }
}
