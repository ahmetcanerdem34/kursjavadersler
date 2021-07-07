package DAY_52_nesneUygulamalar03;

import java.util.ArrayList;

public class OgrenciIslemleri {

	//��renci bilgilerini g�ster diye bir method olu�turup gidip main de �a��ral�m
	public void ogrenciBilgileriGoster(Ogrenci o ) {
		
		System.out.println("Ad� :" + o.getAdi());
		System.out.println("Soyad� :"+ o.getSoyadi());
		System.out.println("Dogum y�l� :" + o.getDogumYili());
		System.out.println("Okulu :" + Ogrenci.getOkulu());
		System.out.println("Okul numaras� :"+o.getOkulNumarasi());
		System.out.println("Ald�g� dersler :" + o.getDersler());
		
		
		
	}
	//yeni bir method olu�turarak ��renci nin ald��� derler aras�nda benim istedi�im ders var m� diye bakaca��z
	
	public void ogrenciDersArama(Ogrenci o,String ders) {
		
		boolean durum=true;
		ArrayList<String> dersler2 = o.getDersler();
		
		for(String d : dersler2) {
			
			if(d.equals(ders)) {
				
				System.out.println(o.getAdi() +" "+"adl� ��renci bu dersi al�yor "); 
				durum=false;
				break;
			}
		}
		if(durum) {
			
			System.out.println("Arad�g�n�z dersi bu ��renci alm�yor");
			
		}
	}
}
