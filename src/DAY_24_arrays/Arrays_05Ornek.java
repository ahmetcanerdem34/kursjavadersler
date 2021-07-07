package DAY_24_arrays;

import java.util.Arrays;

public class Arrays_05Ornek {

	public static void main(String[] args) {
		
		
		//karışık sıralı olarak verilen bir Arrays isıralı yazdırınız
		
		int arr[]= {25,17,6,78,45,69,1};
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		//[1, 6, 17, 25, 45, 69, 78]
		
		//aynı array i büyükten küçüğe nasıl sıralayabilir
		
		for (int i =  arr.length; i >0; i--) {
			System.out.println(arr[i] + " ");
			
		}
		System.out.println("");
		System.out.println(Arrays.toString(arr));
		
		//aynı array i buyukten küçüğe doğru nasıl sıralayabiliriz
		  int arrTers[]=new int[arr.length]; // ilk array'in uzunluguna esit yeni bir array olusturdum
	        for (int i = 0; i < arrTers.length; i++) {
	            arrTers[i]= arr[arr.length-1-i];
	        }
	        System.out.println(Arrays.toString(arrTers));
}

}
