package main;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServerMain {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationProvider.xml");
		ctx.start();
		System.out.println("�밴������˳�");
		System.in.read();
		ctx.close();
	}
}	
