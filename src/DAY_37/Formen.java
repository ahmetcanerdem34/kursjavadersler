package DAY_37;

public class Formen extends Isci{
	//bu class ta tek bildgi olsun
	
	public String sorumluOlduguBolum="bak�m";
	public String isim="Emrullah";
	
	
	public static void main(String[] args) {
		//�nheritance da data turu olarak class ismi kullan�m�
		
		//bir class da obje uretirken data turu olarak class �n kendisini 
		//veya parentlar�n� kullanabiliriz
		//olu�turdu�umuz obje ile variable kullanmam�z gerekirse , hangi de�eri
		//alaca��n� nalmak i�in once data turu olan class a girderiz
		//orada arad���m�z variable varsa kullan�r�z, yoksa parentlar�na bakar�z
		//yukar� giderken ilk buldu�umuz de�eri kullan�r�z
		
		Formen fr1= new Formen();//fr1 objesini kullanrank hangi class lar�n variablelerini kullanabilirim
		fr1.sorumluOlduguBolum="Marangozhane";
		fr1.maas=10000;
		System.out.println(fr1.isim+" "+fr1.sorumluOlduguBolum+" "+fr1.maas);//atama yapmad�ysak ilk de�erleri g�r�r�rm
		//Emre Marangozhane 10000
		
		Isci fr2=new Formen();//data turu i��i�NEML�=verdi�imiz ismin soldaki tipine her t�rl� data t�r� diYoruz
		//boylede kullan�l�r ama data turu olarak i��i s�n�f�n� ve dah yukar�s�n� g�r�r� ama i�inde oldu�umuz formenden bi�ey g�remeyiz
		fr2.bolum="Kaynak Atolyesi";
		//burdakifr2.ismi kald�rd�k
		System.out.println(fr2.isim+" "+fr2.bolum+" "+fr2.maas);//fr2.sorumluOlduguBolum= hata verdi ��nk� formende
		//Yakup Kaynak Atolyesi 5000
		
		Personel fr3=new Formen();
		System.out.println(fr3.isim);//Emre
		
	
	
	}

}
