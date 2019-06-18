 package com.sprng.demo1.Hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sprng.demo1.Entity.Student;



public class HibernateUtil {
	  private static SessionFactory sf;

	  static{
		    if (sf == null) {
		      try {
		        // Create StandardServiceRegistry
		       sf = new Configuration().configure()
		    		   .addAnnotatedClass(Student.class).buildSessionFactory();
		      } catch (Exception e) {
		        e.printStackTrace();
		       
		      }
		    }}
public static SessionFactory getSessionFactory() {
	return sf;
	
}


}
