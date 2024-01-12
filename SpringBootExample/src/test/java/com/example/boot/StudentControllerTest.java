package com.example.boot;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.boot.dao.StudentRepository;
import com.example.boot.model.Student;
import com.example.boot.service.StudentServiceI;

@SpringBootTest
class StudentControllerTest {
// inject service and repository.. going to write test cases for service.
	@Autowired
	private StudentServiceI studentService;
	// we want to mock the repository here
	
	@MockBean
	private StudentRepository studentRepo;
	
	//get all students
	@Test
	public void getAllStudentsTest() {
		// there is a predefined method in mockito when
		when(studentRepo.findAll()).thenReturn(Stream.of(new Student(1L,"ram","cse"),
				new Student(2L,"shyam","ece"))
				.collect(Collectors.toList()));
	
	// compare the data return from above with assert
		assertEquals(2, studentService.getAllStudents().size());
	}

}
