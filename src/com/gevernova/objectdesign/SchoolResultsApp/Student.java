package com.gevernova.objectdesign.SchoolResultsApp;
import java.util.*;

// Class to represent a Student, who has multiple subjects
class Student {
    private String name;
    private List<Subject> subjects;

    // Constructor to initialize the student's name and list of subjects
    public Student(String name) {
        this.name = name;
        this.subjects = new ArrayList<>();
    }

    // Method to add a subject to the student's subject list
    public void addSubject(Subject s) {
        subjects.add(s);
    }

    // Getter method for student's subjects
    public List<Subject> getSubjects() {
        return subjects;
    }

    // Getter method for student's name
    public String getName() {
        return name;
    }
}
