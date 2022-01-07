package com.bilgeadam.d1.aop.a2.decorator;

import javax.inject.Inject;

@ButunAnnotations
public class OkulManager {
	
	@Inject
	IOkul iOkul;
	
	public String asilIsim44(String data) {
		return iOkul.asilIs(data);
	}
	
	public String yedekIsim44(String data) {
		return iOkul.yedekIs(data);
	}
	
}
