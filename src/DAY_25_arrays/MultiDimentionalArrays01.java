package DAY_25_arrays;

import java.util.Arrays;

public class MultiDimentionalArrays01 {

	public static void main(String[] args) {
		// i� i�e aray olu�turdu�umuzda  disardaki ana array a outer array
		//i�erdekinne inner array denir
		//e�er i�erdeki arraylerin boyutlar� birbirinden farkl� ise 
		//Aray i ancak tum elemanlar� yazarsak declare edebiliriz
		//multi dimentionlarda array da bir elemann�n index i i�in en d�staki array hari�
		//elemana kadar i� i�e olan tum arraylar�n indexlerini yazmak gerekir
		
		
		
		int arr[][]= {{1,3,5},{3,5},{5,9,11,3}};//iki katli bir arraydir
		//11 i index ile ifade etmek istersek arr[2][2]
		
		
		//e�er Array i uzunluk�a declare etmek istersek inner array uzunluklar� esit olmal�
		
		int arr2[][]=new int [3][2];
		//[3] ilk yaz�lan sayi outer aray in i�inde ka� tane inner arra oldu�unu belirtir
		//[2] here bir inner array�n uzunlu�u
		
		System.out.println(Arrays.toString(arr2));//arrs outer
		
		//Multidimentional array leri yazd�rmak i�in tostring methodu kullan�lmaz
		//cunku to string methodu array i stringe cevirir
		//outer array in i�inde inner arrayler oldu�undan tostring methodunda inner arraylerin referans de�erleri yazd�r�l�r
		System.out.println(Arrays.deepToString(arr2));
		
	//	[[0, 0], [0, 0], [0, 0]]==>resimde ac�klamas� var
		
		}

}
