package com.example.medecin.Service;

import com.example.medecin.entity.Medecin;
import com.example.medecin.repository.MedecinRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@RequiredArgsConstructor
public class ServiceMedecin implements IServiceMedecin {
    private final MedecinRepository medecinRepository;


    @Override
    public Medecin addMedcin(Medecin medecin) {
        return medecinRepository.save(medecin);
    }

    @Override
    public List<Medecin> allMedecin() {
        return medecinRepository.findAll();
    }
}
