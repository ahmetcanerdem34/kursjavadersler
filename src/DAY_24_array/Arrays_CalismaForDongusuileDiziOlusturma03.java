package DAY_24_array;

import java.util.Scanner;

public class Arrays_CalismaForDongusuileDiziOlusturma03 {

	public static void main(String[] args) {
		
		/*
		sayilar=new int[10];//dizi say�s�n� sonradan b�ylede artt�rabiliriz
		*/
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("diiz boyutunu giriniz :");
		int diziBoyutu=scan.nextInt();
		
		
		int sayilar[]=new int[diziBoyutu];
		
		for (int i = 0; i < sayilar.length; i++) {//burdaki for ile girilecek asy�lar� ald�k
			
			System.out.println((i+1)+" "+".say� griniz :");
			
			sayilar[i]=scan.nextInt();
			
		}
		for (int i = 0; i < sayilar.length; i++) {//burdaki for ile girlenleri yazd�rd�k
			System.out.println(sayilar[i]);//yan yana yazd�ormak i�in ln i sil i yan�na + " " 
			
//			diiz boyutunu giriniz :5
//			1 .say� griniz :
//			34
//			2 .say� griniz :
//			3
//			3 .say� griniz :
//			45
//			4 .say� griniz :
//			32
//			5 .say� griniz :
//			12
//			34
//			3
//			45
//			32
//			12
			
			scan.close();
		}
		
		
		
		
		

	}

}
