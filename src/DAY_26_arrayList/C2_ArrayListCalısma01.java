package DAY_26_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C2_ArrayListCal�sma01 {

	public static void main(String[] args) {
		
		//1. yol olarak bu �ekilde yap�yoruz
		ArrayList<String> list= new ArrayList<String>();
		
		//2. yol olarak bu�ekilde yap�yoruz
		ArrayList<String> list1=new ArrayList<>();
		
		//3. yol olarak list �u lekilde ol�u�turuyoruz, en ayyg�n� bu
		List<String> list3=new ArrayList<>(); 
		
		//ADD METODU ��REN
		
		list3.add("Ahmet");
		list3.add("kaz�m");
		list3.add("beh�ce");
		//list nASIL YAZDIRILIYOR--->array de Array.to string ti butrda normal
		System.out.println(list3);
		//[Ahmet, kaz�m, beh�ce]
		
		System.out.println("*************************");
		
		//noktaya bas�p 2. se�ene�e t�klayal�m
		
		list3.add(1, "Can");//--> 0 index i ile 1. index aras�na Can � koyacakt�r ve can 1. index olacak
		System.out.println(list3);
		//[Ahmet, Can, kaz�m, beh�ce]
		
		System.out.println("***********************");
		
		list3.add(1, "Behram");
		System.out.println(list3);
		//[Ahmet, Behram, Can, kaz�m, beh�ce]
		
		System.out.println("*********************");
		
		list3.add(4, "Beyce");
		System.out.println(list3);
		//[Ahmet, Behram, Can, kaz�m, Beyce, beh�ce]
		
		System.out.println("*************************");
		
				//01 deki soruya tekrar bakal�m
		
				//Soru 6) Verilen bir Array�den isten degere esit olan elamanlari kaldirip, 
			       //  kalanlari yeni bir  Array olarak yazdiran bir method yaziniz
		
		int arr[]= {2,3,5,3,6,4,3,6,7};
		int sayi1=6;
		int sayi2=3;
		
		List<Integer> istenenList= new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]!=sayi1 && arr[i]!=sayi2) {
				
				istenenList.add(arr[i]);
			}
			
		}
		System.out.println(istenenList);
		//[2, 5, 4, 7]

	}

}
