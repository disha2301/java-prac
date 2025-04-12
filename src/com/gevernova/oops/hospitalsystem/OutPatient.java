package com.gevernova.oops.hospitalsystem;
import java.util.*;
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
