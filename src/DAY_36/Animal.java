package DAY_36;

public class Animal {
	//method olu�tural�m
	
	public void ses() {//buras� void oldu�u m�ddet�e cat inkide void olmak zorundad�r
		System.out.println("hayvanlar ses ��kar�r");
	}
	protected  int add() {//ba�taki public i silersek default oluyor//buras� defaultken cat public i kabul eder
						//buras� defaultken, cat public protekted ve default olmay� kavul eder, private yi etmez
						//buras� protected iken
		return 3+4;
	}
	public Integer multply() {
		return 3*4;
		
	}
	
	public Animal create() {//burada Animal Class �n� return type olarak kulland�k, kullanabiliyoruz
		return new Animal();//buras� da bir obje �rettik, methodun �retti�i ile return type �rt��meli
							//return typ �n� class se�mi�seniz, o methodun �retti�i �ey objesi(Animal) olmal�
	
	//public final void eat() {
	//	System.out.println("yerler");
		
	}

}
