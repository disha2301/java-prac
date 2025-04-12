package com.gevernova.objectmodeling.hospitalpatient;

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