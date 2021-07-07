package DAY_16_forLoop;

import java.util.Iterator;
import java.util.Scanner;

public class C1_ForLoop1 {

	public static void main(String[] args) {
		//KULLANICIDAN POZÝTÝF 2 TAM SAYI ALIN 
		//aldýðýmýz deðerlerden kucuk olandan baþlayýp buyuk olana kada 
		//tüm sayýlarý yan yana , ile ayýrarak yazdýýrnýz
		
		Scanner scan=new Scanner (System.in);
		System.out.print("tamsayý griniz :");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		//2 sayýmýz var ama hangisi kucuk hangisi buyuk bilmiyoruz if ile karar verelim
		
		int kucukSayi=0;
		int buyukSayi=0;
		
		if(sayi1<0 || sayi2<0) {
			System.out.print("lütfen pozitif tamsayý giriniz :");
		}
		
		else if (sayi1>sayi2) {//sayi1 sayi2 den buyukse
			buyukSayi=sayi1;
			kucukSayi=sayi2;
			
		} else {
			buyukSayi=sayi2;
			kucukSayi=sayi1;

		}
		

		 for (int i=kucukSayi; i<=buyukSayi ;i++) {
			 
			 System.out.print(i+",");
			 
//			 tamsayý griniz :2
//			 45
//			 2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,
//			 21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,			 
			 
		 }
		
		
	
	}
}

