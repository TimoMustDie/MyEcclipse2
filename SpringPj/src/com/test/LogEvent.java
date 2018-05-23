package com.test;

import org.springframework.context.ApplicationEvent;

public class LogEvent extends ApplicationEvent{
	public LogEvent(Object msg) {
		super(msg);
	}
}
