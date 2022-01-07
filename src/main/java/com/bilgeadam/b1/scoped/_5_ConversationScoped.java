package com.bilgeadam.b1.scoped;

import java.io.Serializable;

import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.inject.Inject;
import javax.inject.Named;

// conversationScoped: yazılımcı tarafında bean'in life cycle belirlemesidir.
@Named(value = "conversationCdi")
@ConversationScoped
public class _5_ConversationScoped implements Serializable {
	
	private static final long serialVersionUID = -5977647627250938322L;
	
	@Inject
	Conversation conversation;
	
	private int sayac;
	
	// conversation ID
	public String getConversationId() {
		return conversation.getId();
	}
	
	// baslangic
	public void basla() {
		sayac = 20;
		conversation.begin();
	}
	
	// devam eden
	public void devamEden() {
		sayac++;
	}
	
	// bitis
	public void bitis() {
		conversation.end();
		sayac = 20;
	}
	
	// Sonuc
	public String conversationSonuc() {
		return conversation.getId() + " sayac: " + sayac + " hashcode: " + hashCode();
	}
	
	// getter and setter
	public int getSayac() {
		return sayac;
	}
	
	public void setSayac(int sayac) {
		this.sayac = sayac;
	}
	
}
