package com.example.pg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pg.model.Student;
import com.example.pg.repository.StuRepository;

@Service
public class StuServiceI implements StuService{
	
	@Autowired
	StuRepository repository;

	@Override
	public List<Student> getAllStu() {
		List<Student> l= repository.findAll();
		return l;
	}

	@Override
	public void deleteById(int id) {
		repository.deleteById(id);
		
	}

	@Override
	public void saveStu(Student s) {
		repository.save(s);
		
	}

	@Override
	public void updateStu(Student s) {
		repository.save(s);
		
	}

	@Override
	public Optional<Student> getById(int id) {
	 Optional<Student> s=repository.findById(id);
	 return s;

	}
	
	

}
