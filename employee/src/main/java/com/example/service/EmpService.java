package com.example.service;

import java.util.List;

import com.example.model.Employee;

public interface EmpService {

	List<Employee> getAllEmp();

	void saveEmp(Employee e);

	String updateEmpDetails(Employee e);

	String deleteEmpDetails(int empId);

}
