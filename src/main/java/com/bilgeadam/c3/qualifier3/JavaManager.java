package com.bilgeadam.c3.qualifier3;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("qualifier3Cdi")
@ApplicationScoped
public class JavaManager implements Serializable {
	private static final long serialVersionUID = -2989133975898938378L;
	
	@Inject
	@UcluSecenek(ESecenekler.JAVA20) // eğer defaultta gelmesi istiyorsak sol tarafı yorumlama tag al
	private IJavaVersion iJavaVersion;
	
	public String yeniSurum(String data) {
		return iJavaVersion.surum(data);
	}
}
