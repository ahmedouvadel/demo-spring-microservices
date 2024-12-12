package com.example.rdvservice.Repository;

import com.example.rdvservice.Entity.Rdv;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface RdvRepository extends JpaRepository<Rdv,Integer> {
    List<Rdv> findAllByOrderByDateRdvAsc();
    Rdv findByPatientIdAndDateRdv(int patientId, LocalDateTime dateRdv);
    Rdv findByMedecinIdAndDateRdv(int medecinId, LocalDateTime dateRdv);
}
