package com.gevernova.objectmodeling.universtitymanagementsystem;

// Represents a Learner who can enroll in subjects
class Learner {
    String name;

    Learner(String name) {
        this.name = name;
    }

    // Method to enroll in a subject
    void enrollSubject(Subject subject) {
        subject.enrollLearner(this);
    }
}
