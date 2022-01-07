package com.bilgeadam.e1.aop.a2.event2;

import java.io.BufferedWriter;
import java.io.FileWriter;

import javax.enterprise.event.Observes;

// 1-error
// 2-warn
// 3-info
public class EventChooiseListener {
	
	private static final String filePath = "C:\\spring\\SpringObserver.txt";
	
	public static void fileWriterTryWithResourcesManuel(String str) {
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath, true))) {
			bufferedWriter.write(str);
			bufferedWriter.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void herseyiDinliyor(@Observes EventStatusData eventStatusData) {
		System.out.println("bütün olaylarım: " + eventStatusData);
	}
	
	public void sadeceError(@Observes @EventBilgeadamQualifer(durum = 1) EventStatusData eventStatusData) {
		System.out.println("Error olaylarım: " + eventStatusData);
	}
	
	public void sadeceWarn(@Observes @EventBilgeadamQualifer(durum = 2) EventStatusData eventStatusData) {
		System.out.println("Warn olaylarım: " + eventStatusData);
	}
	
	public void sadeceInfo(@Observes @EventBilgeadamQualifer(durum = 3) EventStatusData eventStatusData) {
		System.out.println("Info olaylarım: " + eventStatusData);
	}
	
}
