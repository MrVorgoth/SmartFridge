package com.pwr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pwr.model.PatientEntity;

public interface PatientRepository extends JpaRepository<PatientEntity, Long>{

}
