package com.ty.project;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Car {
@Id
private int id;
private String name;
private double cost;

@OneToOne
private Engine engine;

Car(){}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getCost() {
	return cost;
}

public void setCost(double cost) {
	this.cost = cost;
}

public Engine getEngine() {
	return engine;
}

public void setEngine(Engine engine) {
	this.engine = engine;
}

public Car(int id, String name, double cost, Engine engine) {
	super();
	this.id = id;
	this.name = name;
	this.cost = cost;
	this.engine = engine;
}


}
