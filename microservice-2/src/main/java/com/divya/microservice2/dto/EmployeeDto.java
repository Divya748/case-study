package com.divya.microservice2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {

	
	private String employeeId;
	
	private String employeeName;

	private int employeeSalary;
	
	private String employeePhone;
}
