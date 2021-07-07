package DAY_27_arrayList;

import java.util.Arrays;
import java.util.List;

public class ArrayList05 {

	public static void main(String[] args) {
		
		//verilen bir Array i list e nasýl çevirebiliriz
		
		//bir array oluþturalým====peki listte çevirmek ne iþe mize yarar, bazý methodlarý kullanabilriz
		String arr[]= {"Ali", "Veli"};
		//liste çevirmek istiyorsak önce bir list oluþturmalýyým
		
		///eþitliðin solu declare = sað tarafý  as list methodu arr yi bir listeye çevirip sola declare edecek
		List<String> listArr= Arrays.asList(arr);//array sýnýfýnda yardým isteyerek ordan Stringe declare edeceðim
		
		//arr stringini
		//listarr ye atadýk
		System.out.println(listArr);
		//[Ali, Veli]
				
			
		
		System.out.println("**********************");
		
		Integer arr1[]= {1,2,3};//wrapper class ý yazmak laýzm hata yazmasýn diye
		List<Integer> list2=Arrays.asList(arr1);
		System.out.println(list2);
		//	[1, 2, 3]
		
		//bazen çok fazla elemaný olan bir liste oluþturmanýz gerekir.
		//bu durumda liste elemanlarýný tek tek eklemek yerine 
		//elemanlarý bir array e ekler sonra da array i liste çevirebiliriz
		//örnek bir web sitesindeki tüm ürünleri bir listeye eklemek istediðimizde,,,,
		
		//farklý olarak for loop lada yapabiliriz, ama böyle yol varken yapmaya gerek yok
		
		//bu methodun dez avantajý varmý, evet
		//bu methodla array den çevirdiðimiz list esnek olmaz
		//array in özelliklerini taþýr
		
		
		
		//arr1 dek, 1 elemaný deðiþtirelim mesela
		//java bu deðiþimdeki Array ve List i sekronize eder
		//birinde yaptýðýmýz deðiþiklik, otomatik olarak ðerini de update eder
				
		arr1[1]=5;//5 yapalým
		System.out.println(Arrays.toString(arr1));
		//[1, 5, 3]
		
		
		System.out.println("list2 : " + list2);
		//list2 : [1, 5, 3]
		//burdak deðiþim bu, list 2 yi dedðiþtiriyor
		
		System.out.println("******************");
		//tersine bakalým
		list2.set(2, 13);
		System.out.println("list2 : " + list2);//list2 deðiþmiþ, arrayide yazdýralým onuda deðiþtirmiþ
		System.out.println("array : "+Arrays.toString(arr1));
//		list2 : [1, 5, 13]
//		array : [1, 5, 13]
		
		
		
		
		

	}

}
