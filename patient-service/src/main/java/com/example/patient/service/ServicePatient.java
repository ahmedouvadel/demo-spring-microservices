package com.example.patient.service;

import com.example.patient.entity.Patient;
import com.example.patient.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@RequiredArgsConstructor
public class ServicePatient implements IServicePatient {

    private final PatientRepository patientRepository;

    @Override
    public Patient addPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public List<Patient> allPatient() {
        return patientRepository.findAll();
    }
}
