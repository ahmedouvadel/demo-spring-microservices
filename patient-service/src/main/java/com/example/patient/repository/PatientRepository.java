package com.example.patient.repository;

import com.example.patient.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface PatientRepository extends JpaRepository<Patient,Integer> {
    Optional<Patient> findById(Integer integer);
}
