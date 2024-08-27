package com.qualifier.prc.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.qualifier.prc.config.ConfigDb;
import com.qualifier.prc.pojo.DataBaseUsage;
import com.qualifier.prc.pojo.DataBaseUtil;
import com.qualifier.prc.pojo.Mongod;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(ConfigDb.class);
		DataBaseUtil db = ac.getBean("d", DataBaseUtil.class);
		db.printDb();

//		Mongod db1 = (Mongod) db.data;
//		db1.setUrl("Mongodb//localhost");
//		db1.setUn("mdb");
//		db1.setPwd("root");
//
//		db1.DataBaseToBeUsed();

	}
}
