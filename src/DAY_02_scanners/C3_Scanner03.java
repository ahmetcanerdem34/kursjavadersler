package DAY_02_scanners;

import java.util.Scanner;

public class C3_Scanner03 {
	
	public static void main(String[] args) {
		
		//kullan�c�dan ismini ve soyismini al�p aralar�nda bo�luk b�rakarak isim soyisim yazd�r�n
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("isminizi giriniz :");
		String isim=scan.nextLine();
		
		System.out.print("soyisminizi giriniz :");
		String soy�sim=scan.nextLine();//sadece next() girilirse java gilen ilk kelimeyi al�r, adam�n 2  ismi olabilir
		
		System.out.print("ya��n�z� giriniz :");
		int age=scan.nextInt();
		
		System.out.println(isim+" "+soy�sim+" "+age);
		System.out.print(isim+"");
		System.out.print(soy�sim+"");
		System.out.println(age);
//		isminizi giriniz :ahmet 
//		soyisminizi giriniz :eren
//		ya��n�z� giriniz :34
//		ahmet  eren 34
//		ahmet eren34

	}

}
