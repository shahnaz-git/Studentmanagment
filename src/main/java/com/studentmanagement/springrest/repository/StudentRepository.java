package com.studentmanagement.springrest.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.studentmanagement.springrest.datamodel.StudentData;

public interface StudentRepository extends JpaRepository<StudentData,Integer> {

	Optional<StudentData> findBystudentIdAndStatus(int student_id, int status);
	List<StudentData> findByStatus(int status);
	
}
