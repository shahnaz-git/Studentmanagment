package com.studentmanagement.springrest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.studentmanagement.springrest.api.model.StudentDetails;
import com.studentmanagement.springrest.datamodel.StudentData;
import com.studentmanagement.springrest.repository.StudentRepository;

@Service
public class StudentService {

	StudentData studentData;
	
	Optional<StudentData> studentDataOp;
	
	@Autowired
	StudentRepository studentRepository;
	
	public StudentDetails createStudentDetails(StudentDetails student) throws Exception{
		
		StudentData studentData = new StudentData();
		
		try {
			studentData.setStudentId(student.getStudentId());
			studentData.setStudentName(student.getStudentName());
			studentData.setStudentAdd(student.getStudentAdd());
			studentData.setStudentEmail(student.getStudentEmail());
			studentData.setStudentPhone(student.getStudentPhone());
			studentData.setStatus(1);
			studentData = studentRepository.save(studentData);
			student.setStudentId(studentData.getStudentId());
			return student;
		}catch(ResponseStatusException ex) {
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"INTERNAL_SERVER_ERROR");
		}
		
	}
	
public StudentDetails updateStudentDetails(int student_id, StudentDetails student) throws Exception{
		
		
	studentDataOp = studentRepository.findBystudentIdAndStatus(student_id, 1);
		
		if(studentDataOp.isPresent()) {
			
			try {
				StudentData studentData = studentDataOp.get();
				
				studentData.setStudentId(student.getStudentId());
				studentData.setStudentName(student.getStudentName());
				studentData.setStudentAdd(student.getStudentAdd());
				studentData.setStudentEmail(student.getStudentEmail());
				studentData.setStudentPhone(student.getStudentPhone());
				studentData.setStatus(1);
				studentData = studentRepository.save(studentData);
				student.setStudentId(studentData.getStudentId());
				return student;
			}catch(ResponseStatusException ex) {
				throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"INTERNAL_SERVER_ERROR");
			}
			
		}else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Data not found!");
		}
		
		
	}

public StudentDetails getStudentDetailsById(int student_id) throws Exception{
	
	
	studentDataOp = studentRepository.findBystudentIdAndStatus(student_id, 1);
	
	if(studentDataOp.isPresent()) {
		
		try {
			StudentData studentData = studentDataOp.get();
			StudentDetails student = new StudentDetails();
			
			student.setStudentId(studentData.getStudentId());
			student.setStudentName(studentData.getStudentName());
			student.setStudentAdd(studentData.getStudentAdd());
			student.setStudentEmail(studentData.getStudentEmail());
			student.setStudentPhone(studentData.getStudentPhone());
            student.setStatus(studentData.getStatus());
			student.setStudentId(studentData.getStudentId());
			return student;
		}catch(ResponseStatusException ex) {
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"INTERNAL_SERVER_ERROR");
		}
		
	}else {
		throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Data not found!");
	}
	
}

public List<StudentDetails> getAllStudentDetails() throws Exception {
	
	List<StudentDetails> studentList = new ArrayList<StudentDetails>();
	List<StudentData> studentDataList = studentRepository.findByStatus(1);
	
	if(studentDataList.size() > 0) {
		
		try {
			
			for(StudentData studentData: studentDataList) {
				
				StudentDetails student = new StudentDetails();
				
				student.setStudentId(studentData.getStudentId());
				student.setStudentName(studentData.getStudentName());
				student.setStudentAdd(studentData.getStudentAdd());
				student.setStudentEmail(studentData.getStudentEmail());
				student.setStudentPhone(studentData.getStudentPhone());
    			student.setStatus(studentData.getStatus());
				student.setStudentId(studentData.getStudentId());
				studentList.add(student);
			}
			
			return studentList;
		}catch(ResponseStatusException ex) {
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"INTERNAL_SERVER_ERROR");
		}
		
	}else {
		throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Data not found!");
	}
	
}


 


	
}
