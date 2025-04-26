package com.gevernova.practicequestions.basic;
import java.util.Scanner;
class CircleAreaCalculator {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius
        System.out.print("Enter Radius: ");
        double radius = scanner.nextDouble();

        // Calculate the area using Math.PI for precision
        double area = Math.PI * radius * radius;

        // Display the result
        System.out.println("Area of the circle is " + area + " square units");
    }
}
