package DAY_37;

public class GeciciIsci  extends Isci{
	public String calistigiBolum="Yemekhane";
	public static void main(String[] args) {

		//bugunkü konu overriding=override=geçersiz kýlmak==>overriden= geçersiz kýlýnan
		
		//bir child clastan miras alýnan methodu deðiþtirmeye overriding denir.

	
	GeciciIsci gi1 = new GeciciIsci();
	System.out.println(	gi1.maasHesapla());
	gi1.mesai();
	
	}

	//overriding yapmak için parent class daki method signature i ile child class da bir method oluþturulur
	//böylece parent class daki method child class için geçersiz hale gelir
	//signeture ayný olduðundan adece body deðiþir
	public int maasHesapla() {
		return 30*8*10;
	}

	@Override//annotation
	public void mesai() {
		//super.mesai();//bu parent a doðrudan götürüyordu
		System.out.println("geçici iþçiler 25 saat çalýþýr");
//		isciler gunluk 8 saat calisir
//		geçici iþçiler 25 saat çalýþýr
		
		//annotation : dipnot, açýklama
		//annotation olmasý ile olmamasý arasýndaki fark
		//annotation sadece bir açýklma deðldir
		//override yaptýðýmýz methodu sürekli kontrol eder 
		//ve parent clas daki oveerriden method signature si deðiþtirilirse CTE verir 
		
		//java 28. satýrda kodu inceleyenler için 1 açýklam getiriyor
		//override edilen parent class daki method(overriden)un da calýþmasýný istiyorsak 
		//overriding method un ilk datýrýna super. overriden method ismi yazarýz
		//eðer overriding method da ilk satýrýna super.yazýlmazsa
		//overridden method çalýþmaz
	
		//Acces Modifier
		//Child Parent ý sýnýrlandýramaz
		//yani overriding methodun acces modifier i overridden method un acces modifier indan dah dar olamaz
		
		//Retur type
		//overridden method un return typ ý primite ise overriding methodun return typ ý da ayný olmak zorunda
		//eðer return typý primtive deðilse 
		//(overriding methodun return typý) IS-A  (overridden methodun return typý ) olmalýdýr 
	}
}
