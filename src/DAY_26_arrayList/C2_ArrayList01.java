package DAY_26_arrayList;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C2_ArrayList01 {

	public static void main(String[] args) {
		
		//bir array list nasýl oluþturulur
		
		//array list bir objedir, dolayýsýyla yeni bir tane oluþturmak içinnew kelimesine ihtiyaç duyarýz keywordumuz
		
		//1.yol
		ArrayList<String> list1 =new ArrayList<String>();//arrayde[] köþeli, bunda <> kucuktur buyuktur iareti
		
		//2.yol
		ArrayList<String> list2=new ArrayList<>();//2. yolda string yazýsý  yok
		
		//3.yol
		List<String> list3=new ArrayList<>(); //en çok 3. bu yokl kullanýlr
		
		//not: eðer constructor olarak List<>() kullanýrsa CTE verir
		//List<>() constructur olarak kullanýlmaz,//List<String> list4=new List<>();
		
		//ÖNEMLÝ :Olusturdugumuz Class isimleri Java'da kullanilan obje isimleri ile AYNI OLMAMALIDIR
		
		//ADD METODU ÖÐREN
		
		//List e eleman ekleme
		//List oluþturuken otomatik olarak eleman ekleme özelliði yoktur
		//eleamnlarýn tek tek eklenmesi gerekir
		//list3 yaz . noktaya bas
		list3.add("Ali");
		list3.add("Veli");
		list3.add("Ayþe");   
		
		//list nasýl yazdýrýlýr
		
		System.out.println(list3);
       //list3 demek yeterli array e göre kolay	
		
		//[Ali, Veli, Ayþe]//köþeli ve , virgüllü yazdýrýr
		
		//noktaya basýp 2 sýradakini týklarsak
		list3.add(1, "Can");//1. indeks le 2. indek arasýna  can koyar
		
		System.out.println(list3);
		//[Ali, Can, Veli, Ayþe]
		
		list3.add(1, "Fatma");//
		System.out.println(list3);
		//[Ali, Fatma, Can, Veli, Ayþe]
		
		
		//01 deki soruya tekrar bakalým
		
		//Soru 6) Verilen bir Array’den isten degere esit olan elamanlari kaldirip, 
	       //  kalanlari yeni bir  Array olarak yazdiran bir method yaziniz
		
		int arr[]= {2,3,5,3,6,4,3,6,7};
		int sayi=6;	
		
		List<Integer>istenenList=new ArrayList<>();//wrapper clastan Integer i yazýyoruz int i deðil
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=sayi){
				istenenList.add(arr[i]);
			}
			
		}
		System.out.println(istenenList);
		//[2, 3, 5, 3, 4, 3, 7]
		
		
		
		
		
		
		
		
		
		
		
	}

}
