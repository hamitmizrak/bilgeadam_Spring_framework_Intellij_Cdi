package com.bilgeadam.d1.aop.a2.decorator;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;

// bütün kodlarımı dekor yapacağım yer burası
@Decorator
abstract public class OkulDecorator implements IOkul {
	
	private @Inject @Delegate IOkul iOkul;
	
	@Override
	public String asilIs(String data) {
		System.out.println("Decorator buradaydı");
		String datamGelsin = iOkul.asilIs(data);
		if (data.equals("bilgeadam")) {
			datamGelsin = datamGelsin.replace("bilgeadam", "BILGEADAM").concat(" sonuna ekledim");
		}
		return datamGelsin;
	}
	
}
