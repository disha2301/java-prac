package com.gevernova.constructorsandvariables.variables;

public class Course {
    // instance variable which is unique for each course
    String courseName;
    String duration;
    double fee;

    // class variable which is shared by all courses

    static String instituteName = "Disha Academy";

    // constructor to initialize the Course object
    public Course(String courseName, String duration, double fee){
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // instance method to display all the details
    public void printDetails(){
        System.out.println("Institute name is "+instituteName+"\nCourse name is "+courseName+"\nDuration is "+duration+"\nFee to be paid is "+fee);
    }

    // class method to update the institute name for all
    public static void updateName(String name){
        instituteName = name;
    }

    // main method to test the class
    public static void main(String[] args){
        // object creation
        Course obj1 = new Course("Java", "12 months", 20000);
        Course obj2 = new Course("Web Development", "4 months", 7000.0);
        System.out.println("Before Updating Institute Name:\n");
        obj1.printDetails();
        obj2.printDetails();

        // Update the institute name
        Course.updateName("Experts' Institute");

        // Display course details after updating
        System.out.println("\nAfter Updating Institute Name:\n");
        obj1.printDetails();
        System.out.println();
        obj2.printDetails();
    }
}
