package com.bilgeadam.c3.qualifier3;

@UcluSecenek(ESecenekler.JAVA18)
public class JavaVersion18 implements IJavaVersion {
	
	@Override
	public String surum(String data) {
		return "Seçilecek Java 18 " + data;
	}
	
}
