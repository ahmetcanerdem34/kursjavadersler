package DAY_26_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C2_ArrayListCalýsma01 {

	public static void main(String[] args) {
		
		//1. yol olarak bu þekilde yapýyoruz
		ArrayList<String> list= new ArrayList<String>();
		
		//2. yol olarak buþekilde yapýyoruz
		ArrayList<String> list1=new ArrayList<>();
		
		//3. yol olarak list þu lekilde olýuþturuyoruz, en ayygýný bu
		List<String> list3=new ArrayList<>(); 
		
		//ADD METODU ÖÐREN
		
		list3.add("Ahmet");
		list3.add("kazým");
		list3.add("behüce");
		//list nASIL YAZDIRILIYOR--->array de Array.to string ti butrda normal
		System.out.println(list3);
		//[Ahmet, kazým, behüce]
		
		System.out.println("*************************");
		
		//noktaya basýp 2. seçeneðe týklayalým
		
		list3.add(1, "Can");//--> 0 index i ile 1. index arasýna Can ý koyacaktýr ve can 1. index olacak
		System.out.println(list3);
		//[Ahmet, Can, kazým, behüce]
		
		System.out.println("***********************");
		
		list3.add(1, "Behram");
		System.out.println(list3);
		//[Ahmet, Behram, Can, kazým, behüce]
		
		System.out.println("*********************");
		
		list3.add(4, "Beyce");
		System.out.println(list3);
		//[Ahmet, Behram, Can, kazým, Beyce, behüce]
		
		System.out.println("*************************");
		
				//01 deki soruya tekrar bakalým
		
				//Soru 6) Verilen bir Array’den isten degere esit olan elamanlari kaldirip, 
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
