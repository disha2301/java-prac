package com.gevernova.string.levelthree;
import java.util.Scanner;

public class SimpleBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Loop for 3 people
        for (int i = 1; i <= 3; i++) {
            System.out.println("Person " + i + ":");
            System.out.print("Enter weight in kg: ");
            double weight = scanner.nextDouble();
            System.out.print("Enter height in cm: ");
            double heightCm = scanner.nextDouble();
            double heightM = heightCm / 100;
            double bmi = weight / (heightM * heightM);
            System.out.printf("BMI: %.2f\n", bmi);
            if (bmi < 18.5) {
                System.out.println("Status: Underweight\n");
            } else if (bmi < 25) {
                System.out.println("Status: Normal\n");
            } else if (bmi < 30) {
                System.out.println("Status: Overweight\n");
            } else {
                System.out.println("Status: Obese\n");
            }
        }
    }
}
