package com.example.rdvservice.controller;


import com.example.rdvservice.Entity.Rdv;
import com.example.rdvservice.clients.MedecinRestClient;
import com.example.rdvservice.clients.PatientRestClient;
import com.example.rdvservice.model.Medecin;
import com.example.rdvservice.model.Patient;
import com.example.rdvservice.services.ServiceRdv;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api")
public class RdvController {

    private final ServiceRdv serviceRdv;
    private final PatientRestClient patientRestClient;
    private final MedecinRestClient medecinRestClient;

    @GetMapping("{id}")
    public Rdv getById(@PathVariable int id){
        Rdv rdv = serviceRdv.getRdvById(id);
        Optional<Patient> patient = patientRestClient.getPatientById(rdv.getPatientId());
        Optional<Medecin> medecin = medecinRestClient.getMedecinById(rdv.getMedecinId());
        rdv.setPatient(patient.get());
        rdv.setMedecin(medecin.get());
        return rdv;
    }
    @PostMapping("add")
    public ResponseEntity<Object> add(@RequestBody Rdv rdv){
        Rdv rdv1=null;
        Optional<Patient> patient = patientRestClient.getPatientById(rdv.getPatientId());
        Optional<Medecin> medecin = medecinRestClient.getMedecinById(rdv.getMedecinId());
        if (patient.isPresent() && medecin.isPresent())
            rdv1 = serviceRdv.addRdv(rdv);
        if (rdv1!=null)
            return new ResponseEntity<>(rdv, HttpStatus.CREATED);
        else
            return new ResponseEntity<>("Le Rdv ne peut pas étre crée, merci de vérifier vos données",HttpStatus.CONFLICT);
    }

}
