package com.bilgeadam.c1.alternative;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("alternativeCdi")
@ApplicationScoped
public class JavaManager implements Serializable {
	private static final long serialVersionUID = -2989133975898938378L;
	
	@Inject
	IJavaVersion iJavaVersion;
	
	public String yeniSurum(String data) {
		return iJavaVersion.surum(data);
	}
}
