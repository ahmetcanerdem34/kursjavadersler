package Java_PracticeDay2;

import java.util.Scanner;

public class SoruArray01 {

	public static void main(String[] args) {
	/*	
		* Kullanicidan int array uzunlugunu isteyin
		 * Arrayin uzunlugu kadar kullanicidan array elemanlarini girmesini isteyin
		 * Array elemanlarini toplamini return eden metod yazin
		 */
		
		
		//1. adým
		Scanner scan = new Scanner (System.in);
		System.out.println("array uzunluðunu giriniz :");
		int uz=scan.nextInt();
		
		int arr[]= new int[uz];//içindeki kýsmý kullanýcýdan istiyoruz uz,, 
		//buraya 5 te diyebilirdik ama dinamik yaparak kullanýcýyý devreye soktuk
		
		
		
		
		//2. adýmkullanýcýdan array uzunluðu kadar array elemanlarýný girmesini isteyin
	
		System.out.println("Array elemanlarýný giriniz :");
		
		
		for (int i = 0; i < uz; i++) {
			
			arr[i]=scan.nextInt();//girilen her bir sayýyý i ye atamýþ olacak
			
		}
		
		//4 adým oluþturulan methodun çaðrýlmasý
		
		System.out.println("oluþturulan array elemamnlarý toplamý : "+arrayElemanlariToplami(arr));
		scan.close();
		
//		array uzunluðunu giriniz :
//			7
//			Array elemanlarýný giriniz :
//			4
//			32
//			43
//			54
//			43
//			43
//			23
//			oluþturulan array elemamnlarý toplamý : 242
	
	
		
	}
	//3. adým array elemanlarýný toplayan method yazýn
	
	public static int arrayElemanlariToplami(int arrSum[]) {//methodun parametresi de bira rray
		
		
		int sum=0;
		
		for (int each : arrSum) {
			sum+=each;
			
		}
		
		return sum;
		
		
		
		
	}

}
