package DAY_27_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListCalisma06 {

	public static void main(String[] args) {
		
		//�nceki verilen array i liste �evirmekti �imdi:
		//verilen List eyi Array a nas�l �evirebiliriz
		
		List<String> list=new ArrayList<>();
		list.add("Ali");
		list.add("Kamuran");
		
		String arr[]= list.toArray(new String [0]);
		System.out.println(Arrays.toString(arr));
		//[Ali, Kamuran]
		
	}

}
