package DAY_10_SwitchCase;

import java.util.Scanner;

public class C6_SwitchCase {

	public static void main(String[] args) {
		
		//kullan�c�dan VIP(very important person) k�saltmas�nda hangi aharfin anlam�n� istedi�ini soral�m
		//girilen harfin a��klamas�n� yazd�ral�m
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("V�P k�saltmas�ndan hangi harfin akelime kar��l���n� istiyorsunuz:");
		char harf = scan.nextLine().toUpperCase().charAt(0);
		
		
			
		
		
		switch(harf) {
		
		case 'V': System.out.println("Very ");break;
		case '�': System.out.println("important");break;
		case 'P': System.out.println("person");break;
		default: System.out.println("ge�erli harf giriniz :");
		
//		V�P k�saltmas�ndan hangi harfin akelime kar��l���n� istiyorsunuz:v
//		Very 
		
		}
		
		
//farkl� �ekilde yani string le ��zelim
		
		System.out.print("V�P k�saltmas�ndan hangi harfin akelime kar��l���n� istiyorsunuz:");
		String str = scan.nextLine().toUpperCase();//ilk kelimeyi veiri = vali girsekte v yi verecek, inek girse i yi alacak
		
	
		switch(str) {
		
		case "V": System.out.println("Very..");break;
		case "�": System.out.println("important..");break;
		case "P": System.out.println("person..");break;
		default: System.out.println("ge�erli harf giriniz :");
		
//		V�P k�saltmas�ndan hangi harfin akelime kar��l���n� istiyorsunuz:V
//		Very..
		
		}
	

	}

}
