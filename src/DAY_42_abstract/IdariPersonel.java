package DAY_42_abstract;

public abstract class IdariPersonel extends Personel{
	//extends personel yazarak Abstruct personele concrete bir child olu�turdum
	//ve java CTE verdi
	//cozum olarak 2 ihtimal var
	//1 unimplement(uyarlanma��) methodlar� uyarla
	//2- yada personel class�ndan abstruct kelimesini kald�r
	//bu class�n �a�l��abilmesi i�in 2 i�lemden birini yapmak zorundayu�z

	public static void main(String[] args) {
		
		

	}
	//concrete bir class da abstract bir method olabilir mi?
	//abstract bir method sadece abstract bir bir class da olu�turulabilir

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
