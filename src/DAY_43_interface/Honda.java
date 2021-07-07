package DAY_43_interface;

public abstract class Honda {
	
	/*
	 1-interface lerde concrete(somut beton) methodlar kullanýlamaz
	 -sadece abstract(soyut) methodlar kullanýlabilir
	 -interface ler SADECE  mecbur yapýlmasý gerekenleri depolamak için kullanýlýr
	 
	 2-Java Multiple inheritance ý desteklemez ma parentlar class ise desteklemez. 
	 -parentler interface ise, Ja Multiple intheritiance ý destekler
	 
	 3-birden fazla parent class olduðunda farklý parent class larda yný isimli farlý body li methodlarýn olmasý mumkundur. 
	 -bu tur durumlarda child class ayný isimli farklý body lý methdlardan hangisini kullancaðýna karar veremez, 
	 -fakat interfacelerde method larýn body leri olmadýðýnda ayný isimli methodlar býrbýrýnýn tamamýyla aynýsýdýor
	 -bu methodlardan býrýný overrýde etmek hepsini override etmek manasýna gelir
	 
	  4-parent interface ler içinde ayný method sýgnature sahip ama return typlarý farklý methodlar varsa Java interface ler için de CTE verir
	  
	  5-ÝNTERFACE CLASS DEÐÝLDÝR-- ÝNTERFACE ÝNTERFACE DÝR, ÝNTERVÝEW SORUSU
	  
	 */
	public abstract void hareket();

	public void dizel() {
	System.out.println("motrin kullanýr");
	
}
	public void benzin () {

		
		System.out.println("benzin kullanýr");
	}
	
	
}
