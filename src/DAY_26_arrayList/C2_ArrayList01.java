package DAY_26_arrayList;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C2_ArrayList01 {

	public static void main(String[] args) {
		
		//bir array list nas�l olu�turulur
		
		//array list bir objedir, dolay�s�yla yeni bir tane olu�turmak i�innew kelimesine ihtiya� duyar�z keywordumuz
		
		//1.yol
		ArrayList<String> list1 =new ArrayList<String>();//arrayde[] k��eli, bunda <> kucuktur buyuktur iareti
		
		//2.yol
		ArrayList<String> list2=new ArrayList<>();//2. yolda string yaz�s�  yok
		
		//3.yol
		List<String> list3=new ArrayList<>(); //en �ok 3. bu yokl kullan�lr
		
		//not: e�er constructor olarak List<>() kullan�rsa CTE verir
		//List<>() constructur olarak kullan�lmaz,//List<String> list4=new List<>();
		
		//�NEML� :Olusturdugumuz Class isimleri Java'da kullanilan obje isimleri ile AYNI OLMAMALIDIR
		
		//ADD METODU ��REN
		
		//List e eleman ekleme
		//List olu�turuken otomatik olarak eleman ekleme �zelli�i yoktur
		//eleamnlar�n tek tek eklenmesi gerekir
		//list3 yaz . noktaya bas
		list3.add("Ali");
		list3.add("Veli");
		list3.add("Ay�e");   
		
		//list nas�l yazd�r�l�r
		
		System.out.println(list3);
       //list3 demek yeterli array e g�re kolay	
		
		//[Ali, Veli, Ay�e]//k��eli ve , virg�ll� yazd�r�r
		
		//noktaya bas�p 2 s�radakini t�klarsak
		list3.add(1, "Can");//1. indeks le 2. indek aras�na  can koyar
		
		System.out.println(list3);
		//[Ali, Can, Veli, Ay�e]
		
		list3.add(1, "Fatma");//
		System.out.println(list3);
		//[Ali, Fatma, Can, Veli, Ay�e]
		
		
		//01 deki soruya tekrar bakal�m
		
		//Soru 6) Verilen bir Array�den isten degere esit olan elamanlari kaldirip, 
	       //  kalanlari yeni bir  Array olarak yazdiran bir method yaziniz
		
		int arr[]= {2,3,5,3,6,4,3,6,7};
		int sayi=6;	
		
		List<Integer>istenenList=new ArrayList<>();//wrapper clastan Integer i yaz�yoruz int i de�il
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=sayi){
				istenenList.add(arr[i]);
			}
			
		}
		System.out.println(istenenList);
		//[2, 3, 5, 3, 4, 3, 7]
		
		
		
		
		
		
		
		
		
		
		
	}

}
