package org.jsp.spring_boot_student_crud_app.controller;

import java.util.Optional;

import org.jsp.spring_boot_student_crud_app.dto.Student;
import org.jsp.spring_boot_student_crud_app.service.Student_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student_Controller {
	
	@Autowired
	private Student_Service service;
	
	//save
	@PostMapping("/save/student")
	public void saveStudent(@RequestBody Student student) {
		service.saveStudent(student);
	}
	
	
	//fetch
	@GetMapping("/find/student/{id}")
	public Optional<Student> findById(@PathVariable int id) {
		return service.findById(id);
	}
	
	
	//delete
	@DeleteMapping("/delete/student/{id}")
	public void deleteById(@PathVariable int id) {
		service.deleteById(id);
	}
	
	
	//update
	@PutMapping("/update/student/{id}")
	public void updateById(@PathVariable int id,@RequestBody Student student) {
		service.updateById(id, student);
	}
}
