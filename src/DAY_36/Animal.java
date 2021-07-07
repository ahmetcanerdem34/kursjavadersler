package DAY_36;

public class Animal {
	//method oluþturalým
	
	public void ses() {//burasý void olduðu müddetçe cat inkide void olmak zorundadýr
		System.out.println("hayvanlar ses çýkarýr");
	}
	protected  int add() {//baþtaki public i silersek default oluyor//burasý defaultken cat public i kabul eder
						//burasý defaultken, cat public protekted ve default olmayý kavul eder, private yi etmez
						//burasý protected iken
		return 3+4;
	}
	public Integer multply() {
		return 3*4;
		
	}
	
	public Animal create() {//burada Animal Class ýný return type olarak kullandýk, kullanabiliyoruz
		return new Animal();//burasý da bir obje ürettik, methodun ürettiði ile return type örtüþmeli
							//return typ ýný class seçmiþseniz, o methodun ürettiði þey objesi(Animal) olmalý
	
	//public final void eat() {
	//	System.out.println("yerler");
		
	}

}
