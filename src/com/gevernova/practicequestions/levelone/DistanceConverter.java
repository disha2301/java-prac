package com.gevernova.practicequestions.levelone;

import java.util.Scanner;

class DistanceConverter {
    public static void main(String[] args) {
        // Create scanner object to read input from user
        Scanner scanner = new Scanner(System.in);

        // Take distance in feet as input from the user
        System.out.print("Enter the distance in feet: ");
        double dFeet = scanner.nextDouble();

        // Convert feet to yards (1 yard = 3 feet)
        double dYard = dFeet / 3;   

        // Convert yards to miles (1 mile = 1760 yards)
        double dMile = dYard / 1760;  

        // Output the converted distances in feet, yards, and miles
        System.out.printf(
            "The distance in feet is %.2f ft, in yards is %.2f yd, and in miles is %.6f mi%n",
            dFeet, dYard, dMile
        );
    }
}
