package DAY_12_�ndexOf;

import java.util.Scanner;

public class C5_Last�ndexOf {

	public static void main(String[] args) {

			//kullan�c�dan bir c�mle al�n
		   // ve a�a��daki 3 durumdan uygun olan� yazd�r�n
		//1cumla java i�ermiyor
		//2 c�mle bir tane java i�eiryor
		//3 c�mlede 1 den fazla java var
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("bir string giriniz :");
		
		String cumle=sc.nextLine().toLowerCase();
		
		int ilkJava=cumle.indexOf("java");
		int sonJava=cumle.lastIndexOf("java");
		
		if(ilkJava==-1) {
			System.out.println("i�ermiyor");
		}
		else if(ilkJava==sonJava)
		{
			System.out.println("c�mle bir java kelimesi i�eriyor");
		}else {
			
			System.out.println("java birden fazla java i�eriyor");
		}
		/*
		 * bir string giriniz :
		 * yat java kalk java
		 * java birden fazla java i�eriyor
		 */
		
		/*
		 * bir string giriniz :
		 * java bitmez geli�ir
		 * c�mle bir java kelimesi i�eriyor
		 */
		
		
		
		

	}

}
