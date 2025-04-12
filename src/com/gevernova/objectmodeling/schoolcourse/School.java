package com.gevernova.objectmodeling.schoolcourse;
import java.util.List;
import java.util.ArrayList;
class School {
    String name;
    List<Student> students = new ArrayList<>();

    School(String name) {
        this.name = name;
    }

    void addStudent(Student student) {
        students.add(student);
    }

    void showStudents() {
        System.out.println("Students in " + name + ":");
        for (Student s : students) {
            System.out.println("- " + s.name);
        }
    }
}