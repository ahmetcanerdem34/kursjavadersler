package DAY_25_arrays;

import java.util.Arrays;

public class Calisma_Array2 {

	public static void main(String[] args) {
		
		
		int arr[]= {23,45,43,45,65};//bu dizi i�erisinde 25 var m� diye soral�m
		
		boolean flag=false;
		int sayi=25;//bu dizi i�erisinde 25 var m� diye soral�m
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] ==sayi) {
				
				flag=true;
			}
			
		}
		
		if(flag) {
			
			System.out.println("dizi istenilen say�y� i�eriyor");
		}
		else {
			
			System.out.println("i�ermiyor");
			
			//25 i�in ==i�ermiyor
			//23 i�in==dizi istenilen say�y� i�eriyor
		}
		
		System.out.println("****************************************");
		
		//binary y�ntemiyle yapal�m ama �ncesinde s�ralamal�y�z
		
		Arrays.sort(arr);
		System.out.println(Arrays.binarySearch(arr, 23));//0 �nc� indexte
		System.out.println(Arrays.binarySearch(arr, 25));
		System.out.println(Arrays.binarySearch(arr, 44));
		System.out.println(Arrays.binarySearch(arr, 50));
		//olmayanlar� s�ralamaya koyar ve olsayd� ka��nc� olurdu yu- ile veirir
//		0
//		-2
//		-3
//		-5

	}

}
