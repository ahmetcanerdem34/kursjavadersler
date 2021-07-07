package DAY_27_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList06 {

	public static void main(String[] args) {
		
		//verilen List eyi Array a nasýl çevirebiliriz
		
		
		
		List<String> list=new ArrayList<>();//problem yaparsa burdaki elmas içinede String yazabilirsiniz
		//array oluþturmalýyýmki declare edeyim
		list.add("Ali");
		list.add("Veli");
		
		String arr[]=  list.toArray(new String [0]);
		
		System.out.println(Arrays.toString(arr));
		//[Ali, Veli]

		//list ile array arasýndaki fark nedir

	}

}
