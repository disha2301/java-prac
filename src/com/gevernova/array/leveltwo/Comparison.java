package com.gevernova.array.leveltwo;
import java.util.*;
public class Comparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] name = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];

        // Input: Age and height for each friend
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + name[i] + ": ");
            age[i] = scanner.nextInt();

            System.out.print("Enter height of " + name[i] + " (in cm): ");
            height[i] = scanner.nextDouble();
        }

        int youngest = 0;
        int tallest = 0;

        // Compare to find youngest and tallest
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngest]) {
                youngest = i;
            }
            if (height[i] > height[tallest]) {
                tallest = i;
            }
        }

        // Output
        System.out.println("\nYoungest friend: " + name[youngest] + " (Age: " + age[youngest] + ")");
        System.out.println("Tallest friend: " + name[tallest] + " (Height: " + height[tallest] + " cm)");
    }
}
