package com.jspider.project;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspider.project.config.EmployeeConfig;
import com.jspider.project.dao.EmployeeDao;
import com.jspider.project.dto.Employee;

public class A {
	public static void main(String[] args) {

		ApplicationContext ac = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		System.out.println(ac);
		EmployeeDao dao = ac.getBean("dao", EmployeeDao.class);
		Employee e = new Employee();
		e.setName("Miller");
		e.setEmail("hari@mail");
		e.setExp(2);
		e.setPassword("djbvjyd");
		e.setPhone(987654332);
		e.setSalary(1000000);
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Enter 1 to add");
			System.out.println("Enter 2 to getmployee");
			System.out.println("Enter 3 to Update");
			System.out.println("Enter 4 to remove");
			int option = sc.nextInt();
			switch (option) {
			case 1: {
				dao.saveEmployee(e);
				break;
			}
			case 2: {
				dao.getAllEmployee();
				break;
			}
			case 3: {
				int id = sc.nextInt();
				dao.update(id, e);
				break;
			}
			case 4: {
				int id = sc.nextInt();
				dao.remove(id);
				break;
			}
			default:
				break;
			}
		}
	}
}
