package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class EmployeeDAO {

	//creation of reference 
	@Autowired
	EmployeeRepository repo;
	
	
	//insertion 
	public Employee insert(Employee e) {
		return repo.save(e);
	}
	
	//retrival 
	
	public List<Employee> getall(){
		return repo.findAll();
	}
	
	
	
}
