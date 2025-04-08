package com.gevernova.controlflow.leveltwo;
import java.util.*;

class GreatestFactor {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();

        // Proceed only if number is greater than 1
        if (n > 1) {
            int greatestFactor = 1;

            // Loop from n-1 down to 1 to find the greatest factor
            for (int i = n - 1; i >= 1; i--) {
                if (n % i == 0) {
                    greatestFactor = i;
                    break; // Stop at the first factor found
                }
            }

            System.out.println("Greatest factor of " + n + " is " + greatestFactor);
        } else {
            System.out.println("Kindly enter a number greater than 1");
        }
    }
}
