package DAY_16_forLoop;

import java.util.Scanner;

public class C2_ForLoop2 {

	public static void main(String[] args) {
		
		
		//kullan�c�dan 2 tmasay� al�n
		//ilk say�dan ikinci say�ya kdar tum tam say�lar� yan yana aralar�nda boluk olarak yazd�r�n 
		
		Scanner scan=new Scanner (System.in);
		System.out.print("tamsay� griniz :");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		
		if (sayi1>sayi2) {
			
			for (int i = sayi1; i >=sayi2; i--) {//buyuk olan say�dan kucu�e gidiyorsa i-- olur
				
				System.out.print(i +" ");
			}
			
		    } 	
			else {//sayi1<=sayi2
			
				for (int i = sayi1; i <= sayi2; i++) {
				
				System.out.print(i +" ");
				
//				tamsay� griniz :5
//				-8
//				5 4 3 2 1 0 -1 -2 -3 -4 -5 -6 -7 -8 			

		}
		
			}
		}

	}
	
