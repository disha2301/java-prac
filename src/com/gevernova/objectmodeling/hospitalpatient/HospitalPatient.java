package com.gevernova.objectmodeling.hospitalpatient;

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