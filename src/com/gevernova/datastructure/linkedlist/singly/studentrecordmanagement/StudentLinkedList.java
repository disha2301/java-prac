package com.gevernova.datastructure.linkedlist.singly.studentrecordmanagement;

public class StudentLinkedList {
    private StudentNode head;

    // insertion at front
    public void insertFront(StudentNode newStudent){
        newStudent.next = head;
        head = newStudent;
    }

    // insertion at the end
    public void insertEnd(StudentNode newStudent){
        if(head == null){
            head = newStudent;
            return;
        }
        StudentNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newStudent;
    }

    // insertion at a specific position
    public void insertAtPosition(StudentNode newStudent, int pos){
        if(pos <= 0){
            System.out.println("Invalid position");
            return;
        }
        if(pos == 1){
            insertFront(newStudent);
            return;
        }

        StudentNode temp = head;
        for(int i = 1; i < pos-1 && temp != null; i++){
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("Position out of bounds");
            return;
        }
        newStudent = temp.next;
        temp.next = newStudent;
    }

    // delete student by roll number
    public void deleteByRoll(int rollNo){
        if(head == null) {
            System.out.println("No data");
            return;
        }
        if(head.rollNo == rollNo){
            head = head.next;
            return;
        }
        StudentNode temp = head;
        while(temp.next != null && temp.next.rollNo != rollNo){
            temp = temp.next;
        }
        if(temp.next == null){
            System.out.println("Roll number not found");
            return;
        }
        temp.next = temp.next.next;
    }

    // search students by roll number
    public StudentNode searchByRoll(int rollNo){
        StudentNode temp = head;
        while(temp != null){
            if(temp.rollNo == rollNo){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    // update grade by roll number
    public void updateGrade(int rollNo, String newGrade){
        StudentNode student = searchByRoll(rollNo);
        if(student != null)
            student.grade = newGrade;
        else
            System.out.println("Student not found");
    }

    // display all records
    public void display(){
        if(head == null){
            System.out.println("No student record found");
            return;
        }
        StudentNode temp = head;
        while (temp != null) {
            System.out.println("Roll No: " + temp.rollNo +
                    ", Name: " + temp.name +
                    ", Age: " + temp.age +
                    ", Grade: " + temp.grade);
            temp = temp.next;
        }
    }
}

