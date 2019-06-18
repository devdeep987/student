package com.sprng.demo1.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sprng.demo1.Entity.Student;

@Service
public interface StudentService {
	 public abstract int createStudent(Student student);
	 public abstract Student getStudentbyID(int id);
	 public abstract void updateStudent(Student	s);
	 public abstract void deleteStudentID(int id);
	 public List<Student> fetchAll();
	
	 
}
