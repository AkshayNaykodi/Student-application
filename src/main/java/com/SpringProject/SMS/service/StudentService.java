package com.SpringProject.SMS.service;

import java.util.List;

import com.SpringProject.SMS.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
	Student saveStudent(Student student);

	Student getStudentById(Integer id);

	Student updateStudent(Student student);

	void deleteStudentById(Integer id);
	
}
	


