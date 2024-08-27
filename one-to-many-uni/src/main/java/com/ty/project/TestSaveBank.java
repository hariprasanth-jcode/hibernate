package com.ty.project;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveBank {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("bank");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	Bank sbi=new Bank();
	sbi.setId(2);
	sbi.setIfsc("ICIC1234");
	sbi.setName("ICICI");
	
	Account a1=new Account();
	a1.setId(201);
	a1.setNum(1245);
	a1.setBalance(20000);
	
	Account a2=new Account();
	a2.setId(202);
	a2.setNum(1235);
	a2.setBalance(200);
	
	List<Account> accounts=new ArrayList<Account>();
	accounts.add(a2);
	accounts.add(a1);
	sbi.setAccount(accounts);
	et.begin();
	em.persist(sbi);
	em.persist(a1);
	em.persist(a2);
	et.commit();
	
}
}
