package com.gevernova.datastructure.linkedlist.singly.basic;

public class SingleLinkedList {
    private Node head;

    // Insert at front
    public void insertFront(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insertion at the back
    public void insertEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // insertion at a given position
    public void insertAtPosition(int data, int pos){
        if(pos <= 0){
            System.out.println("Invalid request for position");
            return;
        }
        if(pos == 1){
            insertFront(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for(int i = 1; i < pos-1 && temp != null; i++){
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("Position out of bounds");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // deletion from front
    public void deleteFront(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    // deletion from back
    public void deleteBack(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }

    // deletion from a particular position
    public void deletePosition(int pos){
        if(pos <=0 || head == null){
            System.out.println("Invalid position or empty list");
            return;
        }
        if(pos == 1){
            deleteFront();
            return;
        }
        Node temp = head;
        for(int i = 1; i<pos - 1 && temp.next != null; i++){
            temp = temp.next;
        }
        if(temp.next == null){
            System.out.println("Position is out of bound");
            return;
        }
        temp.next = temp.next.next;
    }

    // print a linkedList
    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " - ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
