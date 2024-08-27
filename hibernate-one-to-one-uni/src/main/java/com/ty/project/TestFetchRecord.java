package com.ty.project;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestFetchRecord {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("hari");
	EntityManager entityManager =entityManagerFactory.createEntityManager();
	
	Car car=entityManager.find(Car.class,1);
	System.out.println("--------------------------------------------------");
	System.out.println("Car Id is : "+car.getId());
	System.out.println("Car Name is : "+car.getName());
	System.out.println("Car cost is : "+car.getCost());
	
	Engine engine = car.getEngine();
	System.out.println("-------------------------------------------------------");
	System.out.println("Engine ID is : "+engine.getId());
	System.out.println("Engine Type is : "+engine.getType());
	System.out.println("Engine CC is : "+engine.getCc());
}
}
