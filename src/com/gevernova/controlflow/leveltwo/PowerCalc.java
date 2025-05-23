package com.gevernova.controlflow.leveltwo;
import java.util.*;
class PowerCalc {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number:");
        int num = scanner.nextInt();

        System.out.println("Enter power:");
        int pow = scanner.nextInt();

        if (pow < 0) {
            System.out.println("Please enter a positive number as power.");
        } else {
            int res = 1;

            // Loop to calculate power
            for (int i = 1; i <= pow; i++) {
                res *= num;
            }

            System.out.println(num + " raised to the power " + pow + " is: " + res);
        }
    }
}
