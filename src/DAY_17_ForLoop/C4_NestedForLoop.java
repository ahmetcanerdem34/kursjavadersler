package DAY_17_ForLoop;

import java.util.Scanner;

public class C4_NestedForLoop {

	public static void main(String[] args) {
	/*	
		
		Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin
		  *  //for(int i =1; i<=2;i++) syso("*" )
		  * *  //for(int i =1; i<=2;i++) syso("*" )
		  * * * //for(int i =1; i<=3;i++) syso ("*" )
		  * * * * //for(int i =1; i<=4;i++) syso ("*" )
		  */
		
		Scanner scan=new Scanner (System.in);
		System.out.print("10 dan küçük pozi tamsayý griniz :");
		int sayi=scan.nextInt();
		
		
		for (int i = 1; i <sayi; i++) {//burda girilen sayý 4 ise 4 tane yan yana yýldýz yazýlýr-- for içinde for oluþtur
			System.out.println(" ");
			
			for (int j = 0; j <i; j++) {  // buna inner= iç loop ve outer= dýþloop
				System.out.print("*");
				
			}
			
		}
		
		
		

	}

}
