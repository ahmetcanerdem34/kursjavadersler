package DAY_03_scanner_dataCasting;

public class C8_DataCastingOdevS1 {

	public static void main(String[] args) {
		
		
		//soru 1: byte veri tipinde bi deðiþken oluþturun short int float ve double tiplerinde dðiþken oluþturarak widening yapýn
		
		
		byte numByte=34;
		System.out.println("byte deðiþken deðeri :" + numByte);
		
		
		short numShort=numByte;
		System.out.println("short deðiþkeni :"+numShort);
		
		int numInteger=numShort;
		System.out.println("ýnt deðiþken deðeri :" + numInteger);
		
		float numFloat=numInteger;
		System.out.println("float deðiþken deðieri :" +numFloat);
		
		double numDouble=numFloat;
		System.out.println("double deðiþken deðeri :" +numDouble);
//		byte deðiþken deðeri :34
//		short deðiþkeni :34
//		ýnt deðiþken deðeri :34
//		float deðiþken deðieri :34.0
//		double deðiþken deðeri :34.0


		
		
		

	}

}
