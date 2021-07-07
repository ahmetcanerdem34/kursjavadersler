package Java_PracticeDay2;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class SoruArray03 {

	public static void main(String[] args) {
		/*
		* Kullanicidan int  list uzunlugunu isteyin
		 * Listin uzunlugu kadar kullanicidan list elemanlarini girmesini isteyin
		 * Tekrarli list elemanlarindan yeni bir list olusturan ve  yazdiran metod yazin
		 * 
		 * 
		 *  n = 5 icin (listin uzunlugu);
		 * input { 1 , 2 , 2 , 3 , 4}
		 * output {2}
		 * 
		 */
		Scanner scan = new Scanner (System.in);
		System.out.println("array list uzunlu�unu giriniz :");
		int listlength=scan.nextInt();
		
		//list olu�tural�m, ki�iden eleman isteyelim
		List<Integer> list = new ArrayList<>();
		System.out.println("array list uzunlu�unu kadar say� giriniz :");
		
		//for la ka�tane girece�ine bakal�m ve alal�m
		
		for (int i = 0; i < listlength; i++) {
			list.add(scan.nextInt());//elemanlar� kullan�c� girecek
			
		}
		
		tekrarliEleman(list);

		scan.close();
		///ayn� elemanlar� bulacak method yazal�m
	}
	
	public static void tekrarliEleman(List<Integer> ls) {
		
		List<Integer> tekrarliList = new ArrayList<>();
		
		for (int i = 0; i < ls.size(); i++) {//list te uzunluk yok size var
			
			for (int j = i + 1; j < ls.size(); j++) {//niye i + 1 =0 s�f�rdan ba�larsa yn� elemanlar� tekrar gibi d���n�r
				
				if(ls.get(i)== ls.get(j) && !tekrarliList.contains(ls.get(i))) {//get getir bak anlam�nda
					
					tekrarliList.add(ls.get(i));
					
				}
				
			}
			
		}
		System.out.println("tekral� listin elemanlar� :" + tekrarliList);
//		array list uzunlu�unu giriniz :
//			7
//			array list uzunlu�unu kadar say� giriniz :
//			1
//			2
//			3
//			3
//			3
//			4
//			5
//			tekral� listin elemanlar� :[3]//sadece 3 � tekrar ediyor anlam�nda
	}

}
