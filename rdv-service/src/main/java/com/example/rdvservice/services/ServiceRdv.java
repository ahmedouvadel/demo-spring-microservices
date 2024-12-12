package com.example.rdvservice.services;

import com.example.rdvservice.Entity.Rdv;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface ServiceRdv {

    Rdv addRdv(Rdv rdv);
    Rdv getRdvById(int id);
    /* Rdv getRdvPatientBydateTime(int patientId, LocalDateTime dateTime);
    Rdv getRdvMedcinBydateTime(int medecinId, LocalDateTime dateTime);*/
/*
    List<Rdv> getAllRdvByOrderAsc();
*/
/*
    List<Rdv> getRdvByMedecinAndDate(int medecinId, LocalDate date);
*/

}
