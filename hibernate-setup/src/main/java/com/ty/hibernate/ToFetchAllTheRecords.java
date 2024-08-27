package com.ty.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ToFetchAllTheRecords {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hari");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	Query query = entityManager.createQuery("Select s From Student s");
	
	List<Student> students=query.getResultList();
	
	System.out.println("----------------------------------------------------------------------------");
	for(Student student:students) {
		System.out.println("Roll number is "+student.getRol());
		System.out.println("Name is "+student.getName());
		System.out.println("Email is "+student.getEmail());
		System.out.println("Height is "+student.getHeight());
		System.out.println("*********************************************************");
	}
	
}
}
