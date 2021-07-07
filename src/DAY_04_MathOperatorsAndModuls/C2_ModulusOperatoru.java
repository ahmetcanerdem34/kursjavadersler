package DAY_04_MathOperatorsAndModuls;

public class C2_ModulusOperatoru {

	public static void main(String[] args) {
		
		//modulus bir bölme iþleminde kalaný veriri
		
		//15 tek mi çift mi, 
		//15 i 2 ye böldüðümde kaln 1 ise tek, kalna sýfýr ise çift
		
		
		int kalan=15%4;
		System.out.println(kalan);//3
		
		System.out.println(26 % 8);// kaln 2
		
		//856 sayýsýnýn birler basamðý kaçtýr
		
		int birler=856 % 10;//birler basamðý modul 10 yaparak buluruz
		System.out.println("sayýnýn birler basamaðý :" + birler);
		//sayýnýn birler basamaðý :6
		
		//soru 856 sayýsýnýn onlar basamðý kaçtýr
		
		int onlar=(856/10) % 10;
		System.out.println("onalr basamðý : " + onlar);
		//onalr basamðý : 5
		
		int yuzler=856/100;
		System.out.println("sayýnýn yuzler basamðý : "+ yuzler);
		//sayýnýn yuzler basamðý : 8

	}

}
