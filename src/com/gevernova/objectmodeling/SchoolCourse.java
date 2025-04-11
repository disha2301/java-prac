package com.gevernova.objectmodeling;
import java.util.*;

class Course {
    String name;

    Course(String name) {
        this.name = name;
    }
}

class Student {
    String name;
    List<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enroll(Course course) {
        courses.add(course);
    }

    void showCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course c : courses) {
            System.out.println("- " + c.name);
        }
    }
}

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

public class SchoolCourse {
    public static void main(String[] args) {
        School school = new School("Sunrise Public School");

        Student disha = new Student("Disha");
        Student arjun = new Student("Arjun");

        Course math = new Course("Math");
        Course english = new Course("English");

        // Aggregation: School has students
        school.addStudent(disha);
        school.addStudent(arjun);

        // Association: Students enroll in courses
        disha.enroll(math);
        disha.enroll(english);
        arjun.enroll(english);

        // Display info
        school.showStudents();
        disha.showCourses();
        arjun.showCourses();
    }
}


