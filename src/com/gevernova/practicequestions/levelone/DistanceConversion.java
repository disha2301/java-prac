package com.gevernova.practicequestions.levelone;

import java.util.Scanner;

class DistanceConversion {
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Take distance in feet as input
        System.out.print("Enter the distance in feet: ");
        double dFeet = scanner.nextDouble();

        // Convert feet to yards (1 yard = 3 feet)
        double dYards = dFeet / 3;

        // Convert yards to miles (1 mile = 1760 yards)
        double dMiles = dYards / 1760;

        // Print the converted distance in yards and miles
        System.out.printf("The distance in yards is %.2f while the distance in miles is %.6f%n", dYards, dMiles);
    }
}
