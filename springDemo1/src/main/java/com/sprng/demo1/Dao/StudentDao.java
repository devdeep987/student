package com.sprng.demo1.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sprng.demo1.Entity.Student;

@Repository
public interface StudentDao {
	public abstract int addStudent(Student student);
	public abstract Student fetchStudentbyID(int id);
	public abstract void updateStudent(Student s);
	public abstract void deleteStudentID(int id);
	public List<Student> fetchAll();

}

