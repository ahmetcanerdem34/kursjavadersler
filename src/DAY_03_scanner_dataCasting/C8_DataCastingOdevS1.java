package DAY_03_scanner_dataCasting;

public class C8_DataCastingOdevS1 {

	public static void main(String[] args) {
		
		
		//soru 1: byte veri tipinde bi de�i�ken olu�turun short int float ve double tiplerinde d�i�ken olu�turarak widening yap�n
		
		
		byte numByte=34;
		System.out.println("byte de�i�ken de�eri :" + numByte);
		
		
		short numShort=numByte;
		System.out.println("short de�i�keni :"+numShort);
		
		int numInteger=numShort;
		System.out.println("�nt de�i�ken de�eri :" + numInteger);
		
		float numFloat=numInteger;
		System.out.println("float de�i�ken de�ieri :" +numFloat);
		
		double numDouble=numFloat;
		System.out.println("double de�i�ken de�eri :" +numDouble);
//		byte de�i�ken de�eri :34
//		short de�i�keni :34
//		�nt de�i�ken de�eri :34
//		float de�i�ken de�ieri :34.0
//		double de�i�ken de�eri :34.0


		
		
		

	}

}
