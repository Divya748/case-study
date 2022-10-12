package com.divya.microservice2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.divya.microservice2.dto.EmployeeDto;
import com.divya.microservice2.dto.EmployeeList;

@Service
public class Microservice2ServiceImpl implements Microservice2Service {

	@Autowired
	RestTemplate restTemplate;

	@SuppressWarnings("unchecked")
	@Override
	public List<EmployeeDto> getEmployeeDetails() {
		String url = "http://microservice-1/micro1/micro-service1/listemployees";
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url);
		List<EmployeeDto> data = (List<EmployeeDto>) restTemplate.getForObject(builder.toUriString(), List.class);
		return data;
	}

	@Override
	public EmployeeDto getEmployee() {
		String url = "http://microservice-1/micro1/micro-service1/employee";
		EmployeeDto details = restTemplate.getForObject(url, EmployeeDto.class);
		return details;
	}
	
	/*@Override
	public void callMicroservice1() {

		String url = "http://localhost:1001/micro1/micro-service1/listemployees";
		EmployeeDto data = restTemplate.getForObject(url, EmployeeDto.class);}
		*/
	}


