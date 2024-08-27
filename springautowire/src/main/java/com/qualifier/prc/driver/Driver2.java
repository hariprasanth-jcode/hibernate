package com.qualifier.prc.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.qualifier.prc.config.ConfigDb;
import com.qualifier.prc.config.ConfigDb2;
import com.qualifier.prc.pojo.Car;
import com.qualifier.prc.pojo.Engine;

public class Driver2 {
public static void main(String[] args) {
	ApplicationContext ac=new AnnotationConfigApplicationContext(ConfigDb2.class);
	 Car c = ac.getBean("car",Car.class);
	 c.e.performance();
	
}
}
