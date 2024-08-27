package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("student");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	Student s1=new Student();
	s1.setId(1);
	s1.setName("Hari");
	s1.setEmail("Hari@mail.com");
	
	Subject sub1=new Subject();
	sub1.setId(101);
	sub1.setName("Java");
	sub1.setDays(90);
	
	Subject sub2=new Subject();
	sub2.setId(201);
	sub2.setName("SQL");
	sub2.setDays(40);
	
	Subject sub3=new Subject();
	sub3.setId(301);
	sub3.setName("HTML");
	sub3.setDays(70);
	
	List<Subject> sub=new ArrayList();
	sub.add(sub1);
	sub.add(sub2);
	sub.add(sub3);
	
	s1.setSubject(sub);
	
	List<Student> stu = new ArrayList();
	stu.add(s1);
	
	sub1.setStudent(stu);
	sub2.setStudent(stu);
	sub3.setStudent(stu);
	
	
	et.begin();
	em.persist(s1);
	em.persist(sub1);
	em.persist(sub2);
	em.persist(sub3);
	et.commit();
	
}
}
