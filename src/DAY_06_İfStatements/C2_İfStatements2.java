package DAY_06_�fStatements;

import java.util.Scanner;

public class C2_�fStatements2 {

	public static void main(String[] args) {
		
		
		//soru kullan�cdan bir say� isteyin ve say�n�n tekmi �ift mi onu yazd�r�n
		
		Scanner scan=new Scanner (System.in);
		
		System.out.print("bir say� giriniz :");
		
		int sayi=scan.nextInt();
		
		if(sayi%2==0) {//burda �art� sa�lamad�-- body girmedi
			
			System.out.println("girilen sayi �iftir");
		}
		if(sayi%2==1 || sayi%2==-1) {//negatif say�larda �al��maz ��nk� kalan -1 verir, �artalr sa�lanmaz
//			bir say� giriniz :-115
//			girilen sayi tektir
			
			System.out.println("girilen sayi tektir");
			
//			bir say� giriniz :153
//			girilen sayi tektir
//			kat�ld���n�z i�in te�ekk�rler
		}
		
		
		System.out.println(sayi%2);//negatid de�er girdi�imizde sadece kalan�n ne oldu�unu yazar
//		bir say� giriniz :-113
//		-1
//		kat�ld���n�z i�in te�ekk�rler
		
		
		System.out.println("kat�ld���n�z i�in te�ekk�rler");//burda herhangi bir �art yok hert�rl� �al���r
		scan.close();
	}

}
