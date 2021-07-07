package DAY_17_ForLoop;

import java.util.Scanner;

public class C3_FoorLoop3 {

	public static void main(String[] args) {
		
		
		//kullanýcýdan 35 tan küçük pozitif bir sayý alýn 
		//girilen sayýnýn faktoriyrlini hesaplayýp yazdýýran bir metod oluþturun
		
		
		Scanner scan=new Scanner (System.in);
		System.out.print("35 küçük pozitif tamsayý griniz :");
		int sayi=scan.nextInt();
		
		if (sayi<=0 ||sayi>35) {//eðer sýfýrdan küçük veya 35 den buyuk sayi istemiyorum anlamýnda
			System.out.println("geçerli bir sayý giirniz");
			
		} else {
			faktoriyelBul(sayi);//kullanýcý 5 girmiþ olsun

		}
		
		
	}

	public static void faktoriyelBul(int sayi) {
		long faktoriyel=1;
		for (int i = 1; i <=sayi; i++) {
			
			faktoriyel*=i;
			
		}
		System.out.println(faktoriyel);
		
//		35 küçük pozitif tamsayý griniz :34
//		4926277576697053184
		
//		35 küçük pozitif tamsayý griniz :12
//		479001600
		
	
	}

}
