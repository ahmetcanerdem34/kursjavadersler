package DAY_12_ÝndexOf;

import java.util.Scanner;

public class C5_LastÝndexOf {

	public static void main(String[] args) {

			//kullanýcýdan bir cümle alýn
		   // ve aþaðýdaki 3 durumdan uygun olaný yazdýrýn
		//1cumla java içermiyor
		//2 cümle bir tane java içeiryor
		//3 cümlede 1 den fazla java var
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("bir string giriniz :");
		
		String cumle=sc.nextLine().toLowerCase();
		
		int ilkJava=cumle.indexOf("java");
		int sonJava=cumle.lastIndexOf("java");
		
		if(ilkJava==-1) {
			System.out.println("içermiyor");
		}
		else if(ilkJava==sonJava)
		{
			System.out.println("cümle bir java kelimesi içeriyor");
		}else {
			
			System.out.println("java birden fazla java içeriyor");
		}
		/*
		 * bir string giriniz :
		 * yat java kalk java
		 * java birden fazla java içeriyor
		 */
		
		/*
		 * bir string giriniz :
		 * java bitmez geliþir
		 * cümle bir java kelimesi içeriyor
		 */
		
		
		
		

	}

}
