package DAY_12_�ndexOf;

public class C1_EqualsEsitEsitFarki {

	public static void main(String[] args) {


		String str1="Ali Can";
		String str2=str1 + "";//Ali Can
		System.out.println(str1==str2);//false---->//== e�it e�it hem stringe bakar, hemde adrese bakar
		System.out.println(str1.equals(str2));//true---->	//equals sadece stringe bakar
		
		/*
		 * false
		 * true
		 */
		//neden b�yle oldu ild dersin ilk konusu referenco of objects konusu
		
		//java da 2 haf�za vard�r stack k���k---->nesleri tutar= primitive
		// heap b�y�k
		
		//== e�it e�it hem stringe bakar, hemde adrese bakar
		//equals sadece stringe bakar
		//str1 ile str2 yi == kar��la�t�r�sak de�erler ayn� fakat adresleri farkl� olldu�u i�in false d�nder
		
		
		String str3="Ali Can";
		str3=str1;
		System.out.println(str1==str3);
		System.out.println(str1.equals(str3));
		

	}

}
