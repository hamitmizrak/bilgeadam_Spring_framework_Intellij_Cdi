package com.bilgeadam.c2.qualifier2;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("qualifierCdi")
@ApplicationScoped
public class JavaManager implements Serializable {
	private static final long serialVersionUID = -2989133975898938378L;
	
	@Inject
	@IkiliSecenek // eğer defaultta gelmesi
	IJavaVersion iJavaVersion;
	
	public String yeniSurum(String data) {
		return iJavaVersion.surum(data);
	}
}
