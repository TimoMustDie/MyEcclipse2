package com.chap5.bigdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext actx=new ClassPathXmlApplicationContext("com/chap5/bigdemo/exception.xml");
		Logic2 logic=(Logic2)actx.getBean("logic2Proxy");
		try {
			logic.doInsert("张三");
			logic.doUpdate("李四");
			logic.doDelete("王五");
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
