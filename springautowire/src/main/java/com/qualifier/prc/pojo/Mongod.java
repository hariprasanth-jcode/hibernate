package com.qualifier.prc.pojo;

import org.springframework.stereotype.Component;

@Component
public class Mongod implements DataBaseUsage {

	private String url;
	private String un;
	private String pwd;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUn() {
		return un;
	}
	public void setUn(String un) {
		this.un = un;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public void DataBaseToBeUsed() {
		// TODO Auto-generated method stub
		System.out.println("Url : "+getUrl());
		System.out.println("Username : "+getUn());
		System.out.println("Password : "+getPwd());
	}

}
