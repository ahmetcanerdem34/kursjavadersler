package DAY_46_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C2_HashSet01 {

	public static void main(String[] args) {
		
		//verilen bir arraydaki tekrarlý elemanlarý 
		//unuquie elemanlardan oluþan bir array e çeviren bir method yazýnýz
		//bir method yazýnýz
		//set tekrarlý elemanlarý siler
		
		int arr[]= {2,3,4,3,5,3,6,4,7,4,8,5};
		
		
		int tekrarsizArray[] = tekrarlariSil(arr);//method call yapýyoruz
		
		System.out.println("Main method olarak array içinde :"+Arrays.toString(tekrarsizArray));
		//Main method olarak array içinde :[2, 3, 4, 5, 6, 7, 8]
	}

	public static int [] tekrarlariSil(int[] arr) {
		
		Set<Integer> set1 = new HashSet<>();//set te index olmadýðý için for deðil for each kullanýyoruz
		
		for (Integer each : arr) {//arr y deki her bir elemaný set e ekleyerek tekrardan kurtulduk
			
			set1.add(each);
		}
		System.out.println("Set olarak method içinde :"+set1);//Set olarak method içinde :[2, 3, 4, 5, 6, 7, 8]

		
		//sonucu array olark istiyorlar oluþturulým
		
		int tekrarsizArray[] = new int[set1.size()];//uzunluðunu girmeliyiz---setin size ýný alýp bu buyuklukte bir array oluþturdu
		int index=0;//bu index gelen herbir arr--Array için sayacak
		for (int each : set1) {
			tekrarsizArray[index]=each;//setteki elemanlarý arry e ekledik, array indexe ihtiyaç duyduðu için int index =0; local variable oluþturduk
			index++;
		}
		
		return tekrarsizArray;
		
		
	}

}
