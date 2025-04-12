package com.gevernova.inheritance.hierarchical.schoolsystem;

// main class
public class SchoolSystem {
    public static void main(String[] args) {
        Teacher t = new Teacher("Mr. Sharma", 45, "Mathematics");
        Student s = new Student("Ananya", 16, "10th Grade");
        Staff st = new Staff("Ramesh", 35, "Administration");

        t.displayRole();
        System.out.println();

        s.displayRole();
        System.out.println();

        st.displayRole();
    }
}
