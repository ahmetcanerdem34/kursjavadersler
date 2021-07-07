package DAY_24_arrays;

import java.util.Arrays;

public class Arrays_03Ornek {

	public static void main(String[] args) {
		
		
		//Soru 2: Verilen bir array’in tum elemanlarini toplayan bir program yazalim.
		
		
		
		int arr[] = {10, 15,2,45,78};//bu sayýlarý toplamak için bir konteryer gerekiyor, yani int top=0; elemanlarý al ekle
		
		int toplam=0; //bu lokal variabble dir deðer atamalýyýz sonra çalýþmaz
		
		for (int i = 0; i < arr.length; i++) {
			
			toplam+=arr[i];
		}
		System.out.println(toplam);
		//150

		
		
		//verilen arayin elemanlarýný toString methodu ile yanyana yazdýrýn
		
		
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i] + " ");
			
//			10 
//			15 
//			2 
//			45 
//			78 
			
			
		}
		
	}

}
