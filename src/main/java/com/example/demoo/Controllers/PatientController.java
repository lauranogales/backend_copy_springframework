package com.example.demoo.Controllers;

import com.example.demoo.Entities.Patient;
import com.example.demoo.Repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/Patient")
public class PatientController {
    @Autowired
    PatientRepository patientRepository;
    @RequestMapping("/patients/{id}")
    public String Patient(@PathVariable Long id, Model model){
        model.addAttribute("Patient",patientRepository.findById(id));
        return "Patient";
    }
    @RequestMapping(value="/patients",method= RequestMethod.GET)
    public String PatientList(Model model) {
        model.addAttribute("Doctors", patientRepository.findAll());
        return "Patient";}
    @RequestMapping(value="/patients",method=RequestMethod.POST)
    public String PatientsAdd(@RequestParam String name,
                              @RequestParam String hospital, @RequestParam Long id, @RequestParam LocalDate date, Model model) {
        Patient newPatient = new Patient(name,hospital,id,date);
        newPatient.setName(name);
        newPatient.setHospital(hospital);
        patientRepository.save(newPatient);

        model.addAttribute("Patient", newPatient);
        return "redirect:/patients/" + newPatient.getId();

    }}

