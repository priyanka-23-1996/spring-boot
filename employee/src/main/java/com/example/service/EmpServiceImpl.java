package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Employee;
import com.example.repository.EmpRepository;

@Service
public class EmpServiceImpl implements EmpService{
	
	@Autowired
	EmpRepository repository;

	@Override
	public List<Employee> getAllEmp() {
		return repository.findAll();
	}

	@Override
	public void saveEmp(Employee e) {
		 repository.save(e);
		
	}

	@Override
	public String updateEmpDetails(Employee e) {
	        repository.save(e);
	        return "Success";
	    }

	@Override
	public String deleteEmpDetails(int empId) {
		repository.deleteById(empId);;
		return "sucess";
	}
	}

