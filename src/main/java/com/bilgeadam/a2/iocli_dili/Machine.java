package com.bilgeadam.a2.iocli_dili;

// bean:
public class Machine {
	
	private int id;
	private String makineadi;
	
	public Machine(int id, String makineadi) {
		this.id = id;
		this.makineadi = makineadi;
	}
	
	public Machine() {
		this.makineadi = "Makine çalışıyor";
	}
	
	@Override
	public String toString() {
		return "Machine [id=" + id + ", makineadi=" + makineadi + "]";
	}
	
	// getter and setter
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getAdi() {
		return makineadi;
	}
	
	public void setAdi(String makineadi) {
		this.makineadi = makineadi;
	}
	
}
