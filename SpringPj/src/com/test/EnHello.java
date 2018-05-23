package com.test;

public class EnHello implements Hello{
 public String msg=null;
 public void setMsg(String msg) {
	 this.msg=msg;
 }
 public String getMsg() {
	 return this.msg;
 }
 @Override
	public String doSalution() {
		// TODO Auto-generated method stub
		return "hello"+this.msg;
	}
}
