package com.gevernova.objectmodeling.hospitalpatient;
import java.util.*;
// Doctor class
class Doctor {
    private String name;
    private List<Patient> patients = new ArrayList<>();

    public Doctor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void consult(Patient patient) {
        System.out.println("Dr. " + name + " is consulting patient " + patient.getName());
        patients.add(patient);
        patient.addDoctor(this);
    }

    public void showPatients() {
        System.out.println("Dr. " + name + " has consulted:");
        for (Patient p : patients) {
            System.out.println("→ " + p.getName());
        }
    }
}