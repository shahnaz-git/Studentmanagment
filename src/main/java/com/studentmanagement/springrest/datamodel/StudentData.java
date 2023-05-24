package com.studentmanagement.springrest.datamodel;
import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "student_details")
public class StudentData implements Serializable  {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_id")
	private int studentId;
	
	@Column(name = "student_name")
	private String studentName;
	
	@Column(name = "student_email")
	private String studentEmail;
	
	@Column(name = "student_phone")
	private int studentPhone;
	
	@Column(name = "student_add")
	private String studentAdd;
	
	@Column(name = "status")
	private int status;


	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public int getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(int studentPhone) {
		this.studentPhone = studentPhone;
	}

	public String getStudentAdd() {
		return studentAdd;
	}

	public void setStudentAdd(String studentAdd) {
		this.studentAdd = studentAdd;
	}



	
	
	
}
