package com.gevernova.datastructure.linkedlist.circular.processmanagementsystem;

public class RoundRobinScheduler {
    private Process head = null;
    private Process tail = null;

    // Add process at the end
    public void addProcess(int pid, int burstTime, int priority) {
        Process newProcess = new Process(pid, burstTime, priority);
        if (head == null) {
            head = newProcess;
            tail = newProcess;
            newProcess.next = head;  // Circular link
        } else {
            tail.next = newProcess;
            tail = newProcess;
            tail.next = head;
        }
        System.out.println("Process " + pid + " added.");
    }

    // Remove a process by ID
    public void removeProcess(int pid) {
        if (head == null) return;

        Process temp = head;
        Process prev = tail;

        do {
            if (temp.processId == pid) {
                if (temp == head) {
                    head = head.next;
                    tail.next = head;
                } else if (temp == tail) {
                    tail = prev;
                    tail.next = head;
                } else {
                    prev.next = temp.next;
                }

                // If it's the only process left
                if (head == temp && tail == temp) {
                    head = tail = null;
                }

                System.out.println("Process " + pid + " completed and removed.");
                return;
            }

            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    // Simulate Round Robin execution
    public void simulate(int quantum) {
        if (head == null) {
            System.out.println("No processes to execute.");
            return;
        }

        Process current = head;
        int currentTime = 0;

        while (head != null) {
            if (current.remainingTime > 0) {
                int execTime = Math.min(quantum, current.remainingTime);
                currentTime += execTime;
                current.remainingTime -= execTime;

                System.out.println("Process " + current.processId + " executed for " + execTime + " units.");

                if (current.remainingTime == 0) {
                    current.turnAroundTime = currentTime;
                    current.waitingTime = current.turnAroundTime - current.burstTime;
                    removeProcess(current.processId);
                }
            }

            displayProcesses();
            current = (head == null) ? null : current.next;
        }

        calculateAverages();
    }

    // Display current process list
    public void displayProcesses() {
        if (head == null) {
            System.out.println("No processes in the queue.");
            return;
        }

        Process temp = head;
        System.out.println("Current process queue:");
        do {
            System.out.println("PID: " + temp.processId + ", Remaining Time: " + temp.remainingTime);
            temp = temp.next;
        } while (temp != head);
    }

    // Calculate and display average waiting and turnaround time
    public void calculateAverages() {
        int totalWaiting = 0;
        int totalTurnaround = 0;
        int count = 0;

        Process temp = head;

        if (temp == null) return;

        do {
            totalWaiting += temp.waitingTime;
            totalTurnaround += temp.turnAroundTime;
            count++;
            temp = temp.next;
        } while (temp != head);

        System.out.println("\nFinal Results:");
        System.out.println("Average Waiting Time: " + (totalWaiting / (float) count));
        System.out.println("Average Turnaround Time: " + (totalTurnaround / (float) count));
    }
}
