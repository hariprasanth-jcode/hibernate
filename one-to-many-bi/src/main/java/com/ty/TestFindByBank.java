package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestFindByBank {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("bank");
	EntityManager em=emf.createEntityManager();
	
	
	Bank bank = em.find(Bank.class,1);
	System.out.println("------------Bank-------------------");
	System.out.println("Bank Name : "+bank.getName());
	System.out.println("Bank Id : "+bank.getId());
	System.out.println("Bank Ifsc : "+bank.getIfsc());
	
	System.out.println("------------------Account-------------------");
	 List<Account> account = bank.getAccount();
	 
	 for(Account a:account) {
		 System.out.println("Account Id : "+a.getId());
		 System.out.println("Account Number : "+a.getNum());
		 System.out.println("Account Balance : "+a.getBalance());
		 System.out.println("-----------------------------------------");
	 }
	 
	 
	 Account a=em.find(Account.class,201);
	 System.out.println("-------------Account--------------");
	 System.out.println("Account Id : "+a.getId());
	 System.out.println("Account Number : "+a.getNum());
	 System.out.println("Account Balance : "+a.getBalance());
	 
	 Bank b=a.getBank();
	 
	 System.out.println("Bank Id : "+b.getId());
	 System.out.println("Bank Name : "+b.getName());
	 System.out.println("Bank Ifsc : "+b.getIfsc());
	 
	
}
}
