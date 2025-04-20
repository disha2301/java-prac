package com.gevernova.datastructure.linkedlist.circular.taskscheduler;

public class TaskNode {
    int taskId;
    String taskName;
    String priority;
    String dueDate;

    TaskNode next;

    // constructor
    public TaskNode(int taskId, String taskName, String priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}
