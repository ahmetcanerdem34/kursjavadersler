package DAY_18_whileLoop;

import java.util.Scanner;

public class C1_NestedForLoop {

	public static void main(String[] args) {
		
		
		//kullan�c�dan pozitif rakam girmesini isteyin 
		//girilen say�ya kadar �arp�m tablosu olu�turun 
		 /*
		  1 2 3
		  2 4 6
		  3 6 9 
		   
		  */
		
		
		Scanner scan=new Scanner (System.in);
		System.out.print("10 dan k���k pozi tamsay� griniz :");
		int sayi=scan.nextInt();
		
		
		for (int i = 1; i <=sayi; i++) {//9 diyelim
			System.out.println(" ");
			
		for (int j = 1; j <=sayi; j++) {
			
			System.out.println(i+"x"+j+" "+(i*j));
			
		}
	
			
			
		}
		
		
		

		
		
		
	}

}
