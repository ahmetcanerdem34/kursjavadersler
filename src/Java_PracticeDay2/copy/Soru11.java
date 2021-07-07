package Java_PracticeDay2.copy;

import java.util.Scanner;

public class Soru11 {

	public static void main(String[] args) {
	
		/*	
		* Perfect Number (Mukemmel sayi)
        Bir sayinin mukemmel olup olmadigini bulan method yaziniz.
        Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,
        kendisine esitse o sayi mukemmeldir.
        ORNEK:
    INPUT      : 6
    OUTPUT :  1,2,3
                       1+2+3 = 6 = 6 (Mukemmel)
		 */
		
		Scanner scan=new Scanner (System.in);
		System.out.println("sayý giriniz");
		int n=scan.nextInt();
		
		mukemmelSayi(n);
		
		
		scan.close();

	}
	
	public static void mukemmelSayi(int n) {
		
		int sum=0;
		
		for (int i = 1; i < n; i++) {
			
			
			if(n%i==0) {
				sum=sum+i;
				
				
			}
		}
		
		if(sum==n) {
			
			System.out.println(n + "mükemmel sayýdýr");
		}else {
			
			System.out.println(n + "mükemmel sayý deðildir");
//			sayý giriniz
//			6
//			6mükemmel sayýdýr
			
//			sayý giriniz
//			10
//			10mükemmel sayý deðildir

		}

	}
	

}
