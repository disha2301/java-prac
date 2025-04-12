package com.gevernova.objectmodeling.universityfaculty;

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