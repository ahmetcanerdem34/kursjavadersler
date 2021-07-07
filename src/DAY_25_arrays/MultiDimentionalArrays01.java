package DAY_25_arrays;

import java.util.Arrays;

public class MultiDimentionalArrays01 {

	public static void main(String[] args) {
		// iç içe aray oluşturduğumuzda  disardaki ana array a outer array
		//içerdekinne inner array denir
		//eğer içerdeki arraylerin boyutları birbirinden farklı ise 
		//Aray i ancak tum elemanları yazarsak declare edebiliriz
		//multi dimentionlarda array da bir elemannın index i için en dıstaki array hariç
		//elemana kadar iç içe olan tum arrayların indexlerini yazmak gerekir
		
		
		
		int arr[][]= {{1,3,5},{3,5},{5,9,11,3}};//iki katli bir arraydir
		//11 i index ile ifade etmek istersek arr[2][2]
		
		
		//eğer Array i uzunlukşa declare etmek istersek inner array uzunlukları esit olmalı
		
		int arr2[][]=new int [3][2];
		//[3] ilk yazılan sayi outer aray in içinde kaç tane inner arra olduğunu belirtir
		//[2] here bir inner arrayın uzunluğu
		
		System.out.println(Arrays.toString(arr2));//arrs outer
		
		//Multidimentional array leri yazdırmak için tostring methodu kullanılmaz
		//cunku to string methodu array i stringe cevirir
		//outer array in içinde inner arrayler olduğundan tostring methodunda inner arraylerin referans değerleri yazdırılır
		System.out.println(Arrays.deepToString(arr2));
		
	//	[[0, 0], [0, 0], [0, 0]]==>resimde acıklaması var
		
		}

}
