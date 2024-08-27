package com.ty.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDeleteRecord {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hari");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	Student s = entityManager.find(Student.class,2);
	if(s!=null) {
		entityTransaction.begin();
		entityManager.remove(s);
		entityTransaction.commit();
	}else {
		System.out.println("Given roll no not present");
	}
}
}
