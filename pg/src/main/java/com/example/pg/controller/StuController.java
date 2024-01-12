package com.example.pg.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pg.model.Student;
import com.example.pg.service.StuService;

@RestController
public class StuController {
	
	@Autowired
	StuService service;
	
	@GetMapping("/getAll")
	public List<Student> getAllStu(){
		List<Student> list=service.getAllStu();
		return list;
	
	}
	//@DeleteMapping("/{id}")
	@GetMapping("/{id}")
	public String deleteStuDetails(@PathVariable("id") int id) {
		service.deleteById(id);
		return "Student Details deleted successfully";
		
	}
	
	@PostMapping("/save")
	public String saveStu(Student s) {
		service.saveStu(s);
		return "Student details saved";
		
	}

	@PutMapping("/save")
	public String updateStu(Student s) {
		service.updateStu(s);
		return "Student details updated";
		
	}
	@GetMapping("/getById/{id}")
	public Optional<Student> getById(@PathVariable("id") int id) {
		return service.getById(id);
		
	}

}
