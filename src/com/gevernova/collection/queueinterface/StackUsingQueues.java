package com.gevernova.collection.queueinterface;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    // push elements into the stack
    public void push(int x){
        q2.add(x); // add new element in q2
        // move all elements from q1 to q2
        while(!q1.isEmpty()){
            q2.add(q1.poll());
        }
        // swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }
    // remove the elements on top of the stack
    public int pop(){
        if(q1.isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return q1.poll();
    }
    // get the top element
    public int top(){
        if(q1.isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return q1.peek();
    }
    // check if the stack is empty
    public boolean isEmpty(){
        return q1.isEmpty();
    }
    // main method
    public static void main(String[] args){
        StackUsingQueues obj = new StackUsingQueues();
        obj.push(1);
        obj.push(2);
        obj.push(30);

        // printing them
        System.out.println("Top element is : "+obj.top());
        System.out.println("Popped element is : "+obj.pop());
        System.out.println("Top element now : "+obj.top());
    }
}
