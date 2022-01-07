package com.bilgeadam.a2.iocli_dili;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "cdi")
@ApplicationScoped
public class IoC_DI implements Serializable {
	private static final long serialVersionUID = -4982612782577838436L;
	
	@Inject
	Machine machine;
	
	// public IoC_DI() {
	// this.machine = new Machine();
	// }
	
	public Machine getMachine() {
		return machine;
	}
	
	public void setMachine(Machine machine) {
		this.machine = machine;
	}
	
}
