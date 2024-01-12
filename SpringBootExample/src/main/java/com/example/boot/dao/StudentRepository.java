/**
 * 
 */
package com.example.boot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.boot.model.Student;

/**
 * @author shjha
 *
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	List<Student> findByDept(String dept);

}
