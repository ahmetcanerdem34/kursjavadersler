package DAY_16_forLoop;

import java.util.Scanner;

public class C3_ForLoop3 {

	public static void main(String[] args) {
		
		
		
		//kullanýcýdan pozitif tam sayý alýn
		//1 den kullanýcýnýn girdiði sayýya kadar tum tam sayýlarýn toplamýný yazdýrýn
		
		Scanner scan=new Scanner (System.in);
		System.out.print("pozitif tamsayý griniz :");
		int sayi=scan.nextInt();
		
		int toplam=0;
		
		//önce bir konteyner oluþturalým ki sayýlarýn toplamýný oraya koyalý toplam=
		
		
		for (int i = 1; i <=sayi; i++) {
			
			toplam=toplam +i;
		
			//önemli toplamý yazdýracaksak yani enson veriyi yazdýr diyorsam 
			//syso yu for lop body si dýþýnda yazmalýyýz
			
		}
		
		
		System.out.println(toplam);
		
////		pozitif tamsayý griniz :10
//		55

		

	}

}
