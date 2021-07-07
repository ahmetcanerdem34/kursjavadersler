package DAY_06_ÝfStatements;

import java.util.Scanner;

public class C2_ÝfStatements2 {

	public static void main(String[] args) {
		
		
		//soru kullanýcdan bir sayý isteyin ve sayýnýn tekmi çift mi onu yazdýrýn
		
		Scanner scan=new Scanner (System.in);
		
		System.out.print("bir sayý giriniz :");
		
		int sayi=scan.nextInt();
		
		if(sayi%2==0) {//burda þartý saðlamadý-- body girmedi
			
			System.out.println("girilen sayi çiftir");
		}
		if(sayi%2==1 || sayi%2==-1) {//negatif sayýlarda çalýþmaz çünkü kalan -1 verir, þartalr saðlanmaz
//			bir sayý giriniz :-115
//			girilen sayi tektir
			
			System.out.println("girilen sayi tektir");
			
//			bir sayý giriniz :153
//			girilen sayi tektir
//			katýldýðýnýz için teþekkürler
		}
		
		
		System.out.println(sayi%2);//negatid deðer girdiðimizde sadece kalanýn ne olduðunu yazar
//		bir sayý giriniz :-113
//		-1
//		katýldýðýnýz için teþekkürler
		
		
		System.out.println("katýldýðýnýz için teþekkürler");//burda herhangi bir þart yok hertürlü çalýþýr
		scan.close();
	}

}
