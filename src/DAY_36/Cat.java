package DAY_36;

public class Cat extends Animal{
	
	@Override//buna annotation denir//java diyorki sen ovverriding yaparken hata yapabilirsin, 
									//buraya bunu yazarssan ben kontrol ederim demiþ oluyoruz, kontrol eder rapor verir. 
	                               
	public void ses() { //ses1 yazsam jac ahat verir, ses(int i) yazsam yine kýzar ne zamn kýzmaz yukardaki annotaionu kaldýrýnca
						//java derki bu yeni bir methot oluþturuyor o zamn izin vereyime der
		System.out.println("kediler miyavlar");
	}

	@Override
	    public int add() {//animal default ken bu rasý public i kabul ediyor
					   //animal default iken cat protectec yazýnca kabul ediyor
						//animal default iken burasýda default kabul ediyor
						//animal defaultken cat private hat veriyor
		
						//animal protected iken burasý public i kabul ediyor
						//animal protected iken burasý protected i kabul ediyor
						//animal protected iken burasý default i kabul etmiyor
						//animal protected iken burasý private i kabul etmiyor
				//**burdan þu anlþýlýyor cocuk babasýný sýnýrlandýramz yani babadan daha gneiþ olamaz
		return 1+2;
	}

	@Override
	public Integer multply() {//return typ ýmýz animaldaki gibi int,,animal int iken burayý cocuðu short yapalým dah küçük, þikayet etti
							//long da da hata verdi, prpimitivelerde ayný olmayý kavul ediyor
		return 1*2;
	}

	@Override
	public Cat create() {//burayý Cat yazsam kabul eder
		return new Cat();//burayýda cat yapsam kabul eder çünkü anýmal ýn çocuðu
						//peki yukarda yaptýklarýmýz niye kabul etmeti, çðnkü jacadaprimitive ler arasýnda bab cocuk liþkisi yok
	
	//@Override=0bunu yazmaýðým muddetçe java bize haat vermez= static methodlar ovverride edilemez
	//public final void eat() {
		//System.out.println("kediler sut içer");
		
	}
	

}
