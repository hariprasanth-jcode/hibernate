package com.ty.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetOneRecord {
	public static void main(String[] args) {
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("hari");
		EntityManager entityManager = entitymanagerfactory.createEntityManager();

		Student s = entityManager.find(Student.class, 10);
		if (s != null) {
			System.out.println(s.getRol());
			System.out.println(s.getName());
			System.out.println(s.getEmail());
			System.out.println(s.getHeight());
		} else {
			System.out.println("No student is present");
		}
	}
}
