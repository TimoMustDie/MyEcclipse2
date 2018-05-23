package com.xbz.service;

public class DaoServiceImpl implements DemoService{
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		System.out.println("init:"+name);
		return "hello"+name;
	}
}
