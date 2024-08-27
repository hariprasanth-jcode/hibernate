package com.qualifier.prc.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value = "d")
public class DataBaseUtil {
	
	@Autowired
	@Qualifier(value = "mySqlDb")
	public DataBaseUsage data;

	public void printDb() {
		data.DataBaseToBeUsed();
		System.out.println(data);
	}
}
