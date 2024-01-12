package com.example.pg.service;

import java.util.List;
import java.util.Optional;

import com.example.pg.model.Student;

public interface StuService {

	List<Student> getAllStu();

	void deleteById(int id);

	void saveStu(Student s);

	void updateStu(Student s);

	Optional<Student> getById(int id);

}
