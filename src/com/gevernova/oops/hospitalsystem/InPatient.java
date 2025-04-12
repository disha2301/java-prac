package com.gevernova.oops.hospitalsystem;
import java.util.*;
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
