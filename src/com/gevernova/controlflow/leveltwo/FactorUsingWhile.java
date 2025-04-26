package com.gevernova.controlflow.leveltwo;

import java.util.*;

class FactorUsingWhile {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = scanner.nextInt();

        // Check if input is a positive number
        if (n > 0) {
            int i = 1;
            while (i <= n) {
                if (n % i == 0) {
                    System.out.println(i + " is a factor");
                }
                i++; // make sure this runs regardless of condition
            }
        } else {
            System.out.println("Enter positive numbers only");
        }
    }
}
