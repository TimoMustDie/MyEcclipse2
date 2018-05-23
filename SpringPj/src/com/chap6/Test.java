package com.chap6;

import java.lang.reflect.Method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chap5.FinanceInterFace;
public class Test extends com.chap5.TimeBook implements FinanceInterFace{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/chap6/chap6.xml");
		HelloDAO hello=(HelloDAO)context.getBean("helloDAO");
		hello.create("none");
	}
}
