package com.gevernova.controlflow.levelone;
import java.util.Scanner;

class NaturalNumberSumWithForLoop {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println(n + " is not a natural number");
        } else {
            // Sum using formula
            int formulaSum = n * (n + 1) / 2;

            // Sum using for loop
            int loopSum = 0;
            for (int i = n; i > 0; i--) {
                loopSum += i;
            }

            // Display and compare results
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + loopSum);

            if (formulaSum == loopSum) {
                System.out.println("Both calculations are correct");
            } else {
                System.out.println("Something went wrong");
            }
        }
    }
}
