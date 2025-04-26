package com.gevernova.array.leveltwo;
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = scanner.nextInt();

        double[][] personData = new double[n][3]; // [height, weight, BMI]
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");

            do {
                System.out.print("Enter Height (in meters): ");
                personData[i][0] = scanner.nextDouble();
                if (personData[i][0] <= 0)
                    System.out.println("Height must be a positive number.");
            } while (personData[i][0] <= 0);

            do {
                System.out.print("Enter Weight (in kilograms): ");
                personData[i][1] = scanner.nextDouble();
                if (personData[i][1] <= 0)
                    System.out.println("Weight must be a positive number.");
            } while (personData[i][1] <= 0);

            // Calculate BMI
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);

            // Determine weight status
            if (personData[i][2] <= 18.4)
                weightStatus[i] = "Underweight";
            else if (personData[i][2] <= 24.9)
                weightStatus[i] = "Normal";
            else if (personData[i][2] <= 39.9)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("Person %d - Height: %.2fm, Weight: %.2fkg, BMI: %.2f, Status: %s%n",
                    i + 1, personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
    }
}
