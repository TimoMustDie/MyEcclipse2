package com.chap5.bigdemo;

public class Logic2 {
	public void doInsert(String name) {
		System.out.println("执行具体负责新增业务逻辑的类...");
		for(int i=0;i<10000000;i++) {}
	}
	public void doUpdate(String name) {
		System.out.println("执行具体负责修改的业务逻辑");
		for(int i=0;i<20000000;i++) {}
	}
	public void doDelete(String name) {
		System.out.println("执行具体负责删除的业务逻辑...");
		for(int i=0;i<30000000;i++) { i=i/0;}
	}
}
