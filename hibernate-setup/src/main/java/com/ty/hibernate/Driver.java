package com.ty.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("hari");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	Teacher t=new Teacher();
	t.setName("Sheela");
	//t.setId(1);
	t.setPhone(345678);
	t.setEmail("sheela@mail.com");
	et.begin();
	em.persist(t);
	et.commit();
}
}
