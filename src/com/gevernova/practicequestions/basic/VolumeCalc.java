package com.gevernova.practicequestions.basic;
import java.util.Scanner;

class VolumeCalc {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input radius of the cylinder
        System.out.println("Enter radius: ");
        double r = sc.nextDouble();

        // Input height of the cylinder
        System.out.println("Enter height: ");
        double h = sc.nextDouble();

        // Calculate volume of the cylinder
        double volume = Math.PI * r * r * h;

        // Display the calculated volume
        System.out.printf("Volume of the cylinder is %.2f%n", volume);
    }
}
