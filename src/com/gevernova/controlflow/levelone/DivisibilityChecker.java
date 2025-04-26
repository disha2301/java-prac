package com.gevernova.controlflow.levelone;
import java.util.Scanner;

class DivisibilityChecker {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // Check and display divisibility by 5
        if (n % 5 == 0)
            System.out.println("Is the number " + n + " divisible by 5? Yes");
        else
            System.out.println("Is the number " + n + " divisible by 5? No");
    }
}
