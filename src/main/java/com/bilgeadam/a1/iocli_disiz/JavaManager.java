package com.bilgeadam.a1.iocli_disiz;
// Description: IoC biz kendimiz oluşturacağız
// amaç: Spring Framework'un bize sağladığı yararı görmek

public class JavaManager {
	// IoC kendim oluşturdum.
	// interface çağırdım
	private IJavaVersion iJavaVersion;
	
	// parametreli constructor
	public JavaManager(IJavaVersion iJavaVersion) {
		this.iJavaVersion = iJavaVersion;
	}
	
	// metot
	public void javaSurum() {
		iJavaVersion.surum();
	}
	
}
