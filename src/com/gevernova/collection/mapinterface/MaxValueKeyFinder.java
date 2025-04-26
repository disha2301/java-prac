package com.gevernova.collection.mapinterface;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxValueKeyFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();

        System.out.print("How many entries? ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Input key-value pairs
        for (int i = 0; i < n; i++) {
            System.out.print("Enter key: ");
            String key = sc.nextLine();
            System.out.print("Enter value: ");
            int value = sc.nextInt();
            sc.nextLine(); // consume newline
            map.put(key, value);
        }

        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        for (String key : map.keySet()) {
            int value = map.get(key);
            if (value > maxValue) {
                maxValue = value;
                maxKey = key;
            }
        }

        System.out.println("\nKey with the highest value: " + maxKey);
    }
}

