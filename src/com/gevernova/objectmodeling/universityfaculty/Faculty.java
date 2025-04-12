package com.gevernova.objectmodeling.universityfaculty;

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
