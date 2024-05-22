package com.se.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.se.demo.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
