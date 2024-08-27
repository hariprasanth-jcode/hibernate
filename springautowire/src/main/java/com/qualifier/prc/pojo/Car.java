package com.qualifier.prc.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Autowired
	public Engine e;

	public void drive() {
		System.out.println("Drive");
	}
}
