package com.ty.project;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestFindRecords {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("bank");
 EntityManager entityManager = entityManagerFactory.createEntityManager();
 
 Bank bank=entityManager.find(Bank.class,2);
 System.out.println("-----------------------Bank-----------------------");
 System.out.println("Bank ID "+bank.getId());
 System.out.println("Bank Name "+bank.getName());
 System.out.println("Bank ifsc "+bank.getIfsc());
 List<Account> accounts = bank.getAccount();
 System.out.println("------------------------Accounts----------------------");
 for(Account account:accounts) {
	 System.out.println(account);
 }
}
}
