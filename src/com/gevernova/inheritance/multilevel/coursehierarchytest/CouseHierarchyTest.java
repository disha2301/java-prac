package com.gevernova.inheritance.multilevel.coursehierarchytest;

public class CourseHierarchyTest {
    public static void main(String[] args) {
        PaidOnlineCourse poc = new PaidOnlineCourse(
                "Full-Stack Web Development",
                12,
                "Coursera",
                true,
                10000,
                20
        );

        poc.displayCourseInfo();
    }
}