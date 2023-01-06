package com.example.demoo.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name= "Doctor")
public class Doctor extends Person{

    public Doctor(String name,String hospital,Long id) {
        super(name,hospital,id);
    }
    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getHospital(){
        return hospital;
    }
    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

}
