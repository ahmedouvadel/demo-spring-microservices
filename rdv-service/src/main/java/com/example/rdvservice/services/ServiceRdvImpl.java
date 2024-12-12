package com.example.rdvservice.services;

import com.example.rdvservice.Entity.Rdv;
import com.example.rdvservice.Repository.RdvRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ServiceRdvImpl implements ServiceRdv {

    private final RdvRepository rdvRepository;


    @Override
    public Rdv addRdv(Rdv rdv) {
        Rdv rdv1 = rdvRepository.findByPatientIdAndDateRdv(rdv.getPatientId(), rdv.getDateRdv());
        Rdv rdv2 = rdvRepository.findByMedecinIdAndDateRdv(rdv.getMedecinId(), rdv.getDateRdv());
        if (rdv1==null && rdv2==null)
            return rdvRepository.save(rdv);
        else
            return null;
    }

    @Override
    public Rdv getRdvById(int id) {
        return rdvRepository.findById(id).get();
    }
}
