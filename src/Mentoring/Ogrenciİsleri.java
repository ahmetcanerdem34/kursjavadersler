package Mentoring;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ogrenci�sleri {
	
	
	
	public static List<String> ogrenciler =new ArrayList<>();
	public static void main(String[] args) {
		
		Scanner scan= new  Scanner(System.in);
		System.out.println("hangi i�lemi yapmak istersiniz\nOgrenci kay�r\n2ogrenci g�r�nt�le\n3ogrenci silme\n4 c�k��");
		
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
			System.out.println("yanl�� giri� yapt�n�z");
		
		
		}
		
	}
	public static void orenciKayit() {
		System.out.println("ogrenci numaras� ad�n� soyad�n� ve ortalamas�n� giriniz");
	
		
		OgrenciOlusturma ogrenci= new OgrenciOlusturma();
		
	}
	public static void ogrenciGoruntuleme() {
		
		
	}
	public static void ogrenciSilme() {
		
		
	}
	public static void cikis() {
		
		
	}
}
