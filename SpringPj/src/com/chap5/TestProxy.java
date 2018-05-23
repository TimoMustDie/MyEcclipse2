package com.chap5;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProxy {
	public static void main(String[] args) {
		ApplicationContext actx=new ClassPathXmlApplicationContext("com/chap5/chap5.xml");
		TimeBookInterface timeBookProxy=(TimeBookInterface)actx.getBean("timeBook");
		timeBookProxy.doAuditing("张三");
		//FinanceInterFace face=(FinanceInterFace)actx.getBean("logProxy1");
		//face.doCheck("李四");
	}
}
