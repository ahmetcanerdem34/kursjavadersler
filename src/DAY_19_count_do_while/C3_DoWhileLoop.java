package DAY_19_count_do_while;

import java.util.Scanner;

public class C3_DoWhileLoop {

	public static void main(String[] args) {
		
		//while loop ta önce þarta bakýyorduk saðlanýyorsa tekrar tekrar çalýþýyordu
		
		//do while ise önce kodu çalýþtýrýyoruz sonra þarta bakýyoruz
		//fasydasý ne= 
		
		Scanner scan= new Scanner (System.in);
		
		int sayi=0;//niye burda oluþturduðumuzu sonrak i ders te açýklayacaðýz
		
		do {//önce bir þeyi yapt diyoruz---> bir kere çalýþýr yani
			
			
			System.out.print("pozi sayý giriniz :");//-5 girdi diyelim. while içine bakalým
			//-25, -5,0 larý denedik yukarý gönderdi... 20 gönderdik false oldu aþaðý indi aferin dedi, 
			sayi=scan.nextInt();
			
			
			
		} while (sayi<=0);//burasý þart--->true olunca çalýþýyor, yukarý gönderiyor, false olunca aþaðý gidecek
		//bu þart saðlandýkça yukarý çalýþýr sürekli ,saðlanmayýnca aþaðý iner
		
		
		System.out.println("aferin");
//		pozi sayý giriniz :-5
//		pozi sayý giriniz :-4
//		pozi sayý giriniz :-3
//		pozi sayý giriniz :4
//		aferin
			
			
	scan.close();	
		

	}

}
