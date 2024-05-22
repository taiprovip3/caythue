package com.se.demo.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.se.demo.dto.StudentDTO;
import com.se.demo.entity.Student;
import com.se.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/create")
	public ResponseEntity<?> createStudent(@RequestBody StudentDTO studentDTO) {
		
		String fullName = studentDTO.getFullName();
		String avatar = studentDTO.getAvatar();
		int age = studentDTO.getAge();
		Date date = new Date();
		Student s = new Student(0, fullName, avatar, age, date);
		return ResponseEntity.ok(studentService.createStudent(s));
	}
	
	@GetMapping("/list")
	public ResponseEntity<?> getStudents() {
		return ResponseEntity.ok(studentService.getStudents());
	}
	
	@PutMapping("/update")
	public ResponseEntity<?> updateStudent(@RequestBody StudentDTO studentDTO) {
		long studentId = studentDTO.getStudentId();
		if(studentId == 0) {
			return ResponseEntity.badRequest().body("Missing studentId to update!");
		}
		String fullName = studentDTO.getFullName();
		String avatar = studentDTO.getAvatar();
		int age = studentDTO.getAge();
		Date birthDate = studentDTO.getBirthDate();
		Student s = new Student(studentId, fullName, avatar, age, birthDate);
		try {
			studentService.updateStudent(s);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.badRequest().body("Error while update entity!");
		}
		return ResponseEntity.ok("OK. Update success!");
	}
	
	@DeleteMapping("/delete/{studentId}")
	public ResponseEntity<?> deleteStudent(@PathVariable long studentId) {
		try {
			studentService.deleteStudent(studentId);
			return ResponseEntity.ok("OK. Delete success!");
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.badRequest().body("Error while delete entity!");
		}
	}
}
