package com.gevernova.array.leveltwo;
import java.util.Scanner;
// Class to calculate and display BMI details of multiple individuals
public class BMISummary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of people
        System.out.print("Enter the number of persons: ");
        int n = scanner.nextInt();

        // Arrays to store height, weight, BMI, and status
        double[] height = new double[n];
        double[] weight = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        // Input loop for each person
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for person " + (i + 1) + ":");

            // Input and validate height (must be positive)
            do {
                System.out.print("Height (in meters): ");
                height[i] = scanner.nextDouble();
                if (height[i] <= 0) {
                    System.out.println("Height must be a positive number. Please try again.");
                }
            } while (height[i] <= 0);

            // Input and validate weight (must be positive)
            do {
                System.out.print("Weight (in kilograms): ");
                weight[i] = scanner.nextDouble();
                if (weight[i] <= 0) {
                    System.out.println("Weight must be a positive number. Please try again.");
                }
            } while (weight[i] <= 0);

            // Calculate BMI: BMI = weight / (height * height)
            bmi[i] = weight[i] / (height[i] * height[i]);

            // Determine weight status based on BMI value
            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] <= 24.9) {
                status[i] = "Normal weight";
            } else if (bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Output summary for each person
        System.out.println("\n--- BMI Summary ---");
        for (int i = 0; i < n; i++) {
            System.out.printf("Person %d:\n", i + 1);
            System.out.printf("Height: %.2f meters\n", height[i]);
            System.out.printf("Weight: %.2f kg\n", weight[i]);
            System.out.printf("BMI: %.2f\n", bmi[i]);
            System.out.printf("Status: %s\n\n", status[i]);
        }
    }
}
