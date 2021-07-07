package DAY_27_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListCalisma06 {

	public static void main(String[] args) {
		
		//önceki verilen array i liste çevirmekti þimdi:
		//verilen List eyi Array a nasýl çevirebiliriz
		
		List<String> list=new ArrayList<>();
		list.add("Ali");
		list.add("Kamuran");
		
		String arr[]= list.toArray(new String [0]);
		System.out.println(Arrays.toString(arr));
		//[Ali, Kamuran]
		
	}

}
