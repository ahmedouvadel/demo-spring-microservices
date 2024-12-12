package com.example.medecin.Service;

import com.example.medecin.entity.Medecin;


import java.util.List;
import java.util.Optional;

public interface IServiceMedecin {

    Medecin addMedcin(Medecin medecin);
    List<Medecin> allMedecin();
    Optional<Medecin> getMedecinById(int id);


}
