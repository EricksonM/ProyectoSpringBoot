package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.model.Student;

public interface IStudentRepo extends JpaRepository<Student, Integer>{

	
}
