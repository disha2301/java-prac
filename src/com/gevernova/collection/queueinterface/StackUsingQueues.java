package com.gevernova.collection.queueinterface;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {
    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();
    // push elements into the stack
    public void push(int x){
        queue2.add(x); // add new element in q2
        // move all elements from q1 to q2
        while(!queue1.isEmpty()){
            queue2.add(queue1.poll());
        }
        // swap q1 and q2
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }
    // remove the elements on top of the stack
    public int pop(){
        if(queue1.isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return queue1.poll();
    }
    // get the top element
    public int top(){
        if(queue1.isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return queue1.peek();
    }
    // check if the stack is empty
    public boolean isEmpty(){
        return queue1.isEmpty();
    }
    // main method
    public static void main(String[] args){
        StackUsingQueues stack = new StackUsingQueues();
        stack.push(1);
        stack.push(2);
        stack.push(30);

        // printing them
        System.out.println("Top element is : "+stack.top());
        System.out.println("Popped element is : "+stack.pop());
        System.out.println("Top element now : "+stack.top());
    }
}
