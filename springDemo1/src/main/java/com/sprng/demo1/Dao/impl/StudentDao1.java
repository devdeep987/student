package com.sprng.demo1.Dao.impl;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.sprng.demo1.Dao.StudentDao;
import com.sprng.demo1.Entity.Student;
import com.sprng.demo1.Hibernate.HibernateUtil;


@Repository
public class StudentDao1 implements StudentDao {
	
	
	
	
	@Override
	public int addStudent(Student student) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		Integer id =null;
		try {
				session.beginTransaction();
				id =(Integer)session.save(student);
				System.out.println("Student is created  with Id::"+id);
				session.getTransaction().commit();
			} catch (Exception ex) {
					ex.printStackTrace();
					session.getTransaction().rollback();
			}finally {
				session.close();
			}
		
		return id;
	}

	@Override
	public Student fetchStudentbyID(int id) {
		Student student= null ;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try{ 
			student = session.get(Student.class, id);
		    System.out.println(student.getCourse()+"	"+student.getName());
		} catch (HibernateException ex) {
			ex.printStackTrace();
			session.getTransaction().rollback();
		}finally {
			session.close();
		}
		
		return student;
	}

	@Override
	public void updateStudent(Student s) {
	
		 Session session =HibernateUtil.getSessionFactory().openSession(); 
		 try {session.beginTransaction();
		 session.update(s);
		  }catch(Exception ex) {
				System.out.println(ex);
				session.getTransaction().rollback();
			}finally {
				session.getTransaction().commit();
				session.close();
			}
		 
	}

	@Override
	public void deleteStudentID(int id) {
		Session session =HibernateUtil.getSessionFactory().openSession();
	try {
		session.beginTransaction();
		Student student=(Student) session.load(Student.class, id);
          if (student != null) {
			session.delete(student);
          }
          }catch(Exception ex) {
				System.out.println(ex);
				session.getTransaction().rollback();
			}finally {
				session.getTransaction().commit();
				session.close();
			}
			
	}
	@Override
	public java.util.List<Student> fetchAll() {
		// TODO Auto-generated method stub
		Session session= HibernateUtil.getSessionFactory().openSession();
		List<Student> student = null;
		try { session.beginTransaction();
		student =session.createQuery("from Student").list();
		for (Student tempStudent:student)
		{System.out.println(tempStudent);
		}}catch(Exception ex) {
			System.out.println(ex);
			session.getTransaction().rollback();
		}
		finally {
		session.close();
		}
		return student;
	}


}
