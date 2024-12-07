package com.example.patient.controller;

import com.example.patient.entity.Patient;
import com.example.patient.service.IServicePatient;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api")
public class PatientController {
    private final IServicePatient servicePatient;

    @GetMapping("/patient/all")
    public ResponseEntity<List<Patient>> getAllPatient(){
        List<Patient> patientList = servicePatient.allPatient();
        return new ResponseEntity<>(patientList, HttpStatus.ACCEPTED);
    }

    @PostMapping("/patient")

    public ResponseEntity<Patient> addPatient(@RequestBody Patient patient){
        Patient patient1= servicePatient.addPatient(patient);
        return new ResponseEntity<>(patient1, HttpStatus.CREATED);
    }
}
