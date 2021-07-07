package DAY_37;

public class GeciciIsci  extends Isci{
	public String calistigiBolum="Yemekhane";
	public static void main(String[] args) {

		//bugunk� konu overriding=override=ge�ersiz k�lmak==>overriden= ge�ersiz k�l�nan
		
		//bir child clastan miras al�nan methodu de�i�tirmeye overriding denir.

	
	GeciciIsci gi1 = new GeciciIsci();
	System.out.println(	gi1.maasHesapla());
	gi1.mesai();
	
	}

	//overriding yapmak i�in parent class daki method signature i ile child class da bir method olu�turulur
	//b�ylece parent class daki method child class i�in ge�ersiz hale gelir
	//signeture ayn� oldu�undan adece body de�i�ir
	public int maasHesapla() {
		return 30*8*10;
	}

	@Override//annotation
	public void mesai() {
		//super.mesai();//bu parent a do�rudan g�t�r�yordu
		System.out.println("ge�ici i��iler 25 saat �al���r");
//		isciler gunluk 8 saat calisir
//		ge�ici i��iler 25 saat �al���r
		
		//annotation : dipnot, a��klama
		//annotation olmas� ile olmamas� aras�ndaki fark
		//annotation sadece bir a��klma de�ldir
		//override yapt���m�z methodu s�rekli kontrol eder 
		//ve parent clas daki oveerriden method signature si de�i�tirilirse CTE verir 
		
		//java 28. sat�rda kodu inceleyenler i�in 1 a��klam getiriyor
		//override edilen parent class daki method(overriden)un da cal��mas�n� istiyorsak 
		//overriding method un ilk dat�r�na super. overriden method ismi yazar�z
		//e�er overriding method da ilk sat�r�na super.yaz�lmazsa
		//overridden method �al��maz
	
		//Acces Modifier
		//Child Parent � s�n�rland�ramaz
		//yani overriding methodun acces modifier i overridden method un acces modifier indan dah dar olamaz
		
		//Retur type
		//overridden method un return typ � primite ise overriding methodun return typ � da ayn� olmak zorunda
		//e�er return typ� primtive de�ilse 
		//(overriding methodun return typ�) IS-A  (overridden methodun return typ� ) olmal�d�r 
	}
}
