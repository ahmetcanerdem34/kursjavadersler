package DAY_16_forLoop;

import java.util.Scanner;

public class C5_ForLoop5 {

	public static void main(String[] args) {
	/*	
		Interview Question Kullanicidan 100’den kucuk bir tamsayi isteyin. 
		1’den baslayarak girilen sayiya kadar tum sayilari yazdirin. Ancak;
        - Sayi 3’un kati ise sayi yerine “Java” yazdirin.
        - Sayi 5’in kati ise sayi yerine “Guzeldir” yazdirin.
        - Sayi hem 3’un hem 5’in kati ise sayi yerine “Java Guzeldir” yazdirin.
        */
		
		Scanner scan=new Scanner (System.in);
		System.out.print("100 den aþaðý pozitif tamsayý griniz :");
		int sayi=scan.nextInt();
		
		

		for (int i = 1; i <=sayi; i++) {
			
			
		
		if(i%15==0) {
			System.out.println("java güzeldir");
		}
			
		
		else if(i%5==0) {
			System.out.println("Güzeldir");
		}
				
			
		else if(i%3==0) {
			System.out.println("Java güzeldir");
		}else {
			
			
			System.out.println(i);
			
			
//			100 den aþaðý pozitif tamsayý griniz :20
//			1
//			2
//			Java güzeldir
//			4
//			Güzeldir
//			Java güzeldir
//			7
//			8
//			Java güzeldir
//			Güzeldir
//			11
//			Java güzeldir
//			13
//			14
//			java güzeldir
//			16
//			17
//			Java güzeldir
//			19
//			Güzeldir
		}
				
		}	
		
		
	}

}
