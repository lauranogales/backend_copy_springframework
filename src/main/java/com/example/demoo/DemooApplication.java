package com.example.demoo;

import com.example.demoo.Entities.Doctor;
import com.example.demoo.Entities.Patient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

//@ServletComponentScan
@SpringBootApplication
public class DemooApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemooApplication.class, args);
    }

        @Override
        public void run(String... args) throws Exception {
            List<Doctor> doctors = new LinkedList<Doctor>();
            List<Patient> patients = new LinkedList<Patient>();

            patients.add(new Patient("Claire Robinson","St.Mary's", Long.valueOf("09678345"), LocalDate.of(2022,12,12)));
            patients.add(new Patient("Peter Smith","St.Mary's", Long.valueOf("56748377"),LocalDate.of(2022,12,20)));
            patients.add(new Patient("Casilda Perez","Hammersmith", Long.valueOf("55678376"),LocalDate.of(2022,12,19)));
            patients.add(new Patient("George Campbell","St.Mary's", Long.valueOf("43554908"),LocalDate.of(2022,12,20)));
            patients.add(new Patient("Sophie Taylor","Hammersmith", Long.valueOf("56778034"),LocalDate.of(2022,12,16)));

            //Adding Doctors and nurses:
            doctors.add(new Doctor("Dr.Clara Molano","St.Mary's", Long.parseLong("6577")));
            //Dd.addNurse("Jacob Kent","Hammersmith", Long.parseLong("4898"));
            doctors.add(new Doctor("Dr.Laura Nogales","St.Mary's", Long.parseLong("1009")));
            //Dd.addNurse("Luisa Johnson","Hammersmith", Long.parseLong("5666"));
            doctors.add(new Doctor("Dr.Maira Nikoli","Hammersmith", Long.parseLong("8780")));
            //Dd.addNurse("Margaux Casadevall","Hammersmith", Long.parseLong("1670"));
            doctors.add(new Doctor("Dr.Basile Quirot","Hammersmith", Long.parseLong("4570")));

        }
    }

