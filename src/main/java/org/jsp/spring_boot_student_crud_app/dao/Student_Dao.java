package org.jsp.spring_boot_student_crud_app.dao;

import java.util.Optional;

import org.jsp.spring_boot_student_crud_app.dto.Student;
import org.jsp.spring_boot_student_crud_app.repository.Student_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Student_Dao {
	
	@Autowired
	private Student_Repository repository;
	
	public void saveStudent(Student student) {
		repository.save(student);
	}
	
	public Optional<Student> findById(int id) {
		return repository.findById(id);
	}
	
	public void deleteById(int id) {
		repository.deleteById(id);
	}
	
	public void updateById(int id,Student student) {
		student.setRollNo(id);
		repository.save(student);
	}
}
