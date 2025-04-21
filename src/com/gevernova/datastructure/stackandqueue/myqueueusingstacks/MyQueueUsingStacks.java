package com.gevernova.datastructure.stackandqueue.myqueueusingstacks;
import java.util.Stack;

public class MyQueueUsingStacks {
    private Stack<Integer> stackEnqueue; // Stack for enqueue operations
    private Stack<Integer> stackDequeue; // Stack for dequeue operations

    public MyQueueUsingStacks() {
        stackEnqueue = new Stack<>();
        stackDequeue = new Stack<>();
    }

    // Enqueue operation - O(1)
    public void enqueue(int x) {
        stackEnqueue.push(x);
    }

    // Dequeue operation - Amortized O(1), worst case O(n)
    public int dequeue() {
        shiftStacks();
        if (stackDequeue.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return stackDequeue.pop();
    }

    // Peek at front of the queue
    public int peek() {
        shiftStacks();
        if (stackDequeue.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return stackDequeue.peek();
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return stackEnqueue.isEmpty() && stackDequeue.isEmpty();
    }

    // Transfer elements from stackEnqueue to stackDequeue if needed
    private void shiftStacks() {
        if (stackDequeue.isEmpty()) {
            while (!stackEnqueue.isEmpty()) {
                stackDequeue.push(stackEnqueue.pop());
            }
        }
    }

    // Display all elements from front to rear
    public void display() {
        shiftStacks(); // Ensure the correct order
        System.out.println("Queue: " + stackDequeue);
    }
}
