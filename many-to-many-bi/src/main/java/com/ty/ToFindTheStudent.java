package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ToFindTheStudent {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("student");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	Subject subject=em.find(Subject.class,101);
	
	List<Student> student = subject.getStudent();
	
	for(Student s:student) {
		System.out.println(s.getName());
	}
}
}
