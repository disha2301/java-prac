package com.gevernova.controlflow.levelone;
import java.util.Scanner;

class LargestNumberChecker {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for three numbers
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.print("Enter third number: ");
        int c = scanner.nextInt();

        // Checking which number is the largest
        System.out.println("Is the first number the largest? " + (a > b && a > c ? "Yes" : "No"));
        System.out.println("Is the second number the largest? " + (b > a && b > c ? "Yes" : "No"));
        System.out.println("Is the third number the largest? " + (c > a && c > b ? "Yes" : "No"));
    }
}
