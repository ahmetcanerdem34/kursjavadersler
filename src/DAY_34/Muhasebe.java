package DAY_34;

//main methoduna gerek yok
public class Muhasebe extends Personel{//burayý yazýnca personel muhasebenin parent clasýdýr, 
										//yada muhaseve personelin chiild sýnýfýdýr deriz
	
	//muhasebe classýnýn personel clasýnýn chþld class ý olduðunu 
	//declare etmek için class ismine extends keyword ile
	//parent classý yazarýz
	
	public int saatUcreti;
	public String statu;
	public int maas;
	public boolean izindeMi=false;
		public int maasHesapla() {
			
			maas=30*8*saatUcreti;
			
			return maas;
		}
}
