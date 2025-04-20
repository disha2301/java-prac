package com.gevernova.datastructure.linkedlist.circular.processmanagementsystem;

public class processmanagementsystem {
    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler();

        scheduler.addProcess(1, 10, 1);
        scheduler.addProcess(2, 5, 2);
        scheduler.addProcess(3, 8, 1);

        int timeQuantum = 4;

        scheduler.simulate(timeQuantum);
    }
}
