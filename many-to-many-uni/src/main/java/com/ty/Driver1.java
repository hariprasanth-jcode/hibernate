package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver1 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("student");
		EntityManager em = emf.createEntityManager();
		
		Student s1 = em.find(Student.class, 2);
		
		System.out.println("------------Student-------------------------");
		System.out.println(s1.getName());
		System.out.println(s1.getId());
		System.out.println(s1.getEmail());
		
		System.out.println("-----------------Subject-------------------");
		
		List<Subject> sb = s1.getSubject();
		
		for(Subject subject:sb) {
			System.out.println(subject.getName());
		}

	}
}
