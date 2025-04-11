package com.gevernova.oops;
import java.util.*;
// Abstract class for Patient
abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Abstract method
    public abstract double calculateBill();

    // Concrete method
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
// interface for medical records
interface MedicalRecord{
    void addRecord(String record);
    void viewRecords();
}

// Inpatient class
class InPatient extends Patient implements MedicalRecord{
    private List<String> records = new ArrayList<>();
    private int daysAdmitted;
    private double dailyRate;

    public InPatient(int patientId, String name, int age, int daysAdmitted, double dailyRate) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyRate = dailyRate;
    }
    @Override
    public double calculateBill() {
        return daysAdmitted * dailyRate;
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
    }
    @Override
    public void viewRecords() {
        System.out.println("InPatient Medical Records:");
        for (String rec : records) {
            System.out.println("- " + rec);
        }
    }
}

// OutPatient class
class OutPatient extends Patient implements MedicalRecord {
    private List<String> records = new ArrayList<>();
    private double consultationFee;

    public OutPatient(int patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("OutPatient Medical Records:");
        for (String rec : records) {
            System.out.println("- " + rec);
        }
    }
}

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