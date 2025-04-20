package com.gevernova.datastructure.linkedlist.singly.studentrecordmanagement;

public class StudentRecordManagementSystem {
    public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();

        // Adding students
        list.insertEnd(new StudentNode(101, "Alice", 20, "A"));
        list.insertEnd(new StudentNode(102, "Bob", 21, "B"));
        list.insertFront(new StudentNode(103, "Charlie", 22, "C"));
        list.insertAtPosition(new StudentNode(104, "David", 19, "B+"), 2);

        // display records
        System.out.println("Records of all students are as follows");
        list.display();

        // searching for a student
        System.out.println("\nSearching Roll No 102:");
        StudentNode found = list.searchByRoll(102);
        if (found != null) {
            System.out.println("Found: " + found.name + ", Grade: " + found.grade);
        }
        // Updating a student's grade
        System.out.println("\nUpdating Roll No 101's grade to A+");
        list.updateGrade(101, "A+");

        // Deleting a student
        System.out.println("\nDeleting Roll No 103");
        list.deleteByRoll(103);

        // Final list
        System.out.println("\nFinal Student Records:");
        list.display();
    }
}
