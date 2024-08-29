package com.entity.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("entity");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	Student s1=new Student();
	s1.setName("King");
	s1.setEmail("King@mail.com");
	
//	Student s2=new Student();
//	s2.setName("Allen");
//	s2.setEmail("Allen@mail.com");
//	
//	Student s3=new Student();
//	s3.setName("Prasanth");
//	s3.setEmail("Prasanth@mail.coms");
	
	
	et.begin();
	em.persist(s1);
	//em.persist(s2);
	//em.persist(s3);
	et.commit();
	
}
}
