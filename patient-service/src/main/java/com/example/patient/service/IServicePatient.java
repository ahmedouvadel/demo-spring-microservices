package com.example.patient.service;

import com.example.patient.entity.Patient;

import java.util.List;

public interface IServicePatient {
    Patient addPatient(Patient patient);
    List<Patient> allPatient();

}
