package org.jsp.spring_boot_student_crud_app.repository;

import org.jsp.spring_boot_student_crud_app.dto.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import jakarta.persistence.Query;

public interface Student_Repository extends JpaRepository<Student, Integer>{

	
	
}
