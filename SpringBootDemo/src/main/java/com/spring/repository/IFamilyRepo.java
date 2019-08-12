package com.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.model.Family;

public interface IFamilyRepo extends JpaRepository<Family, Integer>{

	List<Family> findByIdStudent(int idStudent);
}
