package jdbcExample.controller;

import jdbcExample.entity.Student;
import jdbcExample.service.StudentService;

public class StudentController {

	public static void main(String[] args) {
	
		Student s = new Student(1,"ram",15456316L);
		
		StudentService service = new StudentService();
		service.saveStu(s);


	}


}