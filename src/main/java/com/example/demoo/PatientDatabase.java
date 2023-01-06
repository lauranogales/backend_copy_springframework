package com.example.demoo;

import com.example.demoo.Entities.Patient;

import java.time.LocalDate;
import java.util.ArrayList;

public class PatientDatabase {
    private ArrayList<Patient> patients = new ArrayList<>();

    public void addPatient(String name, String hospital, Long id, LocalDate date){
        Patient pat = new Patient(name,hospital,id,date);
        patients.add(pat);
    }
}
