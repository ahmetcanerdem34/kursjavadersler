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
		System.out.print("10 dan k���k pozi tamsay� griniz :");
		int sayi=scan.nextInt();
		
		
		for (int i = 1; i <sayi; i++) {//burda girilen say� 4 ise 4 tane yan yana y�ld�z yaz�l�r-- for i�inde for olu�tur
			System.out.println(" ");
			
			for (int j = 0; j <i; j++) {  // buna inner= i� loop ve outer= d��loop
				System.out.print("*");
				
			}
			
		}
		
		
		

	}

}
