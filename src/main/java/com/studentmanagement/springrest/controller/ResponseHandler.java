package com.studentmanagement.springrest.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

import com.studentmanagement.springrest.api.model.StudentDetails;


public class ResponseHandler {
	

public static ResponseEntity<Object> generateResponse(String message, HttpStatusCode status, Object responseObj){
		
		Map<String,Object> map = new HashMap<String,Object>();
	
	
		if(responseObj != null && (responseObj instanceof StudentDetails)) {
			map.put("message", message);
			map.put("status", status.value());
			map.put("id", ((StudentDetails) responseObj).getStudentId());
			return new ResponseEntity<Object>(map,status);		
		}
		else {
			map.put("message", message);
			map.put("status", status.value());
			map.put("id", null);
			return new ResponseEntity<Object>(map,status);
		}
	
	
	
	
	
	
	
}
}
