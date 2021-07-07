package DAY_16_forLoop;

import java.util.Scanner;

public class C2_ForLoop2 {

	public static void main(String[] args) {
		
		
		//kullanýcýdan 2 tmasayý alýn
		//ilk sayýdan ikinci sayýya kdar tum tam sayýlarý yan yana aralarýnda boluk olarak yazdýrýn 
		
		Scanner scan=new Scanner (System.in);
		System.out.print("tamsayý griniz :");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		
		if (sayi1>sayi2) {
			
			for (int i = sayi1; i >=sayi2; i--) {//buyuk olan sayýdan kucuðe gidiyorsa i-- olur
				
				System.out.print(i +" ");
			}
			
		    } 	
			else {//sayi1<=sayi2
			
				for (int i = sayi1; i <= sayi2; i++) {
				
				System.out.print(i +" ");
				
//				tamsayý griniz :5
//				-8
//				5 4 3 2 1 0 -1 -2 -3 -4 -5 -6 -7 -8 			

		}
		
			}
		}

	}
	
