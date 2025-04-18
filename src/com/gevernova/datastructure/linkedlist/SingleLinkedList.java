package com.gevernova.datastructure.linkedlist;

public class SingleLinkedList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head;

    // 1. Insert at Front
    public void insertFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // 2. Insert at Back
    public void insertBack(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }

    // 3. Insert at Kth Position
    public void insertAtPosition(int data, int k) {
        if (k <= 0) return;

        if (k == 1) {
            insertFront(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 1; i < k - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) return;

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // 4. Delete at Front
    public void deleteFront() {
        if (head != null) {
            head = head.next;
        }
    }

    // 5. Delete at Back
    public void deleteBack() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null)
            temp = temp.next;
        temp.next = null;
    }

    // 6. Delete at Kth Position
    public void deleteAtPosition(int k) {
        if (k <= 0 || head == null) return;

        if (k == 1) {
            head = head.next;
            return;
        }

        Node temp = head;
        for (int i = 1; i < k - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        if (temp.next == null) return;

        temp.next = temp.next.next;
    }

    // Optional: Print the list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
