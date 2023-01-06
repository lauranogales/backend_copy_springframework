package com.example.demoo.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name= "Nurse")
public class Nurse extends Person {
    public Nurse(String name,String hospital, Long id) {
        super(name,hospital, id);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String getHospital(){
        return hospital;
    }
}
