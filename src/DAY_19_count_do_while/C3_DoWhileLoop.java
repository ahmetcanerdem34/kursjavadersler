package DAY_19_count_do_while;

import java.util.Scanner;

public class C3_DoWhileLoop {

	public static void main(String[] args) {
		
		//while loop ta �nce �arta bak�yorduk sa�lan�yorsa tekrar tekrar �al���yordu
		
		//do while ise �nce kodu �al��t�r�yoruz sonra �arta bak�yoruz
		//fasydas� ne= 
		
		Scanner scan= new Scanner (System.in);
		
		int sayi=0;//niye burda olu�turdu�umuzu sonrak i ders te a��klayaca��z
		
		do {//�nce bir �eyi yapt diyoruz---> bir kere �al���r yani
			
			
			System.out.print("pozi say� giriniz :");//-5 girdi diyelim. while i�ine bakal�m
			//-25, -5,0 lar� denedik yukar� g�nderdi... 20 g�nderdik false oldu a�a�� indi aferin dedi, 
			sayi=scan.nextInt();
			
			
			
		} while (sayi<=0);//buras� �art--->true olunca �al���yor, yukar� g�nderiyor, false olunca a�a�� gidecek
		//bu �art sa�land�k�a yukar� �al���r s�rekli ,sa�lanmay�nca a�a�� iner
		
		
		System.out.println("aferin");
//		pozi say� giriniz :-5
//		pozi say� giriniz :-4
//		pozi say� giriniz :-3
//		pozi say� giriniz :4
//		aferin
			
			
	scan.close();	
		

	}

}
