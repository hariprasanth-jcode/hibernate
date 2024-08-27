package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("bi");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	Car car=new Car();
	car.setName("BMW");
	car.setId(1);
	car.setCost(200000);
	
	Engine engine=new Engine();
	engine.setId(101);
	engine.setCc(1300);
	engine.setType("Petrol");
	
	car.setEngine(engine);
	engine.setCar(car);
	
	et.begin();
	em.persist(car);
	em.persist(engine);
	et.commit();
}
}
