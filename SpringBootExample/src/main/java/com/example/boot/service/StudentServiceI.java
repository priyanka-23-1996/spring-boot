/**
 * 
 */
package com.example.boot.service;

import java.util.List;

import com.example.boot.model.Student;

/**
 * @author shjha
 *
 */
public interface StudentServiceI {

	List<Student> getAllStudents();

	String saveStudent(Student student);
	
	List<Student> getStudentByDept(String dept);

	void deleteStudent(Long id);

	void updateStudent(Student student);

}
