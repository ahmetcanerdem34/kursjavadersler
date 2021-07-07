package DAY_28_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C1_ForEachLoopCalisma03 {

	public static void main(String[] args) {
		
		
		// verilen bir array'deki tum elemanlari bir listeye aktaran bir method yaziniz
		
		String arr[]= {"Ali","veli","ayþe","fatma"};

		
		List<String> list= listeyeCevir(arr);
		
		System.out.println(list);
		
		
	}

	public static List<String> listeyeCevir(String arr[]) {
		
		List<String> geciciList= new ArrayList<>();
		
		for (String string : arr) {
			
			geciciList.add(string);
			
		}
		
		
		return geciciList;
	}

}
