package DAY_35_inheritance;

public class Memur extends Personel{
	
	public int maas;


	public Memur() {
		//super();
		System.out.println("child class parametresiz constructor cal��t�");
	}
	
	public Memur(int maas) {
		super("Seher",6000);
		System.out.println("child class parametreli constructor cal��t�");
	}

	
	
	
	
	
	/*
	 * �nheritance  da constructorda olu�turdu�umuzda javan�n otomatik olarak cosnructora koydu�u super kewword onemlidir
	 * 
	 *super() keyword default constructor gibidir. biz g�rmesek de cal���r, ancak yerine ba�ka bir keyword yazarsak etkisiz hale gelir
	 */
    public static void main(String[] args) {
		
		Memur obj1 = new Memur(2400);

	}







	
	
}
