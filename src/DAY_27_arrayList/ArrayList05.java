package DAY_27_arrayList;

import java.util.Arrays;
import java.util.List;

public class ArrayList05 {

	public static void main(String[] args) {
		
		//verilen bir Array i list e nas�l �evirebiliriz
		
		//bir array olu�tural�m====peki listte �evirmek ne i�e mize yarar, baz� methodlar� kullanabilriz
		String arr[]= {"Ali", "Veli"};
		//liste �evirmek istiyorsak �nce bir list olu�turmal�y�m
		
		///e�itli�in solu declare = sa� taraf�  as list methodu arr yi bir listeye �evirip sola declare edecek
		List<String> listArr= Arrays.asList(arr);//array s�n�f�nda yard�m isteyerek ordan Stringe declare edece�im
		
		//arr stringini
		//listarr ye atad�k
		System.out.println(listArr);
		//[Ali, Veli]
				
			
		
		System.out.println("**********************");
		
		Integer arr1[]= {1,2,3};//wrapper class � yazmak la�zm hata yazmas�n diye
		List<Integer> list2=Arrays.asList(arr1);
		System.out.println(list2);
		//	[1, 2, 3]
		
		//bazen �ok fazla eleman� olan bir liste olu�turman�z gerekir.
		//bu durumda liste elemanlar�n� tek tek eklemek yerine 
		//elemanlar� bir array e ekler sonra da array i liste �evirebiliriz
		//�rnek bir web sitesindeki t�m �r�nleri bir listeye eklemek istedi�imizde,,,,
		
		//farkl� olarak for loop lada yapabiliriz, ama b�yle yol varken yapmaya gerek yok
		
		//bu methodun dez avantaj� varm�, evet
		//bu methodla array den �evirdi�imiz list esnek olmaz
		//array in �zelliklerini ta��r
		
		
		
		//arr1 dek, 1 eleman� de�i�tirelim mesela
		//java bu de�i�imdeki Array ve List i sekronize eder
		//birinde yapt���m�z de�i�iklik, otomatik olarak �erini de update eder
				
		arr1[1]=5;//5 yapal�m
		System.out.println(Arrays.toString(arr1));
		//[1, 5, 3]
		
		
		System.out.println("list2 : " + list2);
		//list2 : [1, 5, 3]
		//burdak de�i�im bu, list 2 yi ded�i�tiriyor
		
		System.out.println("******************");
		//tersine bakal�m
		list2.set(2, 13);
		System.out.println("list2 : " + list2);//list2 de�i�mi�, arrayide yazd�ral�m onuda de�i�tirmi�
		System.out.println("array : "+Arrays.toString(arr1));
//		list2 : [1, 5, 13]
//		array : [1, 5, 13]
		
		
		
		
		

	}

}
