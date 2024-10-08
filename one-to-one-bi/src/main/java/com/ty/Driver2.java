package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Driver2 {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("bi");
	EntityManager em = emf.createEntityManager();
	
	Car car=em.find(Car.class, 1);
	
	System.out.println("---------Car--------------");
	System.out.println("Car Name : "+car.getName());
	System.out.println("Car Id : "+car.getId());
	System.out.println("Car Price : "+car.getCost());
	
	Engine engine=car.getEngine();
	
	System.out.println("----------------Engine-------------------------");
	System.out.println("Engine Id : "+engine.getId());
	System.out.println("Engine CC : "+engine.getCc());
	System.out.println("Engine Type: "+engine.getType());
	
	Engine e=em.find(Engine.class, 201);
	System.out.println("----------------Engine-------------------------");
	System.out.println("Engine Id : "+e.getId());
	System.out.println("Engine CC : "+e.getCc());
	System.out.println("Engine Type: "+e.getType());
	
	Car c=e.getCar();
	System.out.println("---------Car--------------");
	System.out.println("Car Name : "+c.getName());
	System.out.println("Car Id : "+c.getId());
	System.out.println("Car Price : "+c.getCost());
}
}
