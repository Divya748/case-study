package com.divya.microservice2.service;

import java.util.List;

import com.divya.microservice2.dto.EmployeeDto;

public interface Microservice2Service {

	

	List<EmployeeDto> getEmployeeDetails();

	EmployeeDto getEmployee();

}
