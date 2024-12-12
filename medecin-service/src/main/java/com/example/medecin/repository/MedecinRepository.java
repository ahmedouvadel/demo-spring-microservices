package com.example.medecin.repository;

import com.example.medecin.entity.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MedecinRepository extends JpaRepository<Medecin,Integer> {
    Optional<Medecin> findById(Integer integer);

}
