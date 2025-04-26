package com.gevernova.controlflow.leveltwo;
import java.util.*;
class Multiple {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number less than 100:");
        int number = scanner.nextInt();
        if (number > 0 && number < 100) {
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Please enter a valid number (between 1 and 99).");
        }
    }
}

