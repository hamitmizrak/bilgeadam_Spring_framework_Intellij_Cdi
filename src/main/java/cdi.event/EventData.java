package cdi.event;

import java.io.Serializable;

public class EventData implements Serializable {
	private static final long serialVersionUID = -1013477508730457965L;
	
	private String name;
	
	// parametresiz constructor
	public EventData() {
		// TODO Auto-generated constructor stub
	}
	
	// parametreli constructor
	public EventData(String name) {
		super();
		this.name = name;
	}
	
	// toString
	@Override
	public String toString() {
		return "EventData [name=" + name + "]";
	}
	
	// getter and setter
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
