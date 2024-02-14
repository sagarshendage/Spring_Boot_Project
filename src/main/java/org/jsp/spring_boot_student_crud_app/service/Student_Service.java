package org.jsp.spring_boot_student_crud_app.service;

import java.util.Optional;

import org.jsp.spring_boot_student_crud_app.dao.Student_Dao;
import org.jsp.spring_boot_student_crud_app.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Student_Service {
		
		@Autowired
		private Student_Dao dao;
		
		public void saveStudent(Student student) {
			dao.saveStudent(student);
		}
		
		public Optional<Student> findById(int id) {
			return dao.findById(id);
		}
		
		public void deleteById(int id) {
			dao.deleteById(id);
		}
		
		public void updateById(int id,Student student) {
			dao.updateById(id, student);
		}
}
