package com.bilgeadam.c3.qualifier3;

import javax.enterprise.inject.Default;

@Default
public class JavaVersion17 implements IJavaVersion {
	
	@Override
	public String surum(String data) {
		return "Defaulttaki veri Java 17 " + data;
	}
	
}
