package DAY_36;

public class Cat extends Animal{
	
	@Override//buna annotation denir//java diyorki sen ovverriding yaparken hata yapabilirsin, 
									//buraya bunu yazarssan ben kontrol ederim demi� oluyoruz, kontrol eder rapor verir. 
	                               
	public void ses() { //ses1 yazsam jac ahat verir, ses(int i) yazsam yine k�zar ne zamn k�zmaz yukardaki annotaionu kald�r�nca
						//java derki bu yeni bir methot olu�turuyor o zamn izin vereyime der
		System.out.println("kediler miyavlar");
	}

	@Override
	    public int add() {//animal default ken bu ras� public i kabul ediyor
					   //animal default iken cat protectec yaz�nca kabul ediyor
						//animal default iken buras�da default kabul ediyor
						//animal defaultken cat private hat veriyor
		
						//animal protected iken buras� public i kabul ediyor
						//animal protected iken buras� protected i kabul ediyor
						//animal protected iken buras� default i kabul etmiyor
						//animal protected iken buras� private i kabul etmiyor
				//**burdan �u anl��l�yor cocuk babas�n� s�n�rland�ramz yani babadan daha gnei� olamaz
		return 1+2;
	}

	@Override
	public Integer multply() {//return typ �m�z animaldaki gibi int,,animal int iken buray� cocu�u short yapal�m dah k���k, �ikayet etti
							//long da da hata verdi, prpimitivelerde ayn� olmay� kavul ediyor
		return 1*2;
	}

	@Override
	public Cat create() {//buray� Cat yazsam kabul eder
		return new Cat();//buray�da cat yapsam kabul eder ��nk� an�mal �n �ocu�u
						//peki yukarda yapt�klar�m�z niye kabul etmeti, ��nk� jacadaprimitive ler aras�nda bab cocuk li�kisi yok
	
	//@Override=0bunu yazma���m muddet�e java bize haat vermez= static methodlar ovverride edilemez
	//public final void eat() {
		//System.out.println("kediler sut i�er");
		
	}
	

}
