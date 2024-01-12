/**
 * 
 */
package com.example.boot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

/**
 * @author shjha
 *
 */
@Entity
public class Student {

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
	public Student(Long id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String dept;
	
}
