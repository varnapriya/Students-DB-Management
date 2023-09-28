package com.thymesimple.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.ResponseBody;

import com.thymesimple.demo.entity.Student;
import com.thymesimple.demo.service.StudentService;



public class StudentpostmanController {
	private StudentService studentService;
	
	public StudentpostmanController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}


	//@RequestMapping(path="/aliens/{aid}",produces= {"application/xml"})
	@GetMapping(path="/student/{id}")
	@ResponseBody
	public Student getStudent( @PathVariable("id") Long id)
	{
	  return studentService.getStudentById(id);//Content negotiation with postman- client to server communication
	}


	@PostMapping("/student")
	@ResponseBody
	public Student addStudent(@RequestBody Student student)
	{
	  studentService.saveStudent(student);
		return student;
	}


	@DeleteMapping("/student/{id}")
	@ResponseBody
	public String DeleteStudent(@PathVariable Long id)
	{
	 
	studentService.deleteStudentById(id);
	  return "deleted";
	}
	@PutMapping("/student")
	@ResponseBody
	public Student saveOrUpdateStudent(@RequestBody Student student)
	{
	 studentService.updateStudent(student);//update
		return student;
	}

	}


