package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.model.Student;
import com.spring.repository.IStudentRepo;

@Controller
public class StudentController {

	@Autowired
	private IStudentRepo repo;
	
	@GetMapping("/inicio")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="Student") String name, Model model) {
	 	
	 	Student st= new Student();
	 	st.setIdStudent(100);
	 	st.setFirstName("John");
	 	st.setLastName("Frusciante");
//		 	st.setGender("Masculino");
//		 	st.setBirthdayDate("05/03/1970");
//		 	st.setDocType("DNI");
//		 	st.setDocNumber("12345678");
	 	repo.save(st);
	 
	 	model.addAttribute("name", name);
        return "greeting";
    }
	 
	@GetMapping("/findAll")
    public String greeting(Model model) {
	 	
	 	model.addAttribute("students", repo.findAll());
        return "greeting";
    }
	 
	 
	 
}
