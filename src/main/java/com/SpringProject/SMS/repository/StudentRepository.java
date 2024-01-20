package com.SpringProject.SMS.repository;
// Java persistent API

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringProject.SMS.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

	

	
}
