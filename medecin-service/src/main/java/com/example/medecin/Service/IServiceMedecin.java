package com.example.medecin.Service;

import com.example.medecin.entity.Medecin;


import java.util.List;

public interface IServiceMedecin {

    Medecin addMedcin(Medecin medecin);
    List<Medecin> allMedecin();

}
