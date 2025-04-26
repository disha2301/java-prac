package com.gevernova.collection.setinterface;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class SetEqualityCheck {

    // Method to check if two sets are equal
    public static boolean isEqual(Set<Integer> s1, Set<Integer> s2) {
        // equals() checks if both sets have the same elements, regardless of order
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare two sets of integers using HashSet
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        // Input size and elements for set 1
        System.out.print("Enter size of set 1: ");
        int size1 = scanner.nextInt();
        System.out.println("Enter elements in set 1:");
        for (int i = 0; i < size1; i++) {
            s1.add(scanner.nextInt()); // add element to set 1
        }

        // Input size and elements for set 2
        System.out.print("Enter size of set 2: ");
        int size2 = scanner.nextInt();
        System.out.println("Enter elements in set 2:");
        for (int i = 0; i < size2; i++) {
            s2.add(scanner.nextInt()); // add element to set 2
        }

        // Call method to compare the two sets
        boolean isEqual = isEqual(s1, s2);

        // Display result
        System.out.println("Are the two sets equal? " + isEqual);
    }
}
