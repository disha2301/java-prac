package com.gevernova.controlflow.levelone;
import java.util.Scanner;

class NaturalNumberSumCheck {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println(n + " is not a natural number");
        } else {
            // Compute sum using formula
            int formulaSum = n * (n + 1) / 2;

            // Compute sum using while loop
            int loopSum = 0;
            int temp = n;
            while (temp > 0) {
                loopSum += temp;
                temp--;
            }

            // Display both results
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + loopSum);

            // Compare results
            if (formulaSum == loopSum) {
                System.out.println("Both calculations are correct");
            } else {
                System.out.println("Something went wrong");
            }
        }
    }
}
