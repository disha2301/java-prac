package com.gevernova.objectmodeling.universtitymanagementsystem;

// Represents a Professor who can be assigned to teach subjects
class Professor {
    String name;

    Professor(String name) {
        this.name = name;
    }

    // Assign this professor to a subject
    void teachSubject(Subject subject) {
        subject.assignProfessor(this);
    }
}
