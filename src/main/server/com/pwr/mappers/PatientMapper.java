package com.pwr.mappers;

import com.pwr.model.PatientEntity;
import com.pwr.model.PatientTO;

public final class PatientMapper {
	
	private PatientMapper() {
		
	}
	
	public static PatientTO mapPatient(PatientEntity patientEntity) {
		PatientTO patient = new PatientTO();
		patient.setName(patientEntity.getName());
		patient.setSurname(patientEntity.getSurname());
		return patient;
	}

}
