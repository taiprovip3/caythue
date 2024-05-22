package com.se.demo.service;

import java.util.List;

import com.se.demo.entity.Student;

public interface StudentService {
	public List<Student> getStudents();
	public Student createStudent(Student student);
	public void updateStudent(Student student);
	public void deleteStudent(long studentId);
}
