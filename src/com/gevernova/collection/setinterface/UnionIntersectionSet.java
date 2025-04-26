package com.gevernova.collection.setinterface;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UnionIntersectionSet {
    public static void main(String[] args) {
        // Scanner to take user input
        Scanner scanner = new Scanner(System.in);

        // Create two sets of integers using HashSet
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        // Input the size of the first set and add elements to it
        System.out.print("Enter size of set 1: ");
        int size1 = scanner.nextInt();
        System.out.println("Enter elements in set 1:");
        for (int i = 0; i < size1; i++) {
            s1.add(scanner.nextInt()); // add each element to set 1
        }

        // Input the size of the second set and add elements to it
        System.out.print("Enter size of set 2: ");
        int size2 = scanner.nextInt();
        System.out.println("Enter elements in set 2:");
        for (int i = 0; i < size2; i++) {
            s2.add(scanner.nextInt()); // add each element to set 2
        }

        // Compute the union of the two sets
        Set<Integer> unionSet = new HashSet<>(s1); // start with set1
        unionSet.addAll(s2); // add all elements from set2 to unionSet

        // Compute the intersection of the two sets
        Set<Integer> intersectSet = new HashSet<>(s1); // start with set1
        intersectSet.retainAll(s2); // retain only elements that are also in set2

        // Display the result for union and intersection
        System.out.println("Union Result is: " + unionSet); // union of both sets
        System.out.println("Intersection Result is: " + intersectSet); // intersection of both sets
    }
}
