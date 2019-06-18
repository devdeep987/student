package com.sprng.demo1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sprng.demo1.Dao.StudentDao;
import com.sprng.demo1.Dao.impl.StudentDao1;
import com.sprng.demo1.Entity.Student;

@Service
public class StudentServices1 implements StudentService {
	
	@Autowired
	@Qualifier("studentDao1")
	StudentDao studentDao1;

	@Override
	public int createStudent(Student student) {
		
		return studentDao1.addStudent(student);

	}

	@Override
	public Student getStudentbyID(int id) {
		
		return studentDao1.fetchStudentbyID(id);
	}

	@Override
	public void updateStudent(Student s) {
		studentDao1.updateStudent(s);

	}

	@Override
	public void deleteStudentID(int id) {
		studentDao1.deleteStudentID(id);
	}

	@Override
	public List<Student> fetchAll() {
		return 	studentDao1.fetchAll();	
	}

}
