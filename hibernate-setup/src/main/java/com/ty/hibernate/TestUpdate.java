package com.ty.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdate {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("hari");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	 Student student=entityManager.find(Student.class,10);
	 if(student!=null) {
	 student.setHeight(5.1);
	 entityTransaction.begin();
	 entityManager.merge(student);
	 entityTransaction.commit();
	 }else {
		 System.out.println("Given Roll no does not exit");
	 }
	 
	 System.out.println("Record Update");
	 
	 
}
}
