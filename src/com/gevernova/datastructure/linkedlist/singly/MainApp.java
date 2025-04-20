package com.gevernova.datastructure.linkedlist.singly;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MainApp {
    public static void main(String[] args){
        SingleLinkedList list = new SingleLinkedList();

        // using stack
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(40);
        stack.push(50);
        stack.push(60);

        while(!stack.isEmpty()){
            list.insertFront(stack.pop()); // last in first out
        }

        // using queue
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(40);
        queue.add(60);
        queue.add(70);

        while(!queue.isEmpty()){
            list.insertFront(queue.remove()); // first in first out
        }

        list.printList();
    }
}
