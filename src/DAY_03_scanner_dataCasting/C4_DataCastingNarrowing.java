package DAY_03_scanner_dataCasting;

public class C4_DataCastingNarrowing {

	public static void main(String[] args) {
		
	//double bir de�i�ken olu�turual�m �nce bunu int e sonra byte �evirelim
		
		
		double numDouble=15;//15.23 yazarsak double int e �eviriken fazlal��� atar ondal�kl� k�sm�
		
		
		//int numInteger=numDouble;//itiraz etti, java �eviremiyorum double inte
		//�imdi numDouble nin yan�na (int) parantez i�inde bunu yazarsam java bunu okur ama veri silinme sorumlulu�unu size veririr
		
		int numInt=(int) numDouble;
		
		System.out.println("integer de�i�ken de�eri :" + numInt);
		//integer de�i�ken de�eri :15
		
		byte numByte=(byte) numInt;
		//daha dar narrow bir data tipine �evirirken e�er data tipinin s�n��rndan b�y�kse
		//negatif en k���kten tekrar b�y��e do�ru saymaya devam eder
		
		System.out.println("byte de�ei�ken de�eri :" + numByte);
		//byte de�ei�ken de�eri :15

	}

}
