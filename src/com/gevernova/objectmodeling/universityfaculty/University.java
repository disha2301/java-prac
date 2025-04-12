package com.gevernova.objectmodeling.universityfaculty;

import java.util.List;
import java.util.ArrayList;
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