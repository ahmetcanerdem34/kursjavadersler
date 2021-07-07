package Mentoring;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OgrenciÝsleri {
	
	
	
	public static List<String> ogrenciler =new ArrayList<>();
	public static void main(String[] args) {
		
		Scanner scan= new  Scanner(System.in);
		System.out.println("hangi iþlemi yapmak istersiniz\nOgrenci kayýr\n2ogrenci görüntüle\n3ogrenci silme\n4 cýkýþ");
		
		int secim=scan.nextInt();
		
		switch(secim) {
		case 1:
			orenciKayit();
			break;
		case 2:	
			ogrenciGoruntuleme();
			break;
		case 3:	
			ogrenciSilme();
			break;
		case 4:
			cikis();
			break;
		default :
			System.out.println("yanlýþ giriþ yaptýnýz");
		
		
		}
		
	}
	public static void orenciKayit() {
		System.out.println("ogrenci numarasý adýný soyadýný ve ortalamasýný giriniz");
	
		
		OgrenciOlusturma ogrenci= new OgrenciOlusturma();
		
	}
	public static void ogrenciGoruntuleme() {
		
		
	}
	public static void ogrenciSilme() {
		
		
	}
	public static void cikis() {
		
		
	}
}
