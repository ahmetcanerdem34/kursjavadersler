package DAY_27_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListCalisma03 {

	public static void main(String[] args) {
	
		

		//kullan�c�dan pozitif bir tamsay� al�n
		//ald���n�z say�dan k���k olna fibonacci dizisi elemanlar�n� yazd�r�n
		
		//1 1 2 3 5 8 
		//say�m�z  olsun mesela
		
		//kullan�c�dan say� alal�m
		
		Scanner scan=new Scanner(System.in);
		System.out.println("pozitif ibr tamsay� giriniz :");
		int sayi=scan.nextInt();
		
		List<Integer> fibo=new ArrayList<>();
		fibo.add(1);
		fibo.add(1);
		
		
		System.out.println(fibo);
//		pozitif ibr tamsay� giriniz :
//			5----->grilen say�yya kadar fibonacci hesaplanacak
//			[1, 1]
		
		
		System.out.println(fibo.get(0) + fibo.get(1));//bunu sonucu 2 zaten ilk 2 say�1 oldu�u i�in buradan ba�layacak
		
		for (int i = 2; (fibo.get(0) + fibo.get(1))< sayi; i++) {
			
			fibo.add((fibo.get(i-2) + fibo.get(i-1)));
			
			
		}
		System.out.println(fibo);
	}

}
