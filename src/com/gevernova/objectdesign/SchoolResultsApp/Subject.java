package com.gevernova.objectdesign.SchoolResultsApp;

import java.util.*;

// Class to represent a Subject with its name and marks
class Subject {
    private String name;
    private int marks;

    // Constructor to initialize the subject and its marks
    public Subject(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Getter method for marks
    public int getMarks() {
        return marks;
    }

    // Getter method for subject name
    public String getName() {
        return name;
    }
}
