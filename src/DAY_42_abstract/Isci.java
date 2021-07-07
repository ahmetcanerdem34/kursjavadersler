package DAY_42_abstract;

public class Isci extends Personel{
	public static void main(String[] args) {
		
		
		Isci isci1=new Isci();
		isci1.maasHesapla();
		isci1.mesaiHesapla();
		isci1.isim="Rumeysa";//abstruct parent class daki variableleri istersem kullanýrým
		System.out.println(isci1.isim);//Rumeyasa yazdýrýr
		//System.out.println(isim);
		isci1.ozelSigorta();//abstruct parent clas daki concrete methodu istersem kullanýrým
							//bu methodu override etmedik ama parent child iliþkisi ile kullanabildik
		
//		iþçileriçin maaþ 5000 tl
//		iþçiler 8 saat mesai ile çalýþýrlar
//		Rumeysa
//		bu personel ozel sigorta kapsamýndadýr

		
		
	}

	@Override
	public void maasHesapla() {
		//parent class daki abstruct methodu implement (uyarlama) etti
		//1- sen abstruct bir class ý parent edindiysen mutlaka oradaki abstruct methodu implement etmelisin
		//2-parent class tadaki method da body olmadýðý için onu kulalanmanýn anlamý yok
		//biz child class da body olan method(concrete) kullanýp iþlem yapmalýyýz
		System.out.println("iþçileriçin maaþ 5000 tl");
		
	}

	@Override
	public void mesaiHesapla() {
		System.out.println("iþçiler 8 saat mesai ile çalýþýrlar");
		
	}

}
