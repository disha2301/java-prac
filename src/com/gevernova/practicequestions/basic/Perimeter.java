package com.gevernova.practicequestions.basic;
import java.util.Scanner;
class Perimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input length and width of the rectangle
        System.out.print("Enter length: ");
        double length = scanner.nextDouble();

        System.out.print("Enter width: ");
        double width = scanner.nextDouble();

        // Calculate perimeter
        double perimeter = 2 * (length + width);

        // Display result
        System.out.println("Perimeter is: " + perimeter);
    }
}
