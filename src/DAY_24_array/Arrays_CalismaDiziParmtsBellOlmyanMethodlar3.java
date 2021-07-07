package DAY_24_array;

import java.util.Iterator;

public class Arrays_CalismaDiziParmtsBellOlmyanMethodlar3 {

	public static void main(String[] args) {
		
		
		//elemanlariGoster(5,15,25,35,1,3);	
		
		//hesap makinesinde kullanýlýr
		//y da kullanýcýnýn kaçtane sayý girip girmeyeceðini bilmediðimiz toplama iþlemlerinde kullanýlýr
		
		elemanlariGosterString("ahmet", "mehmet", "burak", "hasan");
//		ahmet
//		mehmet
//		burak
//		hasan

	}
	
	public static void elemanlariGoster(int... a) {//int 3 nokta koyunca kaçtane eleman göndereceðimizi bilmiyoruz
		
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
