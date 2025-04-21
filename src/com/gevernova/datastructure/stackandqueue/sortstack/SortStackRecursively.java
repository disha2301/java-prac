package com.gevernova.datastructure.stackandqueue.sortstack;
import java.util.Stack;

public class SortStackRecursively {
    // Function to sort the entire stack using recursion
    public static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int top = stack.pop(); // Step 1: Pop the top element
            sortStack(stack);      // Step 2: Sort remaining stack
            insertInSortedOrder(stack, top); // Step 3: Insert popped element correctly
        }
    }

    // Helper function to insert element in the sorted stack
    private static void insertInSortedOrder(Stack<Integer> stack, int value) {
        // Base case: either stack is empty or value is greater than top element
        if (stack.isEmpty() || value >= stack.peek()) {
            stack.push(value);
        } else {
            int top = stack.pop(); // Hold top element
            insertInSortedOrder(stack, value); // Recur until correct position is found
            stack.push(top); // Push back the held element
        }
    }

    // Utility function to print the stack from top to bottom
    public static void printStack(Stack<Integer> stack) {
        Stack<Integer> temp = new Stack<>();
        temp.addAll(stack);
        System.out.println("Sorted Stack (Top to Bottom):");
        while (!temp.isEmpty()) {
            System.out.println(temp.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(30);
        stack.push(10);
        stack.push(50);
        stack.push(20);
        stack.push(40);

        System.out.println("Original Stack: " + stack);
        sortStack(stack);
        printStack(stack);
    }

}
