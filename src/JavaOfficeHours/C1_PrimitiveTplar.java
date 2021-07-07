package JavaOfficeHours;

import java.util.Scanner;

public class C1_PrimitiveTplar {

	public static void main(String[] args) {
	
		/*Soru 4:
		 * Kullanicidan 8 primitive veri tipinde de deger alalim ve ekrana yazdiralim.				
	     * 1. Adim : Scanner class'i ile kullanicidan veri alalim				
	     * 2. Adim : Aldigimiz her bir veriyi degiskenlere atayalim				
	     * 3. Adim : Ekrana yazdiralim.				
	       	INPUT      : 41			
	        OUTPUT  : Kullanicidan Aldigimiz sayi = 41		
		*/		

		Scanner scan=new Scanner(System.in);
		System.out.print("byte veri tipinde veri giriniz :");
		byte data1=scan.nextByte();
		
		
		System.out.println("girilen byte deðeri : "+ data1);
		
		System.out.print("short deðer giriniz :");
		
		short data2=scan.nextShort();
		
		System.out.println(data2);
		
		
		System.out.print("ýnt deðer giriniz :");
		int data3=scan.nextInt();
		
		System.out.println(data3);
		
//		byte veri tipinde veri giriniz :45
//		girilen byte deðeri : 45
//		short deðer giriniz :43
//		43
//		ýnt deðer giriniz :56
//		56
//
//		
		
	scan.close();	
		
				
				

	}

}
