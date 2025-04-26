package com.gevernova.collection.mapinterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MergeMaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        System.out.print("How many entries in Map1? ");
        int n1 = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n1; i++) {
            System.out.print("Enter key for Map1: ");
            String key = sc.nextLine();
            System.out.print("Enter value: ");
            int value = sc.nextInt();
            sc.nextLine();
            map1.put(key, value);
        }

        System.out.print("How many entries in Map2? ");
        int n2 = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n2; i++) {
            System.out.print("Enter key for Map2: ");
            String key = sc.nextLine();
            System.out.print("Enter value: ");
            int value = sc.nextInt();
            sc.nextLine();
            map2.put(key, value);
        }

        // Merging map2 into map1
        for (String key : map2.keySet()) {
            if (map1.containsKey(key)) {
                map1.put(key, map1.get(key) + map2.get(key));
            } else {
                map1.put(key, map2.get(key));
            }
        }

        System.out.println("\nMerged Map: " + map1);
    }
}