package com.test;

import java.util.Date;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class TestHelloWorld {
	public static void main(String[] args) {
		
		ApplicationContext actx=new ClassPathXmlApplicationContext("beans.xml");
		
		Log log=(Log)actx.getBean("log");
		log.Log("gf");
		
		
	
	}
}
