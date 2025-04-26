package com.gevernova.controlflow.levelone;
import java.util.Scanner;

class OddEvenPrinter {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Input a natural number
        System.out.print("Enter value of n: ");
        int n = scanner.nextInt();

        if (n <= 0)
            System.out.println("Enter a positive natural number");
        else {
            // Loop from 1 to n and check odd/even
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0)
                    System.out.println(i + " is an even number");
                else
                    System.out.println(i + " is an odd number");
            }
        }
    }
}
