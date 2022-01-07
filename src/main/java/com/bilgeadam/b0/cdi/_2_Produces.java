package com.bilgeadam.b0.cdi;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;

// cdi
@Named(value = "producesCdi")
@ApplicationScoped
public class _2_Produces implements Serializable {
	private static final long serialVersionUID = 3516393981392398653L;
	
	// üreten kısım
	@Produces
	public List<String> list() {
		List<String> listem = new ArrayList<String>();
		listem.add("Gülten Yonkuc");
		listem.add("Canan Havva");
		listem.add("Görkem Sönmez");
		listem.add("Mustafa Öztürk");
		return listem;
	}
	
	@Produces
	public String adimSoyadi() {
		return "Hamit Mızrak";
	}
	
}
