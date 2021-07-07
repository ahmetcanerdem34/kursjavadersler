package ODEVLER_6;

import java.util.ArrayList;
import java.util.List;

public class Soru_01 {

	public static void main(String[] args) {
		
		/*
		// Stringi ters çevirmek için bir Java Programı yazın
//1.Yol: StringBuilder () kullanarak
//2.Yol: String Classini kullanarak
//3.Yol: Bir method oluşturun, ardından methodu main method dan çağırın
*/

		
	/*
		StringBuilder str1=new StringBuilder();
		str1.append("Java güzeldir");
		
		str1.reverse();
		System.out.println(str1);
		
		
		String str="Java güzeldir";
		String ters="";
		
		
		for (int i = str.length()-1; i >=0 ; i--) {
			
				ters=ters+str.charAt(i);
			
		
		}
		System.out.println(ters);
		*/
		
		
		
		stringTers();
		
		
	}

	public static void stringTers() {
		
		String str="Java güzeldir";
		String ters="";
		
		
		for (int i = str.length()-1; i >=0 ; i--) {
			
				ters=ters+str.charAt(i);
			
		
		}
		System.out.println(ters);
	
		
		
	}

}
