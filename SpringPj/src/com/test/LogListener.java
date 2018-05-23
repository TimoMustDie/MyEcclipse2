package com.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class LogListener implements ApplicationListener{
	@Override
	public void onApplicationEvent(ApplicationEvent arg0) {
		if(arg0 instanceof LogEvent) {
			SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			format.setLenient(false);
			String current=format.format(new Date());
			System.out.println("输出时间:"+current+" 输出内容 "+arg0.toString());
		}
		
	}
}
