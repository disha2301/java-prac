package com.gevernova.controlflow.leveltwo;
import java.util.*;

class GreatestFactorUsingWhile {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();

        // Check if the input is valid
        if (n > 1) {
            int greatestFactor = 1;
            int i = n - 1;

            // Loop backward to find the greatest factor less than the number
            while (i >= 1) {
                if (n % i == 0) {
                    greatestFactor = i;
                    break; // Exit once the first (greatest) factor is found
                }
                i--;
            }
            System.out.println("Greatest factor of " + n + " is " + greatestFactor);
        } else {
            System.out.println("Kindly enter a number greater than 1");
        }
    }
}
