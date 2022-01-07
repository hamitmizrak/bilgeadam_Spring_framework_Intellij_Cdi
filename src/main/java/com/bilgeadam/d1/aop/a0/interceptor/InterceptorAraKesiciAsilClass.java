package com.bilgeadam.d1.aop.a0.interceptor;

import java.util.Date;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@InterceptorKesici // InterceptorBinding
public class InterceptorAraKesiciAsilClass {
	
	// İki class arasındaki işleri yapacak yerdir.
	@AroundInvoke
	public Object aroundInvoke(InvocationContext context) {
		System.out.println("ilk hali: " + context.getMethod().getName());
		// devam etmesini sağlayacak nesne
		Object devamEdeyimMi = null;
		
		if (Login.isLogin) {
			System.out.println("Login olmanı gerekiyor yada Üye olunuz");
			return null;
		} else {
			try {
				// loglama,security,validation
				devamEdeyimMi = context.proceed();
				System.out.println("zaman: " + new Date(System.currentTimeMillis()) + "son hali: " + devamEdeyimMi);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return devamEdeyimMi;
	}
}
