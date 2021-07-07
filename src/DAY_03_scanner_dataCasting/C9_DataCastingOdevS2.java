package DAY_03_scanner_dataCasting;

public class C9_DataCastingOdevS2 {

	public static void main(String[] args) {
	
		//Soru 2: int veri turunde bir deðiþken oluþturun ve adým adým narrowing yapýn
		
		
		int numInteger=23;
		
		short numShort=(short) numInteger;
		System.out.println("short deðiþken deðeri :"+numShort);
		
		byte numByte=(byte)numInteger;
		System.out.println("byte deðiþken deðeri :" + numByte);
		
		//soru 3: float data turunde bir variable olustur yazdýr
		
		float numFloat=34.5f;
		System.out.println("float veri deðiþken deðeri :" + numFloat);
		//float veri deðiþken deðeri :34.5

	
		
		//soru:4 double 255.36 sayýýsný int a ve sonra olusturduðunuz int sayýyý byte cevirip yazdýrýn
		
		double numDouble=255.36;
		
		int numInteger1=(int)numDouble;
		byte numByte1=(byte)numInteger1;
		
		System.out.println("byte deðiþken deðeri :" +numByte1);
		//byte deðiþken deðeri :-1
		
		
		//soru 5: integer 2 sayýyý birbirine boldurun
		
		int sayi1=45;
		int sayi2=5;
		int bolum=sayi1/sayi2;
		sayi1/=5;
		System.out.println("iki int deðiþkenin birbirine bölümü : " + bolum);
		//iki int deðiþkenin birbirine bölümü : 9
		
	
		//soru 6: int bir sayýyý doble bir sayýya boldurun yazdýrýn
		
		int intnum=345;
		double doublenum=245.65;
		System.out.println("int bir sayýnýn double bir sayyýya bölümü :" +intnum/doublenum);
		//int bir sayýnýn double bir sayyýya bölümü :1.404437207408915
		
		
//		short deðiþken deðeri :23
//		byte deðiþken deðeri :23
//		float veri deðiþken deðeri :34.5
//		byte deðiþken deðeri :-1
//		iki int deðiþkenin birbirine bölümü : 9
//		int bir sayýnýn double bir sayyýya bölümü :1.404437207408915
		
			
		
	}

}
