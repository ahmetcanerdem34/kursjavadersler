package DAY_06_ÝfStatements;

import java.util.Scanner;

public class C3_ÝfStatements3 {

	public static void main(String[] args) {
		
		
		//soru: kullanýýcdan gün isminin ilk harfini isteyin ve harfe uygun olan günleri girin ve günleri yadýrýn

		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("istediðiniz günün ilk harfini giriniz :");
		
		char gun=scan.next().toUpperCase().charAt(0);//string le alamam çünkü ilk harf diyor char ý tercih etmeliyiz
		//bu þekilde girilen ilk karakteri almýþ oldum
		
		char ilkHarf=scan.next().charAt(0);//bu þekildede yazdýðýmýzda büyük ve küçük harfe göre  || or ile þart hazýrlamalýyým
		
		if(ilkHarf=='p' || ilkHarf=='P') {
			System.out.println("pazar, pazartesi, salý");
		}
		
		if(ilkHarf=='c' || ilkHarf=='C') {
			System.out.println("cuma, cumartesi");
		}
		
		if(gun == 'P') {
			
			System.out.println("Pazartesi");
		}
		
		if(gun=='S') {
			
			System.out.println("Salý");
		}
		if(gun=='Ç') {
			System.out.println("Çarþamba");
		}
		
		if(gun=='Þ') {
			
			System.out.println("Perþembe");
		}
		if(gun=='C') {
			System.out.println("Cuma");
		}
		if(gun=='J') {
			System.out.println("Cumartesi");
		}
		if(gun=='R') {
			System.out.println("Pazar");
			
			if(gun!='p' && gun!='s' && gun!='Ç' && gun!='þ' && gun!='j' && gun!='r' ) {
				System.out.println("geçerli gün harfi giriniz");
			}
			
			
//			istediðiniz günün ilk harfini giriniz :J
//			Cumartesi		
//			
//			istediðiniz günün ilk harfini giriniz :cu
//			Cuma
			
//			istediðiniz günün ilk harfini giriniz :þ
//			Perþembe		
		
			
			scan.close();
		}
		
		
	}

}
