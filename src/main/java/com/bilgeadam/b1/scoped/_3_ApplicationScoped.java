package com.bilgeadam.b1.scoped;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

// bütün kullanıcıdır kulalnıcı için geçerlidir.
// Aynı browserda yaşar farklı browserda yaşamaz
// sessionscope implements yazılmalıdır.
@Named
@ApplicationScoped
public class _3_ApplicationScoped implements Serializable {
	private static final long serialVersionUID = -3112160708263140526L;
	
	public String getScoped() {
		return "applicationScoped:" + hashCode();
	}
}
