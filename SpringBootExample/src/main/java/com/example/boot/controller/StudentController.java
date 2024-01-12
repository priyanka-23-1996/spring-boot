package com.example.boot.controller;
/**
 * 
 */

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.boot.exception.StudentNotFoundException;
import com.example.boot.model.Student;
import com.example.boot.service.StudentServiceI;

import lombok.extern.slf4j.Slf4j;

/**
 * @author shjha
 *
 */
@RestController
@Slf4j
public class StudentController {

	@Autowired
	StudentServiceI studentService;
	
	@GetMapping("/")
	public String welcome() {
		return "Welcome";
	}
	
	@GetMapping("/user")
	public String user() {
		return "user";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "admin";
	}
	
	@PostMapping("/save-student")
	public String saveStudents(@RequestBody Student student) {
		studentService.saveStudent(student);
		return "saved successfully";
	}
	
	@GetMapping("/all-students")
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}
	
	@GetMapping("/get-student-by-dept")
	public ResponseEntity<List<Student>> getStudentByDept(@PathParam("dept") String dept) {
		if(studentService.getStudentByDept(dept).isEmpty()) {
			throw new StudentNotFoundException();
		}
		return new ResponseEntity<List<Student>>(studentService.getStudentByDept(dept), HttpStatus.OK);
	}
	
	@PutMapping("/update-student")
	public String updateStudent(@RequestBody Student student) {
		studentService.updateStudent(student);
		return "updated successfully.";
	}
	
	@DeleteMapping("/delete-student/{id}")
	public String deleteStudent(@PathVariable Long id) {
		studentService.deleteStudent(id);
		return "successfully deleted.";
	}
	
	@GetMapping("/healthCheck")
	public ResponseEntity<HealthResonse> healthCheck() {
		HealthResonse health = new HealthResonse();
		health.setStatus("OK");
		System.out.println(new Date());
		System.out.println(LocalDateTime.now());
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
		LocalDateTime myDateObj = LocalDateTime.now();
		String formattedString = ZonedDateTime.now().format(formatter);
		health.setCurrentTime(formattedString);
		return ResponseEntity.status(HttpStatus.OK).body(health);
	}
	
	
}

class HealthResonse {
	
	private String status;
	private String currentTime;

	public String getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(String currentTime) {
		this.currentTime = currentTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}

