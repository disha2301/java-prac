package com.gevernova.objectmodeling.schoolcourse;

import java.util.List;
import java.util.ArrayList;
class Student {
    String name;
    List<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enroll(Course course) {
        courses.add(course);
    }

    void showCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course c : courses) {
            System.out.println("- " + c.name);
        }
    }
}