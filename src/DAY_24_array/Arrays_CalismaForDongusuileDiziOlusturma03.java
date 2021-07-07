package DAY_24_array;

import java.util.Scanner;

public class Arrays_CalismaForDongusuileDiziOlusturma03 {

	public static void main(String[] args) {
		
		/*
		sayilar=new int[10];//dizi sayýsýný sonradan böylede arttýrabiliriz
		*/
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("diiz boyutunu giriniz :");
		int diziBoyutu=scan.nextInt();
		
		
		int sayilar[]=new int[diziBoyutu];
		
		for (int i = 0; i < sayilar.length; i++) {//burdaki for ile girilecek asyýlarý aldýk
			
			System.out.println((i+1)+" "+".sayý griniz :");
			
			sayilar[i]=scan.nextInt();
			
		}
		for (int i = 0; i < sayilar.length; i++) {//burdaki for ile girlenleri yazdýrdýk
			System.out.println(sayilar[i]);//yan yana yazdýormak için ln i sil i yanýna + " " 
			
//			diiz boyutunu giriniz :5
//			1 .sayý griniz :
//			34
//			2 .sayý griniz :
//			3
//			3 .sayý griniz :
//			45
//			4 .sayý griniz :
//			32
//			5 .sayý griniz :
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
