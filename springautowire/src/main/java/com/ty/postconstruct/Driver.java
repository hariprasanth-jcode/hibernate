package com.ty.postconstruct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
public static void main(String[] args) {
	ApplicationContext ac = new AnnotationConfigApplicationContext(ConfigClass.class);
	Student s1=ac.getBean("student",Student.class);
	//s1.print("Hari");
	Student s2=ac.getBean("student",Student.class);
	//s2.print("Hari");
	System.out.println(s1==s2);
	((AnnotationConfigApplicationContext)ac).close();;
}
}
