package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("review");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	Product p1=new Product();
	p1.setName("MP phone 1001");
	p1.setCost(20000);
	p1.setId(1);
	
	Review r1=new Review();
	r1.setId(101);
	r1.setHeading("Good One");
	r1.setMessage("Hi it is good to Use");
	r1.setProduct(p1);
	
	Review r2=new Review();
	r2.setId(201);
	r2.setHeading("Ok Ok Product");
	r2.setMessage("Not Worth for the Money");
	r2.setProduct(p1);
	
	
	
	et.begin();
	em.persist(p1);
	em.persist(r1);
	em.persist(r2);
	
	et.commit();
}
}
