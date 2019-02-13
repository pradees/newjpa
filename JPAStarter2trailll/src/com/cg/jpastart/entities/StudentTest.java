package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentTest
{

	public static void main(String[] args)
	{
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Student student = new Student();
		int a,b;
		student.setStudent_name("nagesh43");
		student.setAddress("hyderabad");
		student.setCity("hyd");
		student.setCs_marks(67);
		student.setPhysics_marks(97);
		a=student.getCs_marks();
		b=student.getPhysics_marks();
		student.getsum(a,b);
		em.persist(student);
		em.getTransaction().commit();
		
		System.out.println("Added one student to database.");
		em.close();
		factory.close();
	}
}
