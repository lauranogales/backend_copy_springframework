package com.example.demoo.Entities;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected String name;
    protected Long id;
    protected String hospital;

    public Person(String name,String hospital, Long id){
        this.id = id;
        this.hospital = hospital;
        this.name = name;
    }

    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getHospital(){
        return hospital;
    }

}