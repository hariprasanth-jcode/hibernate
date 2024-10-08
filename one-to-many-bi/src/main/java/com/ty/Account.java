package com.ty;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


	@Entity
	public class Account {
		@Id
		private int id;
		private long num;
		private double balance;

		@ManyToOne
		@JoinColumn(name="bank_id")
		private Bank bank;
		public Bank getBank() {
			return bank;
		}

		public void setBank(Bank bank) {
			this.bank = bank;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public long getNum() {
			return num;
		}

		public void setNum(long num) {
			this.num = num;
		}

		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}

		@Override
		public String toString() {
			return "Account [id=" + id + ", num=" + num + ", balance=" + balance + "]";
		}
	}


