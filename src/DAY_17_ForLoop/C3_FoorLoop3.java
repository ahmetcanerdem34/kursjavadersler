package DAY_17_ForLoop;

import java.util.Scanner;

public class C3_FoorLoop3 {

	public static void main(String[] args) {
		
		
		//kullan�c�dan 35 tan k���k pozitif bir say� al�n 
		//girilen say�n�n faktoriyrlini hesaplay�p yazd��ran bir metod olu�turun
		
		
		Scanner scan=new Scanner (System.in);
		System.out.print("35 k���k pozitif tamsay� griniz :");
		int sayi=scan.nextInt();
		
		if (sayi<=0 ||sayi>35) {//e�er s�f�rdan k���k veya 35 den buyuk sayi istemiyorum anlam�nda
			System.out.println("ge�erli bir say� giirniz");
			
		} else {
			faktoriyelBul(sayi);//kullan�c� 5 girmi� olsun

		}
		
		
	}

	public static void faktoriyelBul(int sayi) {
		long faktoriyel=1;
		for (int i = 1; i <=sayi; i++) {
			
			faktoriyel*=i;
			
		}
		System.out.println(faktoriyel);
		
//		35 k���k pozitif tamsay� griniz :34
//		4926277576697053184
		
//		35 k���k pozitif tamsay� griniz :12
//		479001600
		
	
	}

}
