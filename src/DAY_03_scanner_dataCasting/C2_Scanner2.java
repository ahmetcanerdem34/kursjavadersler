package DAY_03_scanner_dataCasting;

import java.util.Scanner;

public class C2_Scanner2 {

	public static void main(String[] args) {
		
		
		//kullanýcýdan ismini isteyin ve ilk harfini büyük harf olarak yazýn
		
		
		
		Scanner scan=new Scanner (System.in);
		
		System.out.print("lütfen isminizi giriniz :");
		char ilkHarf=scan.nextLine().toUpperCase().charAt(0);//javda . nokta koyarak istediðimiz kadar yan yana iþlem yaparýz
		//ilk char yapýp sonra upper yapacaktým ancak char primitive old.. methodu yoktur, sahip deðildir
		//STRÝNG DE HARFLERÝN ÝNDEXLERÝ 0 DAN BAÞLAR
		//ÝLK HARFÝ ALMAK ÝSTEDÝÐÝMÝZ ÝÇÝN ÝNDEX olarak girmeliyiz
		
		System.out.println("baþ harfiniz : " + ilkHarf);
//		lütfen isminizi giriniz :mehmet
//		baþ harfiniz : m
		
//		lütfen isminizi giriniz :mehmet
//		baþ harfiniz : M
		// iki okutma arasýndaki fark, ismi aldýk hepsini büyük harfe çevirdik ve char at le ilk harfi aldýk
		
		scan.close();
		
		
	}

}
