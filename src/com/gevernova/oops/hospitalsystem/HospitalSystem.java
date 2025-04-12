package com.gevernova.oops.hospitalsystem;

// Main class to demonstrate polymorphism
public class HospitalSystem {
    public static void main(String[] args) {
        Patient[] patients = {
                new InPatient(101, "Anjali", 45, 5, 2000),
                new OutPatient(102, "Rohan", 30, 500)
        };

        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Total Bill: ₹" + p.calculateBill());

            if (p instanceof MedicalRecord) {
                ((MedicalRecord) p).addRecord("Routine checkup completed.");
                ((MedicalRecord) p).addRecord("Diagnosis: Stable.");
                ((MedicalRecord) p).viewRecords();
            }

            System.out.println("--------------------------");
        }
    }
}