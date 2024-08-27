package com.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {
public static void main(String[] args) {
	EntityManagerFactory entitEntityManagerFactory=Persistence.createEntityManagerFactory("hari");
	EntityManager entityManager=entitEntityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Bank sbi=new Bank();
	sbi.setName("SBI");
	sbi.setId(1);
	sbi.setIfsc("SBI0001");
	
	Account a1=new Account();
	a1.setId(1);
	a1.setBalance(20000);
	a1.setNumber(1234);
	
	Account a2=new Account();
	a2.setBalance(30000);
	a2.setId(2);
	a2.setNumber(5678);
	
	List<Account> al=new ArrayList();
	al.add(a2);
	al.add(a1);
	
	entityTransaction.begin();
	entityManager.persist(sbi);
	entityTransaction.commit();
	
	
	
}
}
