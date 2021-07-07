package DAY_02_scanners;

import java.util.Scanner;

public class C3_Scanner03 {
	
	public static void main(String[] args) {
		
		//kullanýcýdan ismini ve soyismini alýp aralarýnda boþluk býrakarak isim soyisim yazdýrýn
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("isminizi giriniz :");
		String isim=scan.nextLine();
		
		System.out.print("soyisminizi giriniz :");
		String soyÝsim=scan.nextLine();//sadece next() girilirse java gilen ilk kelimeyi alýr, adamýn 2  ismi olabilir
		
		System.out.print("yaþýnýzý giriniz :");
		int age=scan.nextInt();
		
		System.out.println(isim+" "+soyÝsim+" "+age);
		System.out.print(isim+"");
		System.out.print(soyÝsim+"");
		System.out.println(age);
//		isminizi giriniz :ahmet 
//		soyisminizi giriniz :eren
//		yaþýnýzý giriniz :34
//		ahmet  eren 34
//		ahmet eren34

	}

}
