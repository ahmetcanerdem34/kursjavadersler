package DAY_03_scanner_dataCasting;

public class C3_DataCastingWiddening {

	public static void main(String[] args) {
		
		//
		
		//byte veri tipinde bir de�i�ken olu�turun , de�er atay�n
		//olu�turulan variable yi ad�m ad�m AUTOW�DEN�NG ile geni�letin
		
		//byte yapal�m
		byte numByte=34;
		System.out.println("byte de�i�ken de�eri :" + numByte);
		//art�n�n soltaraf� mat i�lemi i�in burdaki art� toplar, str,ingse birle�tirir
		//int de�i�ken de�eri :34
		//byte de�i�ken de�eri :34
		
		
		//short yapal�m
		short numShort= numByte; //burda ne yapt�= ba�ta verilen de�eri kullanmak istiyorum, java numByte yi ald� de�eri shorta atad�
		System.out.println("short de�i�ken de�eri :" + numShort);
		//ja �ikayet etmedi, auto widening yap�p shorta yani geni�e atad�
		//short de�i�ken de�eri :34
		
		
		//int yapal�m
		int numInteger=numShort;//yine java itiraz etmedi, k����� b�y�ye atad�
		System.out.println("int de�i�ken de�eri :"+ numInteger);
		//int de�i�ken de�eri :34
		
		
		//float yapal�m
		float numFloat=numInteger;
		System.out.println("float de�i�ken de�eri : " + numFloat);
		//float de�i�ken de�eri : 34.0
		
		
		//double yapal�m
		double numDouble=numFloat;
		System.out.println("double de�i�ken de�eri : " + numDouble);
		//double de�i�ken de�eri : 34.0
		
		
		//byte yi do�rudan double de yapabilirdik, di�erlerini de k���kten b�y�ge atlayarakta atayabilirdik
		
//		byte de�i�ken de�eri :34
//		short de�i�ken de�eri :34
//		int de�i�ken de�eri :34
//		float de�i�ken de�eri : 34.0
//		float de�i�ken de�eri : 34.0

		
		
		
		

	}

}
