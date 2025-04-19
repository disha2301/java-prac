package com.gevernova.datastructure.timecomplexity;
import java.util.*;
public class SearchEfficiencyComparison {
    public static void main(String[] args) {
        int N = 1_000_000;
        int target = N - 1;

        // Populate structures
        Integer[] array = new Integer[N];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < N; i++) {
            array[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }

        // Array Search
        long startArray = System.nanoTime();
        for (int i : array) {
            if (i == target) break;
        }
        long endArray = System.nanoTime();
        System.out.println("Array Search: " + (endArray - startArray) / 1_000_000.0 + " ms");

        // HashSet Search
        long startHashSet = System.nanoTime();
        boolean foundHash = hashSet.contains(target);
        long endHashSet = System.nanoTime();
        System.out.println("HashSet Search: " + (endHashSet - startHashSet) / 1_000_000.0 + " ms");

        // TreeSet Search
        long startTreeSet = System.nanoTime();
        boolean foundTree = treeSet.contains(target);
        long endTreeSet = System.nanoTime();
        System.out.println("TreeSet Search: " + (endTreeSet - startTreeSet) / 1_000_000.0 + " ms");
    }
}
