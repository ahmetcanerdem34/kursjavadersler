package DAY_22_consractor;

public class DogTest01 {

	public static void main(String[] args) {
		
		
		//nesneler new anahtar kelimesiyle olu�turuluyor
		//de�erler main de verilir , main de yazd�r�l�r
		
		Dog k�pek = new Dog();//t�r�m�z dog de�i�ken ad� k�pek, k�pek s�n�f�n�n �zelliklerini yazaca��z
		
		k�pek.cins="�oban K�pe�i ";
		k�pek.cinsiyet="Erkek";
		k�pek.ulke="T�rkiye";
		k�pek.sehir="Sivas";
		k�pek.renk="Beyaz";
		k�pek.yas=2021-5;
		k�pek.fiyat=2500;
		
		
		System.out.println(k�pek.cins);
		System.out.println(k�pek.cinsiyet);
		System.out.println(k�pek.ulke);
		System.out.println(k�pek.sehir);
		System.out.println(k�pek.renk);
		System.out.println("Dopym y�l�:" +k�pek.yas);
		System.out.println(k�pek.fiyat);
//		�oban K�pe�i 
//		Erkek
//		T�rkiye
//		Sivas
//		Beyaz
//		Dopym y�l�:2016
//		2500
		
		System.out.println("****************************");
		
		//k�peklerin cinsleri ayn� m� oluyor hay�r farkl� �zelliklerde k�peklerde yazal�m
		
		Dog k�pek2 = new Dog();//t�r�m�z dog de�i�ken ad� k�pek2, k�pek s�n�f�n�n �zelliklerini yazaca��z
		
		k�pek2.cins="Pitbul Staffordshire Bullterrier";
		k�pek2.cinsiyet="Di�i";
		k�pek2.renk="K�rm�z�";
		k�pek2.ulke="Amerika";
		k�pek2.fiyat=5000;
		k�pek2.yas=5;
		
		System.out.println(k�pek2.cins);
		System.out.println(k�pek2.cinsiyet);
		System.out.println(k�pek2.renk);
		System.out.println(k�pek2.ulke);
		System.out.println(k�pek2.fiyat);
		System.out.println(k�pek2.yas);
//		Pitbul Staffordshire Bullterrier
//		Di�i
//		K�rm�z�
//		Amerika
//		5000
//		5
//		
		
		
		
		
		
		
		
		
	}

}
