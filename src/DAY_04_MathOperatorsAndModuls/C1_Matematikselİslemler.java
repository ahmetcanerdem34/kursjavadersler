package DAY_04_MathOperatorsAndModuls;

public class C1_Matematiksel�slemler {

	public static void main(String[] args) {

		
		int num1=38 / 2 *(4 + 3) * 2;
		System.out.println(num1);
		
		int num2=8 + 2 *(14 -6 / 2) -12;
		System.out.println(num2);
		
		int num3=10;
		
		double num4=num1 * num2 / num3;
		//burdaki i�lemin sonucu normalde 478.8 olmal�yd�
		//neden 478.0 oldu=sa�daki 3 i�lemde int= java bunu int olarak hesaplad�=478(int)
		//sonra num4 e essayn edecek am buras� double, double int den geni� oldu�u i�in 
		//478 i double atarken nokta.0 koyar
		
		System.out.println(num4);
		//478.0
		
		
		double num5=24.56;
		double num6=14.2;
		double num7=num5 / num6;
		System.out.println(num7);
		//1.7295774647887323
		
		System.out.println(num5/num3);//hangiis geni�se ona g�re i�lem yap�yor
		//2.456
		
		
		
		double num8=(double) num1 * num2 / num3;//478.8 bulmal�y�m=sonucunu  virg�ll� g�rmke istiyorsan ba��na double yazd�r
		System.out.println(num8);
		//478.8

	}

}
