package Day_39_exceptions;

import java.util.ArrayList;
import java.util.List;

public class Exceptions06 {

	public static void main(String[] args) {
		
		//
		
		int arr[]= {1,2,3,5,6};
		System.out.println(arr[1]);//2
		System.out.println(arr[3]);//6
		System.out.println(arr[5]);//ArrayIndexOutOfBoundsException
		
		
		List<String> list= new ArrayList<>();
		list.add("Bahattin");
		list.add("Kazým");
		list.add("Celil");
		
		System.out.println(list.get(1));//kazým
		System.out.println(list.get(3));//ArrayIndexOutOfBoundsException
	
		
		
	}

}
