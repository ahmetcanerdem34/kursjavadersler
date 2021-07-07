package DAY_03_scanner_dataCasting;

public class C3_DataCastingWiddening {

	public static void main(String[] args) {
		
		//
		
		//byte veri tipinde bir deðiþken oluþturun , deðer atayýn
		//oluþturulan variable yi adým adým AUTOWÝDENÝNG ile geniþletin
		
		//byte yapalým
		byte numByte=34;
		System.out.println("byte deðiþken deðeri :" + numByte);
		//artýnýn soltarafý mat iþlemi için burdaki artý toplar, str,ingse birleþtirir
		//int deðiþken deðeri :34
		//byte deðiþken deðeri :34
		
		
		//short yapalým
		short numShort= numByte; //burda ne yaptý= baþta verilen deðeri kullanmak istiyorum, java numByte yi aldý deðeri shorta atadý
		System.out.println("short deðiþken deðeri :" + numShort);
		//ja þikayet etmedi, auto widening yapýp shorta yani geniþe atadý
		//short deðiþken deðeri :34
		
		
		//int yapalým
		int numInteger=numShort;//yine java itiraz etmedi, küçüðü büyüye atadý
		System.out.println("int deðiþken deðeri :"+ numInteger);
		//int deðiþken deðeri :34
		
		
		//float yapalým
		float numFloat=numInteger;
		System.out.println("float deðiþken deðeri : " + numFloat);
		//float deðiþken deðeri : 34.0
		
		
		//double yapalým
		double numDouble=numFloat;
		System.out.println("double deðiþken deðeri : " + numDouble);
		//double deðiþken deðeri : 34.0
		
		
		//byte yi doðrudan double de yapabilirdik, diðerlerini de küçükten büyüge atlayarakta atayabilirdik
		
//		byte deðiþken deðeri :34
//		short deðiþken deðeri :34
//		int deðiþken deðeri :34
//		float deðiþken deðeri : 34.0
//		float deðiþken deðeri : 34.0

		
		
		
		

	}

}
