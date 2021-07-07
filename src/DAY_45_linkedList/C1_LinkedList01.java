package DAY_45_linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C1_LinkedList01 {

	public static void main(String[] args) {
		/*
		 /*
          3 Temel yapimiz vardir. 
          1) List 
          
          2) Queue : Elemanlari siraya koyar. Siz Queue'ya bir eleman eklediniz diyelim ,
          ikinci eleman koymak isterseniz onu 1'in arkasina koyar, hepsini bir siraya sokar (Yemekhane sirasi gibi) . Bir elemani 
          cikarmak isterseniz ortada ki elemanlari cikaramazsiniz sadece ilk elemani cikarabilirsiniz. 
          Buna FIFO denir yani First In First Out . 
          
          3) Set : Matematikdeki kume gibidir. Var olmayan elemana eklersiniz fakat olan elemanyani ekleyemezsiniz (Tekrarli elemanlar)
          Yani set dendigi zaman tekrarli eleman olmayacak. Set'te index yapisi ve siralama yoktur.
          
          - Her bir temel yapi bazi ozellikleri alabilir.
          
          Bunlar disinda da onemli ozelliklerim vardir : 
          
          1) Linked : Birbirine bagli demektir. Bir tane elemanimiz olsun, ikinci bir eleman ekledigimizde onu 1.elemana baglar,
          ucuncu bir eleman eklemek istersek onu 2'e bagliyor. Araya elemanlar ekleyebiliriz sagindaki ve solundaki elemana baglanir.
          Siralama her an degisebilir. Yeni elemani sona ekler. Herhangi bir elemani silebiliriz.
          
          2) Hash : Her eleman olmasi gereken yerdedir. Biraz farkli bir yapidadir, yazamayacagim :D
          
          3) Tree : Dogal sirali demektir. {3, 6} diye kumem olsun . Bu kumeye 7'yi eklemek istersem java onu siralamaya gore koyar.
          {3,6,7} yapar . 5 eklemek istedigim zaman {3,5,6,7} . Negatif tarafi yavastir cunku her elemani kontrol eder ve ona gore sayiyi koyar,
          burda yorar.
          
          4) Queue (ozellik olarak da soyleyebilirim) 
         */

		//linked baðlý demktir
		//linked list te tüm elemanlar tren gibi birbirine baðlýdýr
		//baþta tek bir eleman vardýr, arkasýndakiler ona baðlýdýr ve ve 2 þer kýsýmdan oluþur
		//head sadece adres içerir, diðer arkadaki adres (pointer) ve value içerir
		
		
		//collections da obje oluþturuken oluþturmak istediðimiz collection ýn class mý yoks ainterface mý olduðuna baklmalýyz
		//eðer oluþturmak istediðimiz collection interface ise data turu olarak ointrface i, constructor olarak ise uygun bir class seçmeliyiz
		//þimdiye kadar List(interface) oluþtururken constructor oluþturuken ArrayList seçiyorduk, sebebi bu
		List<String> liste = new ArrayList<>();
		liste.add("A");
		liste.add("Y");//[X,Y]
		
		LinkedList<String> ll1= new LinkedList<>();
		
		ll1.add("A");
		ll1.add("B");
		System.out.println(ll1);//[A, B]-->a dan sonra arkasýna baðladý b yi
		ll1.add(1, "C");//
		System.out.println(ll1);//[A, C, B]
		ll1.addAll(liste);//önceki listenin tamamýnýda ekleeye biliyoruz
		System.out.println(ll1);//[A, C, B, A, Y]
		
		ll1.addAll(2,liste);//2. indexe listeyi ekleyeip diðerlerini öteledi
		System.out.println(ll1);//[A, C, A, Y, B, A, Y]
		
		ll1.add("K");
		System.out.println(ll1);//[A, C, A, Y, B, A, Y, K]
		// LinkedList List ve Queue interfacelerine implement ile child olduðundan
		//her 2 interfacedeki tum methodlarý ovverride etmek zorundadýr
		//islev olarak ayný iþi yapan adaLast(9 queue dan ve add() ise List den inherit edilmiþtir
		
		//ben bir linkedList oluþturmak istiyorum ama sadece List özelliklerini taþýsýn
		
		List<String> listlist = new LinkedList<>();//bununla sadece List tekileri aldýk
		listlist.add("Sadece lstten gelen özelliklerr var");
		
		//ben bir linkedList oluþturmak istiyorum ama sadece Queue özellikleri taþýsýn
		Queue<String> queueList = new LinkedList<>();//bunda sadece Queue dekileri aldýk
		queueList.add("Sadece queue ten gelen özellikler var");
		
		//2 parent a gidince azelliklerini aaltmýþ olduk
		
		
		
		
	}

}
