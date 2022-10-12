package com.divya.microservice2.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class EmployeeList {

	private List<EmployeeDto> employees;

    public EmployeeList() {
        employees = new ArrayList<>();
    }
}
