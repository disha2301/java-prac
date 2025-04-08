package com.gevernova.practicequestions.levelone;

import java.util.Scanner;

class KmToMile {
    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Get the distance in kilometers from the user
        System.out.print("Enter distance in kilometers: ");
        double km = sc.nextDouble();

        // Convert kilometers to miles
        double m = km / 1.6;

        // Display the result
        System.out.println("The total miles is " + m + " miles for the given " + km + " km");
    }
}
