package com.example.pg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pg.model.Student;

@Repository
public interface StuRepository extends JpaRepository<Student,Integer>{

}
