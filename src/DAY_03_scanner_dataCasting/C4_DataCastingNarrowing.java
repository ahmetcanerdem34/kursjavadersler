package DAY_03_scanner_dataCasting;

public class C4_DataCastingNarrowing {

	public static void main(String[] args) {
		
	//double bir deðiþken oluþturualým önce bunu int e sonra byte çevirelim
		
		
		double numDouble=15;//15.23 yazarsak double int e çeviriken fazlalýðý atar ondalýklý kýsmý
		
		
		//int numInteger=numDouble;//itiraz etti, java çeviremiyorum double inte
		//þimdi numDouble nin yanýna (int) parantez içinde bunu yazarsam java bunu okur ama veri silinme sorumluluðunu size veririr
		
		int numInt=(int) numDouble;
		
		System.out.println("integer deðiþken deðeri :" + numInt);
		//integer deðiþken deðeri :15
		
		byte numByte=(byte) numInt;
		//daha dar narrow bir data tipine çevirirken eðer data tipinin sýnýýrndan büyükse
		//negatif en küçükten tekrar büyüðe doðru saymaya devam eder
		
		System.out.println("byte deðeiþken deðeri :" + numByte);
		//byte deðeiþken deðeri :15

	}

}
