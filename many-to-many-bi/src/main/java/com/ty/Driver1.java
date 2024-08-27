package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver1 {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("student");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	Student s1=new Student();
	s1.setId(2);
	s1.setName("Prasanth");
	s1.setEmail("Prasanth@mail.com");
	
	Subject subject1= em.find(Subject.class,101);
	Subject subject2 = em.find(Subject.class,201);
	
	List<Subject> subject=new ArrayList();
	subject.add(subject2);
	subject.add(subject1);
	 
	s1.setSubject(subject);
    List<Student> student = new ArrayList();
	student.add(s1);
	
    subject1.setStudent(student);
    subject2.setStudent(student);
	
	et.begin();
	em.persist(s1);
	em.persist(subject2);
	em.persist(subject1);
	et.commit();
	
	
}
}
