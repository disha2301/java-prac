package com.gevernova.collection.list.nthelement;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class NthFromEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter space separated characters");
        String[] input = sc.nextLine().split(" ");
        LinkedList<String> list = new LinkedList<>(Arrays.asList(input));
        System.out.println("Enter the position from the last");
        int pos = sc.nextInt();
        String result = getNthFromEnd(list, pos);
        if (result != null) {
            System.out.println("Nth element from the end is: " + result);
        } else {
            System.out.println("Invalid value of N.");
        }
    }

    // Function to find Nth node from end using two-pointer method
    public static String getNthFromEnd(LinkedList<String> list, int n) {
        ListIterator<String> first = list.listIterator();
        ListIterator<String> second = list.listIterator();
        // Move first pointer n steps ahead
        for (int i = 0; i < n; i++) {
            if (first.hasNext()) {
                first.next();
            } else {
                return null; // N is greater than the length of the list
            }
        }
        // Move both pointers until first reaches the end
        while (first.hasNext()) {
            first.next();
            second.next();
        }

        return second.next();  // second now points to the Nth from end
    }
}