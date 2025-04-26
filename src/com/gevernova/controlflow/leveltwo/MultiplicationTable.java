package com.gevernova.controlflow.leveltwo;
import java.util.*;

class MultiplicationTable {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number:");
        int n = scanner.nextInt();

        // Print multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}
