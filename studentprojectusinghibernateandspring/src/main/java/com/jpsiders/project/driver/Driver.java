package com.jpsiders.project.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jpsiders.project.config.StudentConfig;
import com.jpsiders.project.dao.StudentDao;
import com.jpsiders.project.dto.Student;

public class Driver {
public static void main(String[] args) {
	ApplicationContext ac = new AnnotationConfigApplicationContext(StudentConfig.class);
	StudentDao dao = ac.getBean("dao",StudentDao.class);
	Student s=new Student();
//	s.setName("hari");
//	dao.addStudent(s);
	System.out.println(dao.getStudent(1));
}
}
