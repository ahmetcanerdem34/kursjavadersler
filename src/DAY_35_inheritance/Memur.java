package DAY_35_inheritance;

public class Memur extends Personel{
	
	public int maas;


	public Memur() {
		//super();
		System.out.println("child class parametresiz constructor calýþtý");
	}
	
	public Memur(int maas) {
		super("Seher",6000);
		System.out.println("child class parametreli constructor calýþtý");
	}

	
	
	
	
	
	/*
	 * ýnheritance  da constructorda oluþturduðumuzda javanýn otomatik olarak cosnructora koyduðu super kewword onemlidir
	 * 
	 *super() keyword default constructor gibidir. biz görmesek de calýþýr, ancak yerine baþka bir keyword yazarsak etkisiz hale gelir
	 */
    public static void main(String[] args) {
		
		Memur obj1 = new Memur(2400);

	}







	
	
}
