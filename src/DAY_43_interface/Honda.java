package DAY_43_interface;

public abstract class Honda {
	
	/*
	 1-interface lerde concrete(somut beton) methodlar kullan�lamaz
	 -sadece abstract(soyut) methodlar kullan�labilir
	 -interface ler SADECE  mecbur yap�lmas� gerekenleri depolamak i�in kullan�l�r
	 
	 2-Java Multiple inheritance � desteklemez ma parentlar class ise desteklemez. 
	 -parentler interface ise, Ja Multiple intheritiance � destekler
	 
	 3-birden fazla parent class oldu�unda farkl� parent class larda yn� isimli farl� body li methodlar�n olmas� mumkundur. 
	 -bu tur durumlarda child class ayn� isimli farkl� body l� methdlardan hangisini kullanca��na karar veremez, 
	 -fakat interfacelerde method lar�n body leri olmad���nda ayn� isimli methodlar b�rb�r�n�n tamam�yla ayn�s�d�or
	 -bu methodlardan b�r�n� overr�de etmek hepsini override etmek manas�na gelir
	 
	  4-parent interface ler i�inde ayn� method s�gnature sahip ama return typlar� farkl� methodlar varsa Java interface ler i�in de CTE verir
	  
	  5-�NTERFACE CLASS DE��LD�R-- �NTERFACE �NTERFACE D�R, �NTERV�EW SORUSU
	  
	 */
	public abstract void hareket();

	public void dizel() {
	System.out.println("motrin kullan�r");
	
}
	public void benzin () {

		
		System.out.println("benzin kullan�r");
	}
	
	
}
