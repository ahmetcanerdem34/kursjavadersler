package DAY_24_arrays;

import java.util.Arrays;

public class Arrays_05Ornek {

	public static void main(String[] args) {
		
		
		//kar���k s�ral� olarak verilen bir Arrays is�ral� yazd�r�n�z
		
		int arr[]= {25,17,6,78,45,69,1};
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		//[1, 6, 17, 25, 45, 69, 78]
		
		//ayn� array i b�y�kten k����e nas�l s�ralayabilir
		
		for (int i =  arr.length; i >0; i--) {
			System.out.println(arr[i] + " ");
			
		}
		System.out.println("");
		System.out.println(Arrays.toString(arr));
		
		//ayn� array i buyukten k����e do�ru nas�l s�ralayabiliriz
		  int arrTers[]=new int[arr.length]; // ilk array'in uzunluguna esit yeni bir array olusturdum
	        for (int i = 0; i < arrTers.length; i++) {
	            arrTers[i]= arr[arr.length-1-i];
	        }
	        System.out.println(Arrays.toString(arrTers));
}

}
