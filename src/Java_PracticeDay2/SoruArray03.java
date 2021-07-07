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
		System.out.println("array list uzunluðunu giriniz :");
		int listlength=scan.nextInt();
		
		//list oluþturalým, kiþiden eleman isteyelim
		List<Integer> list = new ArrayList<>();
		System.out.println("array list uzunluðunu kadar sayý giriniz :");
		
		//for la kaçtane gireceðine bakalým ve alalým
		
		for (int i = 0; i < listlength; i++) {
			list.add(scan.nextInt());//elemanlarý kullanýcý girecek
			
		}
		
		tekrarliEleman(list);

		scan.close();
		///ayný elemanlarý bulacak method yazalým
	}
	
	public static void tekrarliEleman(List<Integer> ls) {
		
		List<Integer> tekrarliList = new ArrayList<>();
		
		for (int i = 0; i < ls.size(); i++) {//list te uzunluk yok size var
			
			for (int j = i + 1; j < ls.size(); j++) {//niye i + 1 =0 sýfýrdan baþlarsa yný elemanlarý tekrar gibi düþünür
				
				if(ls.get(i)== ls.get(j) && !tekrarliList.contains(ls.get(i))) {//get getir bak anlamýnda
					
					tekrarliList.add(ls.get(i));
					
				}
				
			}
			
		}
		System.out.println("tekralý listin elemanlarý :" + tekrarliList);
//		array list uzunluðunu giriniz :
//			7
//			array list uzunluðunu kadar sayý giriniz :
//			1
//			2
//			3
//			3
//			3
//			4
//			5
//			tekralý listin elemanlarý :[3]//sadece 3 ü tekrar ediyor anlamýnda
	}

}
