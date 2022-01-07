package com.bilgeadam.d1.aop.a2.decorator;

public class Mudur implements IOkul {
	
	@Override
	public String asilIs(String data) {
		return "mudur: asil iş: " + data;
	}
	
	@Override
	public String yedekIs(String data) {
		return "mudur: yedek iş: " + data;
	}
	
}
