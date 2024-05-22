package com.se.demo.dto;

import java.util.Date;

public class StudentDTO {
	
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
	
	public StudentDTO() {
		super();
	}
	
	public StudentDTO(long studentId, String fullName, String avatar, int age, Date birthDate) {
		super();
		this.studentId = studentId;
		this.fullName = fullName;
		this.avatar = avatar;
		this.age = age;
		this.birthDate = birthDate;
	}
	
	@Override
	public String toString() {
		return "StudentDTO [studentId=" + studentId + ", fullName=" + fullName + ", avatar=" + avatar + ", age=" + age
				+ ", birthDate=" + birthDate + "]";
	}
}
