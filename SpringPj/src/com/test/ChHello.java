package com.test;

public class ChHello implements Hello{
	public String msg=null;
	
	public void setMsg(String msg) {
		this.msg=msg;
	}
	public String getMsg() {
		return this.msg;
	}
	@Override
	public String doSalution() {
		return "ฤ๚บร"+this.msg;
	}
}
