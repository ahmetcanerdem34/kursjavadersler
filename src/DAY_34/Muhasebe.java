package DAY_34;

//main methoduna gerek yok
public class Muhasebe extends Personel{//buray� yaz�nca personel muhasebenin parent clas�d�r, 
										//yada muhaseve personelin chiild s�n�f�d�r deriz
	
	//muhasebe class�n�n personel clas�n�n ch�ld class � oldu�unu 
	//declare etmek i�in class ismine extends keyword ile
	//parent class� yazar�z
	
	public int saatUcreti;
	public String statu;
	public int maas;
	public boolean izindeMi=false;
		public int maasHesapla() {
			
			maas=30*8*saatUcreti;
			
			return maas;
		}
}
