package com.bilgeadam.e1.aop.a1.event;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileWriterReader {
	
	private static final String filePath = "C:\\spring\\SpringObserver.txt";
	
	public static void fileWriterTryWithResourcesManuel(String str) {
		
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath, true))) {
			bufferedWriter.write(str);
			bufferedWriter.flush();
			System.out.println("Yaz�ld�");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String fileReaderTryWithResources() {
		String satir = "", toplamOkunanSatir = "";
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
			while ((satir = bufferedReader.readLine()) != null) {
				toplamOkunanSatir += satir + " \n";
			}
			System.out.println(toplamOkunanSatir);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return toplamOkunanSatir;
	}
}
