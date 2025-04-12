package com.gevernova.objectmodeling.universtitymanagementsystem;

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