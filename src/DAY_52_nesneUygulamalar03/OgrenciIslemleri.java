package DAY_52_nesneUygulamalar03;

import java.util.ArrayList;

public class OgrenciIslemleri {

	//öðrenci bilgilerini göster diye bir method oluþturup gidip main de çaðýralým
	public void ogrenciBilgileriGoster(Ogrenci o ) {
		
		System.out.println("Adý :" + o.getAdi());
		System.out.println("Soyadý :"+ o.getSoyadi());
		System.out.println("Dogum yýlý :" + o.getDogumYili());
		System.out.println("Okulu :" + Ogrenci.getOkulu());
		System.out.println("Okul numarasý :"+o.getOkulNumarasi());
		System.out.println("Aldýgý dersler :" + o.getDersler());
		
		
		
	}
	//yeni bir method oluþturarak öðrenci nin aldýðý derler arasýnda benim istediðim ders var mý diye bakacaðýz
	
	public void ogrenciDersArama(Ogrenci o,String ders) {
		
		boolean durum=true;
		ArrayList<String> dersler2 = o.getDersler();
		
		for(String d : dersler2) {
			
			if(d.equals(ders)) {
				
				System.out.println(o.getAdi() +" "+"adlý öðrenci bu dersi alýyor "); 
				durum=false;
				break;
			}
		}
		if(durum) {
			
			System.out.println("Aradýgýnýz dersi bu öðrenci almýyor");
			
		}
	}
}
