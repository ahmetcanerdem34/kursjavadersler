package DAY_03_scanner_dataCasting;

public class C9_DataCastingOdevS2 {

	public static void main(String[] args) {
	
		//Soru 2: int veri turunde bir de�i�ken olu�turun ve ad�m ad�m narrowing yap�n
		
		
		int numInteger=23;
		
		short numShort=(short) numInteger;
		System.out.println("short de�i�ken de�eri :"+numShort);
		
		byte numByte=(byte)numInteger;
		System.out.println("byte de�i�ken de�eri :" + numByte);
		
		//soru 3: float data turunde bir variable olustur yazd�r
		
		float numFloat=34.5f;
		System.out.println("float veri de�i�ken de�eri :" + numFloat);
		//float veri de�i�ken de�eri :34.5

	
		
		//soru:4 double 255.36 say��sn� int a ve sonra olusturdu�unuz int say�y� byte cevirip yazd�r�n
		
		double numDouble=255.36;
		
		int numInteger1=(int)numDouble;
		byte numByte1=(byte)numInteger1;
		
		System.out.println("byte de�i�ken de�eri :" +numByte1);
		//byte de�i�ken de�eri :-1
		
		
		//soru 5: integer 2 say�y� birbirine boldurun
		
		int sayi1=45;
		int sayi2=5;
		int bolum=sayi1/sayi2;
		sayi1/=5;
		System.out.println("iki int de�i�kenin birbirine b�l�m� : " + bolum);
		//iki int de�i�kenin birbirine b�l�m� : 9
		
	
		//soru 6: int bir say�y� doble bir say�ya boldurun yazd�r�n
		
		int intnum=345;
		double doublenum=245.65;
		System.out.println("int bir say�n�n double bir sayy�ya b�l�m� :" +intnum/doublenum);
		//int bir say�n�n double bir sayy�ya b�l�m� :1.404437207408915
		
		
//		short de�i�ken de�eri :23
//		byte de�i�ken de�eri :23
//		float veri de�i�ken de�eri :34.5
//		byte de�i�ken de�eri :-1
//		iki int de�i�kenin birbirine b�l�m� : 9
//		int bir say�n�n double bir sayy�ya b�l�m� :1.404437207408915
		
			
		
	}

}
