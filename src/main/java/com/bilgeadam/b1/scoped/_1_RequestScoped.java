package com.bilgeadam.b1.scoped;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

// sadece 1 istek boyunca çalışır ve sonra ölür
// alışveriş sitesi: sepet ürünlerini
// performans düşüklüğüe sebeb oalbilir.
@Named
@RequestScoped
public class _1_RequestScoped {
	
	public String getScoped() {
		return "request:" + hashCode();
	}
}

// Software Prensible kiss ,s.o.l.i.d
// Design pattern
// VirtualBox :oracle
// Linux Ubuntu 20.0.4 download + JDK+Maven+
// Windows Docker
// DevOps felsefesi