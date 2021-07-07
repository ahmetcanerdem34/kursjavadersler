package DAY_31_varrags;

import java.util.Scanner;

public class C7_VarragsCalisma01 {

	public static void main(String[] args) {
		
		//parametre sayýsý belli olmadýðý zamanlarda ayný tür iseler 3 nokta kullanýyoruz
	
		elemanlariGoster(5,4,3,3,4,5,5,4,34,3,3,4,444);
		
		elemanlariGosterString("ahmet","mehemet", "kazým");
 
	
	}
	public static void elemanlariGosterString(String...a) {
		
		for (String i : a) {
			
			System.out.println(i+" ");
//			ahmet
//			mehemet 
//			kazým 
		
			
		}
		for (int i = 0; i < a.length; i++) {
			
			System.out.println(a[i]+" ");
//			ahmet 
//			mehemet 
//			kazým 
			
		}
	}
	
	public static void elemanlariGoster(int... a) {//a artýk bir dizi þeklinde, dizi þeklindeyse for içinde yazdýrýyorduk
		
		for (int i : a) {
			
			System.out.print(i+" ");
			//5 4 3 3 4 5 5 4 34 3 3 4 444 
			
		}
		System.out.println(" ");
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.print(a[i]+" ");
		//	5 4 3 3 4 5 5 4 34 3 3 4 444  
			
			
		}
		
	}

}
