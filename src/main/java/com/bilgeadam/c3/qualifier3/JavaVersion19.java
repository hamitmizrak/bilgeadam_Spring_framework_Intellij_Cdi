package com.bilgeadam.c3.qualifier3;

@UcluSecenek(ESecenekler.JAVA19)
public class JavaVersion19 implements IJavaVersion {
	
	@Override
	public String surum(String data) {
		return "Seçilecek Java 19 " + data;
	}
	
}
