package com.example.demoo.Entities;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
public class Patient{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public LocalDate date;
    protected String name;
    protected Long id;
    protected String hospital;
    public Patient(String name, String hospital, Long id, LocalDate date){

        this.name = name;
        this.hospital = hospital;
        this.id = id;
        this.date = date;
    }
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public void setName(String name){ this.name = name;}
    public String getHospital(){
        return hospital;
    }
    public void setHospital(String hospital){
        this.hospital=hospital;
    }
    public LocalDate getDate(){ return date;}
    public void setDate(LocalDate date){
        this.date=date;
    }

}
