package DAY_03_scanner_dataCasting;

import java.util.Scanner;

public class C2_Scanner2 {

	public static void main(String[] args) {
		
		
		//kullan�c�dan ismini isteyin ve ilk harfini b�y�k harf olarak yaz�n
		
		
		
		Scanner scan=new Scanner (System.in);
		
		System.out.print("l�tfen isminizi giriniz :");
		char ilkHarf=scan.nextLine().toUpperCase().charAt(0);//javda . nokta koyarak istedi�imiz kadar yan yana i�lem yapar�z
		//ilk char yap�p sonra upper yapacakt�m ancak char primitive old.. methodu yoktur, sahip de�ildir
		//STR�NG DE HARFLER�N �NDEXLER� 0 DAN BA�LAR
		//�LK HARF� ALMAK �STED���M�Z ���N �NDEX olarak girmeliyiz
		
		System.out.println("ba� harfiniz : " + ilkHarf);
//		l�tfen isminizi giriniz :mehmet
//		ba� harfiniz : m
		
//		l�tfen isminizi giriniz :mehmet
//		ba� harfiniz : M
		// iki okutma aras�ndaki fark, ismi ald�k hepsini b�y�k harfe �evirdik ve char at le ilk harfi ald�k
		
		scan.close();
		
		
	}

}
