package com.chap5;
public class TimeBook implements TimeBookInterface{
	@Override
	public void doAuditing(String name) {
		// TODO Auto-generated method stub
		System.out.println("我正在执行任务1");
	}
	@Override
	public void doCheck(String name) {
		// TODO Auto-generated method stub
		System.out.println("我正在执行任务2 ：检测");
	}
}
