package com.example.dao;

public class Student {
	private long id;
	private String name;
	private String sex;
	public Student(){
		
	}
	public Student(long id, String name, String sex) {
		this.id=id;
		this.name=name;
		this.sex=sex;
	}
	public void setId(long id) {
		this.id=id;
	}
	public long getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setSex(String sex) {
		this.sex=sex;
	}
	public String getSex() {
		return sex;
	}
}
