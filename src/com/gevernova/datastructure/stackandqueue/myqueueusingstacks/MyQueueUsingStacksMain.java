package com.gevernova.datastructure.stackandqueue.myqueueusingstacks;

public class MyQueueUsingStacksMain {
    public static void main(String[] args) {
        MyQueueUsingStacks queue = new MyQueueUsingStacks();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display(); // Queue: [10, 20, 30]

        System.out.println("Dequeued: " + queue.dequeue()); // 10
        queue.display(); // Queue: [20, 30]

        System.out.println("Peek: " + queue.peek()); // 20
        queue.enqueue(40);
        queue.display(); // Queue: [20, 30, 40]
    }
}
