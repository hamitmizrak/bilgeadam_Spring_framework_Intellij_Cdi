package com.bilgeadam.e1.aop.a2.event2;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.inject.Named;

// 1-error
// 2-warn
// 3-info
@Named("eventListenerChooiseBen")
@ApplicationScoped
public class EventBean implements Serializable {
	
	private static final long serialVersionUID = 1611718370173197807L;
	
	@Inject
	private Event<EventStatusData> herseyiDinliyor;
	
	@Inject
	private @EventBilgeadamQualifer(durum = 1) Event<EventStatusData> sadeceError;
	
	@Inject
	private @EventBilgeadamQualifer(durum = 2) Event<EventStatusData> sadeceWarn;
	
	@Inject
	private @EventBilgeadamQualifer(durum = 3) Event<EventStatusData> sadeceInfo;
	
	public void secimliMethod() {
		herseyiDinliyor.fire(new EventStatusData("bütün loglar: "));
		sadeceError.fire(new EventStatusData("1- Error : "));
		sadeceWarn.fire(new EventStatusData("2- Warn : "));
		sadeceInfo.fire(new EventStatusData("3- Info : "));
	}
	
}
