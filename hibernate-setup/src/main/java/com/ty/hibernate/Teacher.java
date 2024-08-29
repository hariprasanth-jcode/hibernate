package com.ty.hibernate;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="school_teacher")
public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
	@Column(name="teacher_name")
private String name;
private long phone;
@Column(name="teacher_email")
private String email;
@CreationTimestamp
private LocalDateTime createDateTime;
@UpdateTimestamp
private LocalDateTime updateDateTime;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
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
public LocalDateTime getCreateDateTime() {
	return createDateTime;
}
public void setCreateDateTime(LocalDateTime createDateTime) {
	this.createDateTime = createDateTime;
}
public LocalDateTime getUpdateDateTime() {
	return updateDateTime;
}
public void setUpdateDateTime(LocalDateTime updateDateTime) {
	this.updateDateTime = updateDateTime;
}

}
