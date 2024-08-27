package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestFetchTheRecord {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("review");
	EntityManager em=emf.createEntityManager();
	Review r1=em.find(Review.class,101);
	System.out.println("-------------Review----------------");
	System.out.println("review id : "+r1.getId());
	System.out.println("Heading : "+r1.getHeading());
	System.out.println("Message : "+r1.getMessage());
	
	System.out.println("----------Product--------------------");
	Product p = r1.getProduct();
	System.out.println("Product ID : "+p.getId());
	System.out.println("Product Name : "+p.getName());
	System.out.println("Product price : "+ p.getCost());
}
}
