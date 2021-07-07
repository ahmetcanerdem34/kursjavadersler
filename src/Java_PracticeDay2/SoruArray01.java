package Java_PracticeDay2;

import java.util.Scanner;

public class SoruArray01 {

	public static void main(String[] args) {
	/*	
		* Kullanicidan int array uzunlugunu isteyin
		 * Arrayin uzunlugu kadar kullanicidan array elemanlarini girmesini isteyin
		 * Array elemanlarini toplamini return eden metod yazin
		 */
		
		
		//1. ad�m
		Scanner scan = new Scanner (System.in);
		System.out.println("array uzunlu�unu giriniz :");
		int uz=scan.nextInt();
		
		int arr[]= new int[uz];//i�indeki k�sm� kullan�c�dan istiyoruz uz,, 
		//buraya 5 te diyebilirdik ama dinamik yaparak kullan�c�y� devreye soktuk
		
		
		
		
		//2. ad�mkullan�c�dan array uzunlu�u kadar array elemanlar�n� girmesini isteyin
	
		System.out.println("Array elemanlar�n� giriniz :");
		
		
		for (int i = 0; i < uz; i++) {
			
			arr[i]=scan.nextInt();//girilen her bir say�y� i ye atam�� olacak
			
		}
		
		//4 ad�m olu�turulan methodun �a�r�lmas�
		
		System.out.println("olu�turulan array elemamnlar� toplam� : "+arrayElemanlariToplami(arr));
		scan.close();
		
//		array uzunlu�unu giriniz :
//			7
//			Array elemanlar�n� giriniz :
//			4
//			32
//			43
//			54
//			43
//			43
//			23
//			olu�turulan array elemamnlar� toplam� : 242
	
	
		
	}
	//3. ad�m array elemanlar�n� toplayan method yaz�n
	
	public static int arrayElemanlariToplami(int arrSum[]) {//methodun parametresi de bira rray
		
		
		int sum=0;
		
		for (int each : arrSum) {
			sum+=each;
			
		}
		
		return sum;
		
		
		
		
	}

}
