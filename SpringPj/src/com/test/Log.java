package com.test;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Log implements ApplicationContextAware{
	private ApplicationContext context;
	public void setApplicationContext(ApplicationContext context) throws BeansException{
		this.context=context;
	}
	public int Log(String log) {
		LogEvent event=new LogEvent(log);
		this.context.publishEvent(event);
		return 0;
	}
}
