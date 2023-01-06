package com.example.demoo.Repositories;

import com.example.demoo.Entities.Doctor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DoctorRepository extends CrudRepository<Doctor,Long > {
    Optional<Doctor> findById(Long id);
}
