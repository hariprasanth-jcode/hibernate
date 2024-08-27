package com.jspider.project.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@Override
public String toString() {
	return "Employee [id=" + id + ", salary=" + salary + ", name=" + name + ", exp=" + exp + ", phone=" + phone
			+ ", email=" + email + ", password=" + password + "]";
}
private double salary;
private String name;
private double exp;
private long phone;
private String email;
private String password;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getExp() {
	return exp;
}
public void setExp(double exp) {
	this.exp = exp;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}
