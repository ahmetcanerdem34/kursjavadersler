package DAY_27_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListCalisma05 {

	public static void main(String[] args) {
		
		
		//verilen bir Array i list e nas�l �evirebiliriz
		
		//string de�erli bir dizimizi, liste �eviriyoruz
		String arr1[]= {"Ali", "Veli"};
		
		//bu array i liste �evirmek i�in bir string list olu�turmal�y�z, asList i kullanal�m
		
		List<String> listArr1 = Arrays.asList(arr1);
		System.out.println(listArr1);
		//[Ali, Veli]
		
		System.out.println("********************");
		
		//int de�erli bir array dizimzi int liste �eviriyoruz
		Integer arr2[]= {1,2,3};
		
		List<Integer> list2=Arrays.asList(arr2);
		System.out.println(list2);
		//[1, 2, 3]
		
		System.out.println("***************");
		
		arr2[1]=5;
		System.out.println(Arrays.toString(arr2));
		//[1, 5, 3] ---> 1. indexteki 2 idi 5 yapt�k, atad�k
		
		System.out.println(list2);
		//[1, 5, 3]----->hem array deki hemde dizideki de�i�mi� oluyor
		
		System.out.println("******************");
		
		//tersine yani liste de�i�tirince array de de de�i�iyor mu?
				
		list2.set(2, 13);//listede--->2. indexten sonra 13 koy dedik		
		
		System.out.println(list2);
		System.out.println(Arrays.toString(arr2));//g�rd��m�z gibi arrayde de de�i�tirmi�
//		[1, 5, 13]
//		[1, 5, 13]
		
		
		
	}

}
