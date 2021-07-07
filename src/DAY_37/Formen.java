package DAY_37;

public class Formen extends Isci{
	//bu class ta tek bildgi olsun
	
	public String sorumluOlduguBolum="bakým";
	public String isim="Emrullah";
	
	
	public static void main(String[] args) {
		//ýnheritance da data turu olarak class ismi kullanýmý
		
		//bir class da obje uretirken data turu olarak class ýn kendisini 
		//veya parentlarýný kullanabiliriz
		//oluþturduðumuz obje ile variable kullanmamýz gerekirse , hangi deðeri
		//alacaðýný nalmak için once data turu olan class a girderiz
		//orada aradýðýmýz variable varsa kullanýrýz, yoksa parentlarýna bakarýz
		//yukarý giderken ilk bulduðumuz deðeri kullanýrýz
		
		Formen fr1= new Formen();//fr1 objesini kullanrank hangi class larýn variablelerini kullanabilirim
		fr1.sorumluOlduguBolum="Marangozhane";
		fr1.maas=10000;
		System.out.println(fr1.isim+" "+fr1.sorumluOlduguBolum+" "+fr1.maas);//atama yapmadýysak ilk deðerleri görürürm
		//Emre Marangozhane 10000
		
		Isci fr2=new Formen();//data turu iþçiÖNEMLÝ=verdiðimiz ismin soldaki tipine her türlü data türü diYoruz
		//boylede kullanýlýr ama data turu olarak iþçi sýnýfýný ve dah yukarýsýný görürü ama içinde olduðumuz formenden biþey göremeyiz
		fr2.bolum="Kaynak Atolyesi";
		//burdakifr2.ismi kaldýrdýk
		System.out.println(fr2.isim+" "+fr2.bolum+" "+fr2.maas);//fr2.sorumluOlduguBolum= hata verdi çünkü formende
		//Yakup Kaynak Atolyesi 5000
		
		Personel fr3=new Formen();
		System.out.println(fr3.isim);//Emre
		
	
	
	}

}
