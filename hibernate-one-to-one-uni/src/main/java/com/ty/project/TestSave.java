package com.ty.project;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("hari");
	EntityManager entityManager =entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction =entityManager.getTransaction();
	
	Car car=new Car();
	car.setId(1);
	car.setCost(2000000);
	
	car.setName("Swift");
	
	Engine engine=new Engine();
	engine.setId(101);
	engine.setType("K2");
	engine.setCc(1400);
	 
	car.setEngine(engine);
	entityTransaction.begin();
	entityManager.persist(car);
	entityManager.persist(engine);
	entityTransaction.commit();
}
}
