package com.jpsiders.project.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jpsiders.project.dto.Student;

@Component(value="dao")
public class StudentDao {
	@Autowired
	private EntityManager entitymanager;
	
	public void addStudent(Student student) {
		EntityTransaction entitytransaction=entitymanager.getTransaction();
		entitytransaction.begin();
		System.out.println(entitymanager);
		entitymanager.persist(student);
		entitytransaction.commit();
		System.out.println("Student data added");
	}
	public Student getStudent(int id) {
		EntityTransaction entitytransaction=entitymanager.getTransaction();
		entitytransaction.begin();
		Query query = entitymanager.createQuery("select s from Student s");
		List<Student> student=query.getResultList();
		return student.get(id-1);
	}
}
