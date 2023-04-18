package com.example.atelier2.repositories;

import com.example.atelier2.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PatientRepository extends JpaRepository<Patient,Long> {
    public List<Patient> findByMalade(boolean n);
    public Page<Patient> findByMalade(boolean n, Pageable pageable);

    public List<Patient> findByMaladeAndScoreLessThan(boolean n,int s);
}
