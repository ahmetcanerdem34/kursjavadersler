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

		//linked ba�l� demktir
		//linked list te t�m elemanlar tren gibi birbirine ba�l�d�r
		//ba�ta tek bir eleman vard�r, arkas�ndakiler ona ba�l�d�r ve ve 2 �er k�s�mdan olu�ur
		//head sadece adres i�erir, di�er arkadaki adres (pointer) ve value i�erir
		
		
		//collections da obje olu�turuken olu�turmak istedi�imiz collection �n class m� yoks ainterface m� oldu�una baklmal�yz
		//e�er olu�turmak istedi�imiz collection interface ise data turu olarak ointrface i, constructor olarak ise uygun bir class se�meliyiz
		//�imdiye kadar List(interface) olu�tururken constructor olu�turuken ArrayList se�iyorduk, sebebi bu
		List<String> liste = new ArrayList<>();
		liste.add("A");
		liste.add("Y");//[X,Y]
		
		LinkedList<String> ll1= new LinkedList<>();
		
		ll1.add("A");
		ll1.add("B");
		System.out.println(ll1);//[A, B]-->a dan sonra arkas�na ba�lad� b yi
		ll1.add(1, "C");//
		System.out.println(ll1);//[A, C, B]
		ll1.addAll(liste);//�nceki listenin tamam�n�da ekleeye biliyoruz
		System.out.println(ll1);//[A, C, B, A, Y]
		
		ll1.addAll(2,liste);//2. indexe listeyi ekleyeip di�erlerini �teledi
		System.out.println(ll1);//[A, C, A, Y, B, A, Y]
		
		ll1.add("K");
		System.out.println(ll1);//[A, C, A, Y, B, A, Y, K]
		// LinkedList List ve Queue interfacelerine implement ile child oldu�undan
		//her 2 interfacedeki tum methodlar� ovverride etmek zorundad�r
		//islev olarak ayn� i�i yapan adaLast(9 queue dan ve add() ise List den inherit edilmi�tir
		
		//ben bir linkedList olu�turmak istiyorum ama sadece List �zelliklerini ta��s�n
		
		List<String> listlist = new LinkedList<>();//bununla sadece List tekileri ald�k
		listlist.add("Sadece lstten gelen �zelliklerr var");
		
		//ben bir linkedList olu�turmak istiyorum ama sadece Queue �zellikleri ta��s�n
		Queue<String> queueList = new LinkedList<>();//bunda sadece Queue dekileri ald�k
		queueList.add("Sadece queue ten gelen �zellikler var");
		
		//2 parent a gidince azelliklerini aaltm�� olduk
		
		
		
		
	}

}
