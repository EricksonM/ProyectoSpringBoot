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

import com.spring.model.Family;
import com.spring.repository.IFamilyRepo;

@RestController
@RequestMapping("/family")
public class RestFamilyController {

	@Autowired
	private IFamilyRepo repo;
	
	@GetMapping
	public List<Family> findAll(){
		return repo.findAll();
	}
	
	@PostMapping
	public void addFamily(@RequestBody Family family) {
		repo.save(family);
	}
	
	@PostMapping(value = "/{id}")
	public Optional<Family> findFamilyById(@PathVariable("id") Integer id){
		return repo.findById(id);
	}
	
	@PostMapping(value = "/findFamily/{id}")
	public List<Family> findStudentFamilyById(@PathVariable("id") Integer id){
		return repo.findByIdStudent(id);
	}
	
	@PutMapping
	public void updateFamily(@RequestBody Family family) {
		repo.save(family);
	}
	
	@DeleteMapping(value = "/{id}")
	public void deleteFamily(@PathVariable("id") Integer id) {
		repo.deleteById(id);
	}
	
	
}








