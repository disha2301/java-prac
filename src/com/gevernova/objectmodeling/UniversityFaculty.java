package com.gevernova.objectmodeling;

import java.util.*;

// Aggregation: Faculty can exist independently
class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }

    void showInfo() {
        System.out.println("Faculty: " + name);
    }
}

// Composition: Units belong only to the University
class Unit {
    String unitName;

    Unit(String unitName) {
        this.unitName = unitName;
    }

    void showInfo() {
        System.out.println("Unit: " + unitName);
    }
}

// University class using composition (for Units) and aggregation (for Faculty)
class University {
    String name;
    List<Unit> units = new ArrayList<>();
    List<Faculty> facultyMembers = new ArrayList<>();

    University(String name) {
        this.name = name;
    }

    void addUnit(String unitName) {
        units.add(new Unit(unitName));
    }

    void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    void showDetails() {
        System.out.println("University: " + name);
        System.out.println("Units:");
        for (Unit u : units) {
            u.showInfo();
        }
        System.out.println("Faculty Members:");
        for (Faculty f : facultyMembers) {
            f.showInfo();
        }
    }

    void deleteUniversity() {
        System.out.println("Deleting university and its units...");
        units.clear(); // Composition: units are deleted with the university
    }
}

// Main class
public class UniversityFaculty {
    public static void main(String[] args) {
        University uni = new University("NovaTech University");

        // Adding units (composition)
        uni.addUnit("Software Engineering");
        uni.addUnit("Data Science");

        // Creating faculty (aggregation)
        Faculty disha = new Faculty("Disha Yadav");
        Faculty om = new Faculty("Om Sharma");

        // Adding faculty to university
        uni.addFaculty(disha);
        uni.addFaculty(om);

        // Display university info
        uni.showDetails();

        // Delete university (removes units only)
        uni.deleteUniversity();

        // Faculty still exists
        System.out.println("\nFaculty still exists after university deletion:");
        disha.showInfo();
        om.showInfo();
    }
}
