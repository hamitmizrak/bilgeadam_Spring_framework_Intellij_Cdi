package com.bilgeadam.c1.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class JavaVersion18 implements IJavaVersion {
	
	@Override
	public String surum(String data) {
		return "Java 18 " + data;
	}
	
}
