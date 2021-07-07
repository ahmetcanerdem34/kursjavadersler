package DAY_18_whileLoop;

import java.util.Scanner;

public class C1_NestedForLoop {

	public static void main(String[] args) {
		
		
		//kullanýcýdan pozitif rakam girmesini isteyin 
		//girilen sayýya kadar çarpým tablosu oluþturun 
		 /*
		  1 2 3
		  2 4 6
		  3 6 9 
		   
		  */
		
		
		Scanner scan=new Scanner (System.in);
		System.out.print("10 dan küçük pozi tamsayý griniz :");
		int sayi=scan.nextInt();
		
		
		for (int i = 1; i <=sayi; i++) {//9 diyelim
			System.out.println(" ");
			
		for (int j = 1; j <=sayi; j++) {
			
			System.out.println(i+"x"+j+" "+(i*j));
			
		}
	
			
			
		}
		
		
		

		
		
		
	}

}
