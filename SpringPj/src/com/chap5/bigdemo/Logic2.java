package com.chap5.bigdemo;

public class Logic2 {
	public void doInsert(String name) {
		System.out.println("ִ�о��帺������ҵ���߼�����...");
		for(int i=0;i<10000000;i++) {}
	}
	public void doUpdate(String name) {
		System.out.println("ִ�о��帺���޸ĵ�ҵ���߼�");
		for(int i=0;i<20000000;i++) {}
	}
	public void doDelete(String name) {
		System.out.println("ִ�о��帺��ɾ����ҵ���߼�...");
		for(int i=0;i<30000000;i++) { i=i/0;}
	}
}
