package com.studentmanagement.springrest.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;


import com.studentmanagement.springrest.api.model.StudentDetails;
import com.studentmanagement.springrest.service.StudentService;

@RestController
@RequestMapping(path = "/studentdetails/api/v1")
public class StudentController {

	@Autowired
	StudentService studentService;
	   
	
	
	@PostMapping(value = "/student", consumes = "application/json", produces = "application/json")
	ResponseEntity<Object> addStudent(@RequestBody StudentDetails student) throws Exception {
		try {
			
			StudentDetails studentRes = studentService.createStudentDetails(student);
			return new ResponseEntity<>(studentRes,HttpStatus.OK);
		}catch(ResponseStatusException ex) {
			return ResponseHandler.generateResponse(ex.getMessage(), ex.getStatusCode(), null);
		}
		
	}
	
	@PutMapping(value = "/student/{student_id}", consumes = "application/json", produces = "application/json")
	ResponseEntity<Object> updateStudent(@PathVariable("student_id") int student_id, @RequestBody StudentDetails student) throws Exception {
		try {
			
			StudentDetails studentRes = studentService.updateStudentDetails(student_id,student);
			return new ResponseEntity<>(studentRes,HttpStatus.OK);
		}catch(ResponseStatusException ex) {
			return ResponseHandler.generateResponse(ex.getMessage(), ex.getStatusCode(), null);
		}
		
	}
	
	@GetMapping(value = "/student")
	ResponseEntity<Object> getStudent() throws Exception {
		try {
			
			List<StudentDetails> studentResList = studentService.getAllStudentDetails();
			return new ResponseEntity<>(studentResList,HttpStatus.OK);
		}catch(ResponseStatusException ex) {
			return ResponseHandler.generateResponse(ex.getMessage(), ex.getStatusCode(), null);
		}
		
	}
	
	@GetMapping(value = "/student/{student_id}")
	ResponseEntity<Object> getStudent(@PathVariable("student_id") int student_id) throws Exception {
		try {
			
			StudentDetails studentRes = studentService.getStudentDetailsById(student_id);
			return new ResponseEntity<>(studentRes,HttpStatus.OK);
		}catch(ResponseStatusException ex) {
			return ResponseHandler.generateResponse(ex.getMessage(), ex.getStatusCode(), null);
		}
		
	}
	  
	
}
