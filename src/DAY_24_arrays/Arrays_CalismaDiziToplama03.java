package DAY_24_arrays;

import java.util.Scanner;

public class Arrays_CalismaDiziToplama03 {

	public static void main(String[] args) {
		
		int diziBoyut;
		int toplam=0;
		
		
		Scanner scan= new Scanner (System.in);
		
		System.out.print("Ka� elemanl� dizi olu�turacaks�n�z :");
		diziBoyut=scan.nextInt();
		
		//�imdi dizleri olu�truaca��z
		
		int sayilar[]= new int[diziBoyut];	//ki�inin girece�i boyut say�s� ki�i girince belli olacak	
		
		for (int i = 0; i < sayilar.length; i++) {//say�lar�n length i kadar �o�alacak, ki�i dizi boyuta ka� girerse buras� de�i�, 
												//buras� dinamik oldu yani
			
			System.out.print((i+1)+ ".elemean� giriniz :");
			sayilar[i]=scan.nextInt();
		
		}
		
		for (int i = 0; i < sayilar.length; i++) {
			
			toplam+=sayilar[i];
			
		}
		System.out.println("say�lar�n toplam� +"+ toplam);
		System.out.println("say�lar�n ortalamas� : " +(toplam/sayilar.length));
		
//		Ka� elemanl� dizi olu�turacaks�n�z :6
//		1.elemean� giriniz :4
//		2.elemean� giriniz :3
//		3.elemean� giriniz :4
//		4.elemean� giriniz :56
//		5.elemean� giriniz :43
//		6.elemean� giriniz :23
//		say�lar�n toplam� +133
//		say�lar�n ortalamas� : 22
		
		scan.close();

	}

}
