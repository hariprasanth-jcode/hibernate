package com.jspider.project.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jspider.project.dto.Employee;

@Component(value = "dao")
public class EmployeeDao {
	@Autowired
	private EntityManager entitymanager;

	public void saveEmployee(Employee employee) {
		// EntityManager entitymanager=entitymanagerfactory.createEntityManager();
		EntityTransaction entitytransaction = entitymanager.getTransaction();
		entitytransaction.begin();
		entitymanager.persist(employee);
		entitytransaction.commit();
		System.out.println("Employee data saved");
	}

	public Employee getEmployee(int id) {
		// EntityManager entitymanager=entitymanagerfactory.createEntityManager();
	    String q="select e from Employee e where e.id=?1";
	    Query query = entitymanager.createQuery(q);
	    query.setParameter(1, id);
		return (Employee)query.getSingleResult();
	}
	
	public void update(int id,Employee newEmployee) {
		try {
		Employee employee=getEmployee(id);
		EntityTransaction et=entitymanager.getTransaction();
		et.begin();
		newEmployee.setId(id);
		entitymanager.merge(newEmployee);
		et.commit();
		}catch (Exception e) {
			System.out.println("ID not Found");
		}
	}
	
	public void remove(int id) {
		try {
		Employee emp=getEmployee(id);
		EntityTransaction et = entitymanager.getTransaction();
		et.begin();
		entitymanager.remove(emp);
		et.commit();
		}catch (Exception e) {
			System.out.println("ID not Found");
		}
	}
	
	public List<Employee> getAllEmployee(){
		String query="select e from Employee e";
		Query q=entitymanager.createQuery(query);
		List<Employee> list = q.getResultList();
		return list;
	}
}
