package com.se.demo.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5112972615826505L;

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private long studentId;
	private String fullName;
	private String avatar;
	private int age;
	private Date birthDate;
	
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	public Student() {
		super();
	}
	
	public Student(long studentId, String fullName, String avatar, int age, Date birthDate) {
		super();
		this.studentId = studentId;
		this.fullName = fullName;
		this.avatar = avatar;
		this.age = age;
		this.birthDate = birthDate;
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", fullName=" + fullName + ", avatar=" + avatar + ", age=" + age
				+ ", birthDate=" + birthDate + "]";
	}
}
