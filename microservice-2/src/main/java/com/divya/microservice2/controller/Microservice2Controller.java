package com.divya.microservice2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.divya.microservice2.dto.EmployeeDto;
import com.divya.microservice2.service.Microservice2Service;

@RestController
@RequestMapping("/microservice2")
public class Microservice2Controller {

	@Autowired
	Microservice2Service service;
	
	@GetMapping("/employeedetails")
	public List<EmployeeDto> getMicroservice1EmployeeDetails() {
		List<EmployeeDto> details = service.getEmployeeDetails();
		return details;
	}
	
	@GetMapping("/employee1")
	public EmployeeDto getMicroservice1Employee() {
		EmployeeDto details = service.getEmployee();
		return details;
	}

}
