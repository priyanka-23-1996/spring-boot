package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.service.EmpService;

@RestController
@RequestMapping("/emp")
public class EmpController {

	@Autowired
	EmpService service;
	
	@GetMapping("/getAll")
	public List<Employee> getAllEmp(){
		return service.getAllEmp();
		
	}
	@PostMapping("/save")
	public void saveEmp(Employee e) {
		service.saveEmp(e);
		
	}
	
    @PutMapping("/update")
    public String updateEmpDetails(@RequestBody Employee e)
    {
        service.updateEmpDetails(e);
        return "Employee Updated Successfully";
    }
    @DeleteMapping("/{empId}")
    public String deleteEmpDetails(@PathVariable("empId") int empId)
    {
        service.deleteEmpDetails(empId);
        return "Employee Deleted Successfully";
    }
}
