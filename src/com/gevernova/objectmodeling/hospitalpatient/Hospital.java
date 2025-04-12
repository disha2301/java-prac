package com.gevernova.objectmodeling.hospitalpatient;
import java.util.*;
// Hospital class
class Hospital {
    private String name;
    private List<Doctor> doctors = new ArrayList<>();
    private List<Patient> patients = new ArrayList<>();

    public Hospital(String name) {
        this.name = name;
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void showAllConsultations() {
        System.out.println("Consultations in " + name + ":");
        for (Doctor d : doctors) {
            d.showPatients();
        }
    }
}
