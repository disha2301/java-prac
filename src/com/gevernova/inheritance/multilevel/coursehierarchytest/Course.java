package com.gevernova.inheritance.multilevel.coursehierarchytest;

// Base class representing a general course
class Course {
    String courseName;
    int duration; // duration in weeks

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Display basic course info
    void displayCourseInfo() {
        System.out.println("Course: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
    }
}