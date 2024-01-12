/**
 * 
 */
package com.example.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.boot.dao.StudentRepository;
import com.example.boot.model.Student;

/**
 * @author shjha
 *
 */
@Service
public class StudentServiceImpl implements StudentServiceI {

	@Autowired
	StudentRepository studentRepo;
	
	@Override
	public String saveStudent(Student student) {
		studentRepo.save(student);
		return "saved successfully.";
	}
	
	@Override 
	public List<Student> getAllStudents() {
		return studentRepo.findAll();
	}
	
	@Override
	public List<Student> getStudentByDept(String dept) {
		return studentRepo.findByDept(dept);
	}
	
	@Override 
	public void updateStudent(Student student) {
		studentRepo.save(student);
	}
	
	@Override
	public void deleteStudent(Long id) {
		studentRepo.deleteById(id);
	}
}
