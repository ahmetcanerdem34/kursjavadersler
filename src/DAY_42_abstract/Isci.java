package DAY_42_abstract;

public class Isci extends Personel{
	public static void main(String[] args) {
		
		
		Isci isci1=new Isci();
		isci1.maasHesapla();
		isci1.mesaiHesapla();
		isci1.isim="Rumeysa";//abstruct parent class daki variableleri istersem kullan�r�m
		System.out.println(isci1.isim);//Rumeyasa yazd�r�r
		//System.out.println(isim);
		isci1.ozelSigorta();//abstruct parent clas daki concrete methodu istersem kullan�r�m
							//bu methodu override etmedik ama parent child ili�kisi ile kullanabildik
		
//		i��ileri�in maa� 5000 tl
//		i��iler 8 saat mesai ile �al���rlar
//		Rumeysa
//		bu personel ozel sigorta kapsam�ndad�r

		
		
	}

	@Override
	public void maasHesapla() {
		//parent class daki abstruct methodu implement (uyarlama) etti
		//1- sen abstruct bir class � parent edindiysen mutlaka oradaki abstruct methodu implement etmelisin
		//2-parent class tadaki method da body olmad��� i�in onu kulalanman�n anlam� yok
		//biz child class da body olan method(concrete) kullan�p i�lem yapmal�y�z
		System.out.println("i��ileri�in maa� 5000 tl");
		
	}

	@Override
	public void mesaiHesapla() {
		System.out.println("i��iler 8 saat mesai ile �al���rlar");
		
	}

}
