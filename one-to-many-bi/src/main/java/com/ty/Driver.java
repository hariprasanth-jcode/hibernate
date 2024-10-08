package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("bank");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	Bank bank=new Bank();
	bank.setName("HDFC");
	bank.setId(2);
	bank.setIfsc("HDFC0002");
	
	Account account1=new Account();
	account1.setBalance(20000);
	account1.setId(301);
	account1.setNum(432);
	account1.setBank(bank);
	
	Account account2=new Account();
	account2.setBalance(3000);
	account2.setId(401);
	account2.setNum(567);
	account2.setBank(bank);
	
	List<Account> list=new ArrayList();
	list.add(account2);
	list.add(account1);
	
	bank.setAccount(list);
	
	et.begin();
	em.persist(bank);
	em.persist(account1);
	em.persist(account2);
	et.commit();
	
}
}
