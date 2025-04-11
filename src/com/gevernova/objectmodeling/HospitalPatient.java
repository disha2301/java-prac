package com.gevernova.objectmodeling;
import java.util.*;
class Patient{
    private String name;
    private List<Doctor> doctors = new ArrayList<>();
    // constructor
    public Patient(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void addDoctor(Doctor doctor){
        doctors.add(doctor);
    }
    public void showDoctors(){
        System.out.println("Patient " + name + " has consulted:");
        for (Doctor d : doctors) {
            System.out.println("→ Dr. " + d.getName());
        }
    }
}
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

public class HospitalPatient {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("CityCare Hospital");

        Doctor doc1 = new Doctor("Disha Yadav");
        Doctor doc2 = new Doctor("Om Mehta");

        Patient pat1 = new Patient("Arjun");
        Patient pat2 = new Patient("Riya");

        hospital.addDoctor(doc1);
        hospital.addDoctor(doc2);

        hospital.addPatient(pat1);
        hospital.addPatient(pat2);

        // Consultations (many-to-many communication)
        doc1.consult(pat1);
        doc1.consult(pat2);
        doc2.consult(pat1);

        System.out.println("\nDoctor-wise Consultations:");
        doc1.showPatients();
        doc2.showPatients();

        System.out.println("\nPatient-wise Consultations:");
        pat1.showDoctors();
        pat2.showDoctors();
    }
}
