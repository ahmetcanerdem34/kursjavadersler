package DAY_08_nestedİf;

import java.util.Scanner;

public class C3_NestedArtıkYıl {

	public static void main(String[] args) {
		
		//şubatın 29 gun çektiği yıl -->
		
		//4 ile bölünemyen yıllar artık yıl olamaz
		//4 un katı lamsına rağmen 100 ile bolunebiklen yıllardan sadece 400 un katı olanyıllar artık yıldır
		
		
		Scanner scan=new Scanner (System.in);
		
		System.out.print("bir yıl giriniz :");
		int yil=scan.nextInt();
		
		//1. durum 4 e bölünecek 100 e bolunemeyecek
		
		if (yil%4==0  && yil%100 != 0){
			System.out.println("artık yıl");
			
		} else if (yil%4==0 && yil%100==0 && yil%400==0) {//burda 4 e bilmeye de gerek yok 100 ile bölünen her sayı 4 ile de bölünebilir
								//yıl%100==0 bu kısmıda kaldırsak olur 100 un katı 400 unde katıdır
			System.out.println("artık yıl");

		}else {
			System.out.println("artık yıl değil");
			
//			bir yıl giriniz :2000
//			artık yıl
			
//			bir yıl giriniz :2004
//			artık yıl
			
//			bir yıl giriniz :2300
//			artık yıl değil
			
//			bir yıl giriniz :2021
//			artık yıl değil


scan.close();
		}
		
		
	}

}
