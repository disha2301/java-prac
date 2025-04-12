package com.gevernova.objectmodeling.universtitymanagementsystem;

import java.util.*;

// Represents a Subject with title, assigned professor, and enrolled learners
class Subject {
    String subjectName;
    Professor professor;
    List<Learner> learners;

    Subject(String subjectName) {
        this.subjectName = subjectName;
        this.learners = new ArrayList<>();
    }

    // Assign a professor to the subject
    void assignProfessor(Professor professor) {
        this.professor = professor;
        System.out.println(professor.name + " is assigned to teach " + subjectName);
    }

    // Enroll a learner in the subject
    void enrollLearner(Learner learner) {
        learners.add(learner);
        System.out.println(learner.name + " enrolled in " + subjectName);
    }

    // Show subject info
    void showSubjectDetails() {
        System.out.println("Subject: " + subjectName);
        System.out.println("Professor: " + (professor != null ? professor.name : "Not Assigned"));
        System.out.println("Enrolled Learners:");
        for (Learner l : learners) {
            System.out.println("- " + l.name);
        }
    }
}