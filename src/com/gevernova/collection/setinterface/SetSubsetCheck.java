package com.gevernova.collection.setinterface;

import java.util.*;

public class SetSubsetCheck {
    public static void main(String[] args){
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Create two sets of integers
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Input the size of set 1 and elements to be added to it
        System.out.print("Enter size of set 1: ");
        int size1 = sc.nextInt();
        System.out.println("Enter elements in set 1:");
        for(int i = 0; i < size1; i++){
            set1.add(sc.nextInt()); // Add each element to set 1
        }

        // Input the size of set 2 and elements to be added to it
        System.out.print("Enter size of set 2: ");
        int size2 = sc.nextInt();
        System.out.println("Enter elements in set 2:");
        for(int i = 0; i < size2; i++){
            set2.add(sc.nextInt()); // Add each element to set 2
        }

        // Check if set1 is a subset of set2
        boolean isSubset = set2.containsAll(set1);

        // Display the result
        if(isSubset){
            System.out.println("Set 1 is a subset of Set 2.");
        } else {
            System.out.println("Set 1 is not a subset of Set 2.");
        }
    }
}
