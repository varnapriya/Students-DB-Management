package com.thymesimple.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thymesimple.demo.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
