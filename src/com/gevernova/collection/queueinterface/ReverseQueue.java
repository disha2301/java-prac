package com.gevernova.collection.queueinterface;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class ReverseQueue {

    // Method to reverse the queue using recursion
    public static void reverseQueue(Queue<Integer> q) {
        // Base case: if the queue is empty, we stop the recursion
        if (q.isEmpty()) {
            return;
        }

        // Remove the front element from the queue
        int front = q.poll();

        // Recursively reverse the remaining queue
        reverseQueue(q);

        // Add the removed front element to the back of the queue after the recursion
        q.add(front);
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Initialize the queue
        Queue<Integer> q = new LinkedList<>();

        // Prompt the user to enter the number of elements in the queue
        System.out.println("Enter the number of elements in the queue : ");
        int size = sc.nextInt();

        // Ask the user to enter the elements of the queue
        System.out.println("Enter elements in the queue");
        for (int i = 0; i < size; i++) {
            q.add(sc.nextInt());  // Add each element to the queue
        }

        // Print the original queue
        System.out.println("Original queue : " + q);

        // Call the reverseQueue method to reverse the queue
        reverseQueue(q);

        // Print the reversed queue
        System.out.println("Reversed queue : " + q);
    }
}
