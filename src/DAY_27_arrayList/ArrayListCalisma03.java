package DAY_27_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListCalisma03 {

	public static void main(String[] args) {
	
		

		//kullanýcýdan pozitif bir tamsayý alýn
		//aldýðýnýz sayýdan küçük olna fibonacci dizisi elemanlarýný yazdýrýn
		
		//1 1 2 3 5 8 
		//sayýmýz  olsun mesela
		
		//kullanýcýdan sayý alalým
		
		Scanner scan=new Scanner(System.in);
		System.out.println("pozitif ibr tamsayý giriniz :");
		int sayi=scan.nextInt();
		
		List<Integer> fibo=new ArrayList<>();
		fibo.add(1);
		fibo.add(1);
		
		
		System.out.println(fibo);
//		pozitif ibr tamsayý giriniz :
//			5----->grilen sayýyya kadar fibonacci hesaplanacak
//			[1, 1]
		
		
		System.out.println(fibo.get(0) + fibo.get(1));//bunu sonucu 2 zaten ilk 2 sayý1 olduðu için buradan baþlayacak
		
		for (int i = 2; (fibo.get(0) + fibo.get(1))< sayi; i++) {
			
			fibo.add((fibo.get(i-2) + fibo.get(i-1)));
			
			
		}
		System.out.println(fibo);
	}

}
