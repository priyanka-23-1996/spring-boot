package jdbcExample.service;

import jdbcExample.dao.StudentDaoImpl;
import jdbcExample.entity.Student;

public class StudentService {
	
	public void saveStu(Student s) {
		
		StudentDaoImpl sd = new StudentDaoImpl();
		sd.saveStu(s);
		
	}

}
