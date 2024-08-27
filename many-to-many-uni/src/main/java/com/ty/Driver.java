package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("student");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Student s1 = new Student();
		s1.setId(2);
		s1.setName("prasanth");
		s1.setEmail("prasanth@mail");

		Subject sb1 = em.find(Subject.class, 101);
		Subject sb2 = em.find(Subject.class, 201);
		Subject sb3 = new Subject();
		sb3.setId(301);
		sb3.setName("HTML");
		sb3.setDays(40);

		

		List<Subject> list = new ArrayList();
		list.add(sb1);
		list.add(sb2);
		list.add(sb3);
		
		s1.setSubject(list);
		et.begin();
		em.persist(s1);
		em.persist(sb1);
		em.persist(sb2);
		em.persist(sb3);
		et.commit();

	}
}
