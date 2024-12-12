package com.example.patient.service;

import com.example.patient.entity.Patient;

import java.util.List;
import java.util.Optional;

public interface IServicePatient {
    Patient addPatient(Patient patient);
    List<Patient> allPatient();
    Optional<Patient> getPatientById(int id);


}
