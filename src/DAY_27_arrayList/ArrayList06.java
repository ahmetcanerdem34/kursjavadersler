package DAY_27_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList06 {

	public static void main(String[] args) {
		
		//verilen List eyi Array a nas�l �evirebiliriz
		
		
		
		List<String> list=new ArrayList<>();//problem yaparsa burdaki elmas i�inede String yazabilirsiniz
		//array olu�turmal�y�mki declare edeyim
		list.add("Ali");
		list.add("Veli");
		
		String arr[]=  list.toArray(new String [0]);
		
		System.out.println(Arrays.toString(arr));
		//[Ali, Veli]

		//list ile array aras�ndaki fark nedir

	}

}
