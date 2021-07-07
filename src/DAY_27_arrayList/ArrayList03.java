package DAY_27_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList03 {

	public static void main(String[] args) {
		
		//kullanýcýdan pozitif bir tamsayý alýn
		//aldýðýnýz sayýdan küçük olna fibonacci dizisi elemanlarýný yazdýrýn
		
		//1 1 2 3 5 8 
		//sayýmýz  olsun mesela
		
		//kullanýcýdan sayý alalým
		
		Scanner scan=new Scanner(System.in);
		System.out.println("pozitif ibr tamsayý giriniz :");
		int sayi=scan.nextInt();
		
		//kullanýcýnýn kaç gireceðini bilmiyoruz
		//en doðrusu list le yapmak
		
		List<Integer> fibo=new ArrayList<>();
		fibo.add(1);//2 tane bir ekleyelim bunlar kuralsýn en baþta varlar zaten
		fibo.add(1);
				
		//3. elemaný bulmak için ne yapmalýyým
		System.out.println(fibo);
//		pozitif ibr tamsayý giriniz :
//			5
//			[1, 1]
		
		System.out.println("************************");
		
		//get. yý kullanarak 0 ve 1 dekini kullanabiliriz
		
		System.out.println(fibo.get(0) + fibo.get(1));
		
		
		for (int i = 2; fibo.get(i-2) + fibo.get(i-1)< sayi; i++) {//2 den baþladýk çünkü öncesine 1+1 2 ordan baþlamýþ olduk
			
			fibo.add(fibo.get(i-2) + fibo.get(i-1));
			//[1, 1, 2, 3, 5, 8, 13]
			
		}
		System.out.println(fibo);
		
		//while ile çözümü
		int i=2;
		int yeniSayi=0;//burasý geçici local bir sayýdýr bunu vermeliyimki java karþýlaþtýrsýn
		while(yeniSayi<sayi) {
			
			yeniSayi=fibo.get(i-2)+ fibo.get(i-1);
			fibo.add(yeniSayi);
			i++;
			
			
		}
		System.out.println(fibo);
		
		//baþka bir örnek
		
		for (i=2; fibo.get(i-2)+fibo.get(i-1)<sayi;i++){}
//      1        + 1           <55---------->2
//      1        + 2           <55---------->3
//      2        + 3           <55---------->5 
//      3        + 5           <55---------->8
//      .
//      .
//      13      + 21          <55----------->34
//      21      + 32          <55 ---------->55 istenilen sayýya kendisinden önceki iki sayýnýn 
//                                              toplamýyla ulaþtýk, o yüzden 
//       sýralayýnca   1 1 2 3 5 8 13 21 34 55 çýkar
	}

}
