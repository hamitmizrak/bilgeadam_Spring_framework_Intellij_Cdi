package com.bilgeadam.c1.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class JavaVersion17 implements IJavaVersion {
	
	@Override
	public String surum(String data) {
		return "Java 17 " + data;
	}
	
}
