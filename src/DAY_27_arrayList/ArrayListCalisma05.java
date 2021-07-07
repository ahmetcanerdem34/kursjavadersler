package DAY_27_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListCalisma05 {

	public static void main(String[] args) {
		
		
		//verilen bir Array i list e nasýl çevirebiliriz
		
		//string deðerli bir dizimizi, liste çeviriyoruz
		String arr1[]= {"Ali", "Veli"};
		
		//bu array i liste çevirmek için bir string list oluþturmalýyýz, asList i kullanalým
		
		List<String> listArr1 = Arrays.asList(arr1);
		System.out.println(listArr1);
		//[Ali, Veli]
		
		System.out.println("********************");
		
		//int deðerli bir array dizimzi int liste çeviriyoruz
		Integer arr2[]= {1,2,3};
		
		List<Integer> list2=Arrays.asList(arr2);
		System.out.println(list2);
		//[1, 2, 3]
		
		System.out.println("***************");
		
		arr2[1]=5;
		System.out.println(Arrays.toString(arr2));
		//[1, 5, 3] ---> 1. indexteki 2 idi 5 yaptýk, atadýk
		
		System.out.println(list2);
		//[1, 5, 3]----->hem array deki hemde dizideki deðiþmiþ oluyor
		
		System.out.println("******************");
		
		//tersine yani liste deðiþtirince array de de deðiþiyor mu?
				
		list2.set(2, 13);//listede--->2. indexten sonra 13 koy dedik		
		
		System.out.println(list2);
		System.out.println(Arrays.toString(arr2));//gördðümüz gibi arrayde de deðiþtirmiþ
//		[1, 5, 13]
//		[1, 5, 13]
		
		
		
	}

}
