package DAY_27_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListCalisma07 {

	public static void main(String[] args) {
		
		//verilen array deki tekrarlý elemanlarý silip, tekrarsýz bir array oluþturmak istiyoruz
				//array veya list kullanarak bunu yapýnýz
		
		int arr[]= {1,2,3,4,5,4,3,6,7,8,9,6,5,7,3};
		System.out.println(Arrays.toString(arr));
		//[1, 2, 3, 4, 5, 4, 3, 6, 7, 8, 9, 6, 5, 7, 3]
		
		List<Integer> list=new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			
			if(!list.contains(arr[i])) {
				
				list.add(arr[i]);
				
				
				
			}
			
		}
		System.out.println(list);
		//[1, 2, 3, 4, 5, 6, 7, 8, 9]
		
		System.out.println("*****************************");
		
		//elimizde ki list i arrray e çevirelim
		
		Integer yeniArr[]= list.toArray(new Integer[0]);
		
		System.out.println(Arrays.toString(yeniArr));
		//[1, 2, 3, 4, 5, 6, 7, 8, 9]
	}

}
