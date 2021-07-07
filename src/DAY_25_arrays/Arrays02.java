package DAY_25_arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		
		
		int arr[]= {3,10,16, 25,75};//aþaðýda burada 25 var mý yazdýralým
		
		int sayi=25;// verilen bir array d ebir eleamnýn var olup olmadýðýný nasýl kontrol edebiliriz
			
		//true yaa da false durumu olduðu için flag kullanýyorduk
		boolean flag=false;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]==sayi) {
				
				flag=true;
			}
			
		}
		//if in için ne boolean bir deðer yazýyorduk 
		if (flag) {
			
			System.out.println("array sorulan elemaný içeriyor");
		}else {
			System.out.println("içermiyor");
			
			//array sorulan elemaný içeriyor
		}
		//arrays methodundan method kullanarak yapalým
		
		
		Arrays.sort(arr);//ilk önce sýralama yapmalýyýz 3,10,16, 25,75
		System.out.println(Arrays.binarySearch(arr, 25));//syso içinde yazýnca sonucu çýkýcak
		System.out.println(Arrays.binarySearch(arr, 10));
		System.out.println(Arrays.binarySearch(arr, 28));//-5 neden eksi, bu array in içinde 28 yok anlamýnda
		System.out.println(Arrays.binarySearch(arr, 5));//-2
//		3
//		1
//		-5
//		-2

		//binary.search aradýðýmýz eleman varsa indexini verir, 
		//aradýðýnýz eleman yoksa  -iþrareti ile olsaydý kaçýncý eleman olacaðýnýn  sýrasýný veriri
		
		
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
		
		//Array nasýl String e çevrilir
		
		
		String arrayString=Arrays.toString(arr2);
		System.out.println(arrayString);
		System.out.println(arrayString.substring(3));//baþtaki [ dahil array i Stringe çevirir
		//[3,12, 14, 15, 22, 25, 65]
		//2, 14, 15, 22, 25, 65]
		
	}
	
	

}
