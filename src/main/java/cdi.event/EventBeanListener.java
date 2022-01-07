package cdi.event;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.inject.Named;

// dedikoducu
@Named
@ApplicationScoped
public class EventBeanListener implements Serializable {
	private static final long serialVersionUID = -3971212846428366423L;
	
	@Inject
	private Event<EventData> event;
	
	public void eventListenerMethod() {
		EventData data = new EventData("Seni dinliyorum: ");
		event.fire(data);
		// event.fire(new EventData("Seni dinliyorum: "));
	}
}
