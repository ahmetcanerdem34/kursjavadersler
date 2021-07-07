package DAY_04_MathOperatorsAndModuls;

public class C1_MatematikselÝslemler {

	public static void main(String[] args) {

		
		int num1=38 / 2 *(4 + 3) * 2;
		System.out.println(num1);
		
		int num2=8 + 2 *(14 -6 / 2) -12;
		System.out.println(num2);
		
		int num3=10;
		
		double num4=num1 * num2 / num3;
		//burdaki iþlemin sonucu normalde 478.8 olmalýydý
		//neden 478.0 oldu=saðdaki 3 iþlemde int= java bunu int olarak hesapladý=478(int)
		//sonra num4 e essayn edecek am burasý double, double int den geniþ olduðu için 
		//478 i double atarken nokta.0 koyar
		
		System.out.println(num4);
		//478.0
		
		
		double num5=24.56;
		double num6=14.2;
		double num7=num5 / num6;
		System.out.println(num7);
		//1.7295774647887323
		
		System.out.println(num5/num3);//hangiis geniþse ona göre iþlem yapýyor
		//2.456
		
		
		
		double num8=(double) num1 * num2 / num3;//478.8 bulmalýyým=sonucunu  virgüllü görmke istiyorsan baþýna double yazdýr
		System.out.println(num8);
		//478.8

	}

}
