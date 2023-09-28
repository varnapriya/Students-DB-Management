package com.thymesimple.demo.service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.thymesimple.demo.entity.Student;
import com.thymesimple.demo.repository.StudentRepository;
import com.thymesimple.demo.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {

	StudentRepository studentrepository;
	public StudentServiceImpl(StudentRepository studentrepository) {
		super();
		this.studentrepository = studentrepository;
	}
	@Override
	public List<Student> getAllStudents() {
		
		return studentrepository.findAll();
	}
	@Override
	public Student saveStudent(Student student) {
		
		return studentrepository.save(student);
	}
	@Override
	public Student getStudentById(Long id) {
		
		return studentrepository.findById(id).get();
	}
	@Override
	public Student updateStudent(Student student) {
		
		return studentrepository.save(student);
	}
	@Override
	public void deleteStudentById(Long id) {
		
		studentrepository.deleteById(id);
	}
	
}
