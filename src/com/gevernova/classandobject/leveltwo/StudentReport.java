package com.gevernova.classandobject.leveltwo;

public class StudentReport {

    //attributes
    String name;
    int roll;
    int marks;

    //constructor to initialize the Student object
    public StudentReport(String name, int roll, int marks){
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    //method to calculate the grade based on marks
    public String calcGrade(){
        if (marks >= 90) return "A+";
        else if (marks >= 80) return "A";
        else if (marks >= 70) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 50) return "D";
        else return "F";
    }

    //method to display the details of the student
    public void printDetails(){
        System.out.println("Name is "+name+"\nRoll number is "+roll+"\nMarks Obtained is "+marks+"\nGrade obtained is "+calcGrade());
    }

    //main method to test the student class
    public static void main(String[] args){
        //object creation
        StudentReport obj = new StudentReport("Disha",3231,100);
        obj.printDetails();
    }
}
