package com.gevernova.datastructure.linkedlist.circular.taskscheduler;

public class CircularTaskList {
    private TaskNode head = null;
    private TaskNode tail = null;
    private TaskNode current = null;

    // add task at the beginning
    public void addFirst(TaskNode task){
        if(head == null){
            head = tail = task;
            task.next = head;
        } else{
            task.next = head;
            head = task;
            tail.next = head;
        }
    }

    // add task at the end
    public void addLast(TaskNode task){
        if(tail == null){
            head = tail = task;
            task.next = head;
        } else {
            tail.next = task;
            task.next = head;
            tail = task;
        }
    }

    // add task at specific position
    public void addAtPosition(TaskNode task, int pos){
        if(pos <= 0){
            System.out.println("Invalid position");
            return;
        }
        if(pos == 1){
            addFirst(task);
            return;
        }
        TaskNode temp = head;
        for(int i = 1; i < pos-1 && temp.next != head; i++){
            temp = temp.next;
        }
        task.next = temp.next;
        temp.next = task;
        if(temp == tail){
            tail = task;
        }
    }

    // remove task by task id
    public void removeId(int taskId){
        if(head == null) return;
        TaskNode temp = head;
        TaskNode prev = tail;
        do{
            if(temp.taskId == taskId){
                if(temp == head && temp == tail){
                    head = tail = null;
                } else {
                    prev.next = temp.next;
                    if(temp == head) head = temp.next;
                    if(temp == tail) tail = prev;
                }
                tail.next = head;
                return;
            }
            prev = temp;
            temp = temp.next;
        } while(temp != head);
        System.out.println("Tssk not found");
    }

    // View current task and move to next
    public void viewAndMoveToNext() {
        if (current == null) current = head;
        if (current != null) {
            printTask(current);
            current = current.next;
        } else {
            System.out.println("No tasks in the list.");
        }
    }

    // Display all tasks
    public void displayTasks() {
        if (head == null) {
            System.out.println("No tasks to display.");
            return;
        }

        TaskNode temp = head;
        do {
            printTask(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // Search task by priority
    public void searchByPriority(String priority) {
        if (head == null) return;

        TaskNode temp = head;
        boolean found = false;
        do {
            if (temp.priority.equalsIgnoreCase(priority)) {
                printTask(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) System.out.println("No tasks with priority " + priority);
    }

    // Helper to print a task
    private void printTask(TaskNode task) {
        System.out.println("ID: " + task.taskId + ", Name: " + task.taskName +
                ", Priority: " + task.priority + ", Due: " + task.dueDate);
    }
}