package ODEVLER_7;

import java.util.ArrayList;
import java.util.List;

public class Soru03 {

	public static void main(String[] args) {
		
		/* Verilen array’deki tekrar eden sayilari, ilki haric silip, tekrarsiz
		 * * sayilardan olusan bir array haline getiren bir program yaziniz.
		 * ** INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}* OUTPUT : [1,2,3,4,5,6,7,8,9]
		 * */

		
		int arr[]={1,2,2,3,1,4,2,5,6,8,7,5,9,1};
		
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[j]!=arr[i]&& !list.contains(arr[i])) {
					list.add(arr[i]);
					
				}
				
			}
			
		}
	System.out.println(list);//[1, 2, 3, 4, 5, 6, 8, 7, 9]
		
	}

}
