package com.spring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	private int idStudent;
	@Column(name = "firstName")
	private String firstName;
	@Column(name = "lastName")
	private String lastName;
//	@Column(name = "gender")
//	private String gender;
//	@Column(name = "birthdayDate")
//	private String birthdayDate;
//	@Column(name = "docType")
//	private String docType;
//	@Column(name = "docNumber")
//	private String docNumber;
	public int getIdStudent() {
		return idStudent;
	}
	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
//	public String getGender() {
//		return gender;
//	}
//	public void setGender(String gender) {
//		this.gender = gender;
//	}
//	public String getBirthdayDate() {
//		return birthdayDate;
//	}
//	public void setBirthdayDate(String birthdayDate) {
//		this.birthdayDate = birthdayDate;
//	}
//	public String getDocType() {
//		return docType;
//	}
//	public void setDocType(String docType) {
//		this.docType = docType;
//	}
//	public String getDocNumber() {
//		return docNumber;
//	}
//	public void setDocNumber(String docNumber) {
//		this.docNumber = docNumber;
//	}
//	
	
	
}
