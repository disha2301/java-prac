package com.gevernova.objectmodeling.schoolcourse;

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