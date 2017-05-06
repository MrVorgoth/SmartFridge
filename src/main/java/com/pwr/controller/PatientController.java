package com.pwr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pwr.model.PatientTO;
import com.pwr.service.IPatientService;

@RestController
@RequestMapping(path = "patient")
public class PatientController {

	@Autowired
	private IPatientService patientService;

	@RequestMapping(path = "all", method = RequestMethod.GET)
  @ResponseBody
	public List<PatientTO> findAllPatients() {
		return patientService.findAllPatients();
	}

	@RequestMapping(path = "create", method = RequestMethod.GET)
  @ResponseBody
	public void createPatient() {
		patientService.createPatient();
	}

	@RequestMapping(path = "hello")
  @ResponseBody
	public String hello() {
		return "Hello, world";
	}

}
