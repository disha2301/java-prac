package com.gevernova.controlflow.leveltwo;
import java.util.*;

class Factor {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");

        int n = scanner.nextInt();

        // Check if the input is a positive number
        if (n > 0) {
            // Loop from 1 to one less than the number
            for (int i = 1; i < n; i++) {
                // If i divides n perfectly, it's a factor
                if (n % i == 0) {
                    System.out.println(i + " is a factor");
                }
            }
        } else {
            System.out.println("Enter positive numbers only");
        }
    }
}
