package com.gevernova.string.generalquestions;
import java.util.Scanner;

class Tempcalc {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter choice (1 or 2): ");
        int ch = scanner.nextInt();

        System.out.print("Enter temperature: ");
        double temp = scanner.nextDouble();

        if (ch == 1) {
            double f = (temp * 9 / 5) + 32;
            System.out.println("Fahrenheit: " + f);
        } else if (ch == 2) {
            double c = (temp - 32) * 5 / 9;
            System.out.println("Celsius: " + c);
        } else {
            System.out.println("Invalid choice.");
        }
    }
}
