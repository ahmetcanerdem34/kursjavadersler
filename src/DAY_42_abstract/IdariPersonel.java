package DAY_42_abstract;

public abstract class IdariPersonel extends Personel{
	//extends personel yazarak Abstruct personele concrete bir child oluþturdum
	//ve java CTE verdi
	//cozum olarak 2 ihtimal var
	//1 unimplement(uyarlanmaýþ) methodlarý uyarla
	//2- yada personel classýndan abstruct kelimesini kaldýr
	//bu classýn çaýlýþabilmesi için 2 iþlemden birini yapmak zorundayuýz

	public static void main(String[] args) {
		
		

	}
	//concrete bir class da abstract bir method olabilir mi?
	//abstract bir method sadece abstract bir bir class da oluþturulabilir

	@Override
	public void maasHesapla() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mesaiHesapla() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ozelSigorta() {
		// TODO Auto-generated method stub
		super.ozelSigorta();
	}

}
