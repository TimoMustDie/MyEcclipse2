package com.test;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloWorld implements InitializingBean, DisposableBean{
	private List msg=null;
	private Date date;
	public HelloWorld() {
		// TODO Auto-generated constructor stub
	}
	public HelloWorld(Date date) {
		this.date=date;
	}
	public void init() {
		System.out.println("init");
		this.date=new Date();
	}
	
	
	public void setMsg(List msg) {
		this.msg=msg;
	}
	public List getMsg() {
		return this.msg;
	}
	public void setDate(Date date) {
		this.date=date;
	}
	public Date getDate() {
		return date;
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		this.msg.add("test");
		
	}
	@Override
	public void destroy() throws Exception{
		this.msg=null;
		this.date=null;
		System.out.println("ÄúÏú»ÙÁË msg "+this.msg +"ºÍ date" 
				+this.date);
	}
	
}
