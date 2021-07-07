package DAY_46_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C2_HashSet01 {

	public static void main(String[] args) {
		
		//verilen bir arraydaki tekrarl� elemanlar� 
		//unuquie elemanlardan olu�an bir array e �eviren bir method yaz�n�z
		//bir method yaz�n�z
		//set tekrarl� elemanlar� siler
		
		int arr[]= {2,3,4,3,5,3,6,4,7,4,8,5};
		
		
		int tekrarsizArray[] = tekrarlariSil(arr);//method call yap�yoruz
		
		System.out.println("Main method olarak array i�inde :"+Arrays.toString(tekrarsizArray));
		//Main method olarak array i�inde :[2, 3, 4, 5, 6, 7, 8]
	}

	public static int [] tekrarlariSil(int[] arr) {
		
		Set<Integer> set1 = new HashSet<>();//set te index olmad��� i�in for de�il for each kullan�yoruz
		
		for (Integer each : arr) {//arr y deki her bir eleman� set e ekleyerek tekrardan kurtulduk
			
			set1.add(each);
		}
		System.out.println("Set olarak method i�inde :"+set1);//Set olarak method i�inde :[2, 3, 4, 5, 6, 7, 8]

		
		//sonucu array olark istiyorlar olu�turul�m
		
		int tekrarsizArray[] = new int[set1.size()];//uzunlu�unu girmeliyiz---setin size �n� al�p bu buyuklukte bir array olu�turdu
		int index=0;//bu index gelen herbir arr--Array i�in sayacak
		for (int each : set1) {
			tekrarsizArray[index]=each;//setteki elemanlar� arry e ekledik, array indexe ihtiya� duydu�u i�in int index =0; local variable olu�turduk
			index++;
		}
		
		return tekrarsizArray;
		
		
	}

}
