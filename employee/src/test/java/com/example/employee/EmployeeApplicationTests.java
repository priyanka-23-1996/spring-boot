package com.example.employee;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import com.example.model.Employee;
import com.example.repository.EmpRepository;
import com.example.service.EmpService;

@SpringBootTest
class EmployeeApplicationTests {
	
	@Autowired
	EmpService s;
	
	@MockBean
	EmpRepository r;

	
	@Test
	void getAllEmpTest() {
		when(r.findAll()).thenReturn(Stream.of(new Employee(1,"ram","cse",12000),
				new Employee(2,"ravi","ece",15000)).collect(Collectors.toList()));
		assertEquals(2, s.getAllEmp().size());
	}

}
