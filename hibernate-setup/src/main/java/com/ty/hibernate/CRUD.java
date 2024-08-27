package com.ty.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CRUD {
public static void main(String[] args) {
	Student s=new Student();
	s.setRol(3);
	s.setName("prasanth");
	s.setEmail("prasanth@mail.com");
	s.setHeight(5.5);
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("hari");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	et.begin();
	
	em.persist(s);
	
	et.commit();
	System.out.println("Data Saved");
}
}
