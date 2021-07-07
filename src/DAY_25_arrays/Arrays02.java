package DAY_25_arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		
		
		int arr[]= {3,10,16, 25,75};//a�a��da burada 25 var m� yazd�ral�m
		
		int sayi=25;// verilen bir array d ebir eleamn�n var olup olmad���n� nas�l kontrol edebiliriz
			
		//true yaa da false durumu oldu�u i�in flag kullan�yorduk
		boolean flag=false;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]==sayi) {
				
				flag=true;
			}
			
		}
		//if in i�in ne boolean bir de�er yaz�yorduk 
		if (flag) {
			
			System.out.println("array sorulan eleman� i�eriyor");
		}else {
			System.out.println("i�ermiyor");
			
			//array sorulan eleman� i�eriyor
		}
		//arrays methodundan method kullanarak yapal�m
		
		
		Arrays.sort(arr);//ilk �nce s�ralama yapmal�y�z 3,10,16, 25,75
		System.out.println(Arrays.binarySearch(arr, 25));//syso i�inde yaz�nca sonucu ��k�cak
		System.out.println(Arrays.binarySearch(arr, 10));
		System.out.println(Arrays.binarySearch(arr, 28));//-5 neden eksi, bu array in i�inde 28 yok anlam�nda
		System.out.println(Arrays.binarySearch(arr, 5));//-2
//		3
//		1
//		-5
//		-2

		//binary.search arad���m�z eleman varsa indexini verir, 
		//arad���n�z eleman yoksa  -i�rareti ile olsayd� ka��nc� eleman olaca��n�n  s�ras�n� veriri
		
		
		int arr2[]= {12,15,25,14,3,22,65};
		
		Arrays.sort(arr2);
		System.out.println(Arrays.binarySearch(arr2, 14));//3
		System.out.println(Arrays.binarySearch(arr2, 20));
		System.out.println(Arrays.binarySearch(arr2, 12));
		System.out.println(Arrays.binarySearch(arr2, 2));
//		3
//		-5
//		1
//		-1
		
		//Array nas�l String e �evrilir
		
		
		String arrayString=Arrays.toString(arr2);
		System.out.println(arrayString);
		System.out.println(arrayString.substring(3));//ba�taki [ dahil array i Stringe �evirir
		//[3,12, 14, 15, 22, 25, 65]
		//2, 14, 15, 22, 25, 65]
		
	}
	
	

}
