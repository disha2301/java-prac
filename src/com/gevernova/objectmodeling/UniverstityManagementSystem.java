package com.gevernova.objectmodeling;
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

public class UniverstityManagementSystem {
    public static void main(String[] args) {
        // Create learners
        Learner l1 = new Learner("Disha");
        Learner l2 = new Learner("Ravi");

        // Create professor
        Professor prof1 = new Professor("Dr. Mehta");

        // Create subject
        Subject javaSubject = new Subject("Java Programming");

        // Assign professor and enroll learners
        prof1.teachSubject(javaSubject);
        l1.enrollSubject(javaSubject);
        l2.enrollSubject(javaSubject);

        // Display subject details
        System.out.println("\nSubject Information:");
        javaSubject.showSubjectDetails();
    }
}
