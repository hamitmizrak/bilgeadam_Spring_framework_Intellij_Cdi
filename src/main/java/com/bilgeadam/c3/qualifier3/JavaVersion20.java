package com.bilgeadam.c3.qualifier3;

@UcluSecenek(ESecenekler.JAVA20)
public class JavaVersion20 implements IJavaVersion {
	
	@Override
	public String surum(String data) {
		return "Seçilecek Java 20 " + data;
	}
	
}
