package com.gevernova.datastructure.linkedlist.singly.studentrecordmanagement;

public class StudentNode {
    int rollNo;
    String name;
    int age;
    String grade;
    StudentNode next;

    // constructor
    public StudentNode(int rollNo, String name, int age, String grade){
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}
