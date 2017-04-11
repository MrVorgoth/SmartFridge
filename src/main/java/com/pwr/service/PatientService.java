package com.pwr.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pwr.mappers.PatientMapper;
import com.pwr.model.PatientEntity;
import com.pwr.model.PatientTO;
import com.pwr.repository.PatientRepository;

@Service
public class PatientService implements IPatientService {

	@Autowired
	private PatientRepository patientRepository;

	@Override
	public List<PatientTO> findAllPatients() {
		List<PatientTO> result = new ArrayList<>();
		patientRepository.findAll().forEach(patientEntity -> result.add(PatientMapper.mapPatient(patientEntity)));
		return result;
	}

	@Override
	public void createPatient() {
		PatientEntity patient = new PatientEntity();
		patient.setName("Janusz");
		patient.setSurname("Cebula");
		patientRepository.save(patient);
	}

}
