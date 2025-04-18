package com.gevernova.datastructure.linkedlist;

import java.util.*;

public class LinkedListWithStackQueue {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();

        // Using Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        while (!stack.isEmpty()) {
            list.insertFront(stack.pop());
        }

        // Using Queue
        Queue<Integer> queue = new LinkedList<>();
        queue.add(40);
        queue.add(50);
        queue.add(60);

        while (!queue.isEmpty()) {
            list.insertBack(queue.remove());
        }

        list.printList();
    }
}
