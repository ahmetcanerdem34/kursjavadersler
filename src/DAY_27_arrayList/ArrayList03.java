package DAY_27_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList03 {

	public static void main(String[] args) {
		
		//kullan�c�dan pozitif bir tamsay� al�n
		//ald���n�z say�dan k���k olna fibonacci dizisi elemanlar�n� yazd�r�n
		
		//1 1 2 3 5 8 
		//say�m�z  olsun mesela
		
		//kullan�c�dan say� alal�m
		
		Scanner scan=new Scanner(System.in);
		System.out.println("pozitif ibr tamsay� giriniz :");
		int sayi=scan.nextInt();
		
		//kullan�c�n�n ka� girece�ini bilmiyoruz
		//en do�rusu list le yapmak
		
		List<Integer> fibo=new ArrayList<>();
		fibo.add(1);//2 tane bir ekleyelim bunlar kurals�n en ba�ta varlar zaten
		fibo.add(1);
				
		//3. eleman� bulmak i�in ne yapmal�y�m
		System.out.println(fibo);
//		pozitif ibr tamsay� giriniz :
//			5
//			[1, 1]
		
		System.out.println("************************");
		
		//get. y� kullanarak 0 ve 1 dekini kullanabiliriz
		
		System.out.println(fibo.get(0) + fibo.get(1));
		
		
		for (int i = 2; fibo.get(i-2) + fibo.get(i-1)< sayi; i++) {//2 den ba�lad�k ��nk� �ncesine 1+1 2 ordan ba�lam�� olduk
			
			fibo.add(fibo.get(i-2) + fibo.get(i-1));
			//[1, 1, 2, 3, 5, 8, 13]
			
		}
		System.out.println(fibo);
		
		//while ile ��z�m�
		int i=2;
		int yeniSayi=0;//buras� ge�ici local bir say�d�r bunu vermeliyimki java kar��la�t�rs�n
		while(yeniSayi<sayi) {
			
			yeniSayi=fibo.get(i-2)+ fibo.get(i-1);
			fibo.add(yeniSayi);
			i++;
			
			
		}
		System.out.println(fibo);
		
		//ba�ka bir �rnek
		
		for (i=2; fibo.get(i-2)+fibo.get(i-1)<sayi;i++){}
//      1        + 1           <55---------->2
//      1        + 2           <55---------->3
//      2        + 3           <55---------->5 
//      3        + 5           <55---------->8
//      .
//      .
//      13      + 21          <55----------->34
//      21      + 32          <55 ---------->55 istenilen say�ya kendisinden �nceki iki say�n�n 
//                                              toplam�yla ula�t�k, o y�zden 
//       s�ralay�nca   1 1 2 3 5 8 13 21 34 55 ��kar
	}

}
