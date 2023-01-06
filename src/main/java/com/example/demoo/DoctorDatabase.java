package com.example.demoo;


import com.example.demoo.Entities.Doctor;
import com.example.demoo.Entities.Nurse;
import com.example.demoo.Entities.Person;

import java.util.ArrayList;
public class DoctorDatabase {
        ArrayList<Person> persons=new ArrayList<Person>();

        public void addDoctor(String name, String hospital, long id){
        Doctor doc=new Doctor(name, hospital, id);
        }
        public void addNurse(String name, String hospital, long id){
        Nurse nur=new Nurse(name, hospital, id);
        }
}


//PatientDatabase Pd = new PatientDatabase();
//DoctorDatabase Dd = new DoctorDatabase();

//Adding patients to the patient database:
//Pd.addPatient("Claire Robinson","St.Mary's", Long.valueOf("09678345"), LocalDate.of(2022,12,12));
//Pd.addPatient("Peter Smith","St.Mary's", Long.valueOf("56748377"),LocalDate.of(2022,12,20));
//Pd.addPatient("Casilda Perez","Hammersmith", Long.valueOf("55678376"),LocalDate.of(2022,12,19));
//Pd.addPatient("George Campbell","St.Mary's", Long.valueOf("43554908"),LocalDate.of(2022,12,20));
//Pd.addPatient("Sophie Taylor","Hammersmith", Long.valueOf("56778034"),LocalDate.of(2022,12,16));

//Adding Doctors and nurses:
//Dd.addDoctor("Dr.Clara Molano","St.Mary's", Long.parseLong("6577"));
//Dd.addNurse("Jacob Kent","Hammersmith", Long.parseLong("4898"));
//Dd.addDoctor("Dr.Laura Nogales","St.Mary's", Long.parseLong("1009"));
//Dd.addNurse("Luisa Johnson","Hammersmith", Long.parseLong("5666"));
//Dd.addDoctor("Dr.Maira Nikoli","Hammersmith", Long.parseLong("8780"));
//Dd.addNurse("Margaux Casadevall","Hammersmith", Long.parseLong("1670"));
//Dd.addDoctor("Dr.Basile Quirot","Hammersmith", Long.parseLong("4570"));
////