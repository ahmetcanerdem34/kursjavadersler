package DAY_24_array;

import java.util.Iterator;

public class Arrays_CalismaDiziParmtsBellOlmyanMethodlar3 {

	public static void main(String[] args) {
		
		
		//elemanlariGoster(5,15,25,35,1,3);	
		
		//hesap makinesinde kullanılır
		//y da kullanıcının kaçtane sayı girip girmeyeceğini bilmediğimiz toplama işlemlerinde kullanılır
		
		elemanlariGosterString("ahmet", "mehmet", "burak", "hasan");
//		ahmet
//		mehmet
//		burak
//		hasan

	}
	
	public static void elemanlariGoster(int... a) {//int 3 nokta koyunca kaçtane eleman göndereceğimizi bilmiyoruz
		
		for(int i : a) {
			System.out.println(i);
		}
		for (int i = 0; i < a.length; i++) {
			
			System.out.println(a[i]);
//			5
//			15
//			25
//			35
//			1
//			3
			
		}
	}

	public static void elemanlariGosterString(String... dizi) {
		
		for(String d : dizi) {
			
			System.out.println(d);
			
		}
		
	}
	
}
