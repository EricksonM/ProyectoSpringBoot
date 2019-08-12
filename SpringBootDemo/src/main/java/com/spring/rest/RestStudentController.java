package com.spring.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.Student;
import com.spring.repository.IStudentRepo;

@RestController
@RequestMapping("/students")
public class RestStudentController {

	@Autowired
	private IStudentRepo repo;
	
	@GetMapping
	public List<Student> findAll(){
		return repo.findAll();
	}
	
	@PostMapping(value = "/{id}")
	public Optional<Student> findStudentById(@PathVariable("id") Integer id){
		return repo.findById(id);
	}
	
	@PostMapping
	public void addStudent(@RequestBody Student student) {
		repo.save(student);
	}
	
	@PutMapping
	public void updateStudent(@RequestBody Student student) {
		repo.save(student);
	}
	
	@DeleteMapping(value = "/{id}")
	public void deleteStudent(@PathVariable("id") Integer id) {
		repo.deleteById(id);
	}
	
}







