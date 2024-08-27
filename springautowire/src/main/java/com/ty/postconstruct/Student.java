package com.ty.postconstruct;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Student {
	@PostConstruct
public void verify() {
	System.out.println("Student is getting verified");
}
public void print(String name) {
	System.out.println("Name : "+name);
}
@PreDestroy
public void delete() {
	System.out.println("The Student is removed from stack");
}
}
