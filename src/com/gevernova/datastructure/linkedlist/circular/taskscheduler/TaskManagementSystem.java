package com.gevernova.datastructure.linkedlist.circular.taskscheduler;

public class TaskManagementSystem { public static void main(String[] args) {
    CircularTaskList scheduler = new CircularTaskList();

    // Add tasks
    scheduler.addLast(new TaskNode(1, "Design UI", "High", "2025-04-22"));
    scheduler.addLast(new TaskNode(2, "Write Backend", "Medium", "2025-04-24"));
    scheduler.addFirst(new TaskNode(3, "Create Database", "High", "2025-04-21"));
    scheduler.addAtPosition(new TaskNode(4, "Testing", "Low", "2025-04-25"), 3);

    // Display all tasks
    System.out.println("\n--- All Tasks ---");
    scheduler.displayTasks();

    // View and move to next task
    System.out.println("\n--- View & Move Through Tasks ---");
    scheduler.viewAndMoveToNext(); // 1st call
    scheduler.viewAndMoveToNext(); // 2nd call

    // Search by priority
    System.out.println("\n--- Search by Priority: High ---");
    scheduler.searchByPriority("High");

    // Remove task
    System.out.println("\n--- Removing Task ID 2 ---");
    scheduler.removeId(2);

    // Display updated list
    System.out.println("\n--- Tasks After Deletion ---");
    scheduler.displayTasks();
}
}
